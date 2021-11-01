package sec02.example03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//서버와 클라이언트로 동작하기 때문에 AppMain을 따로 만들지 않았다.
public class ClientController extends Application implements Initializable{
	
	@FXML TextArea txtDisplay;
	@FXML TextField txtInput;
	@FXML Button btnConn;
	@FXML Button btnSend;
	
	
	///////////////////////////////
	Socket socket;
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//시작
		Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("클라이언트");
		primaryStage.show();
		
	}
	
	
	//대화내용을 남기기 위해서 appendText를 사용함
	public void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		txtDisplay.setEditable(false);
		//텍스트 필드에 키보드로 엔터키를 입력을 했을 때 내용이 전송되도록 이벤트 처리 코드를 등록
		txtInput.setOnAction(e->send(txtInput.getText()));
		btnConn.setOnAction(e->{
			if(btnConn.getText().equals("start")) {
				startClient();
			} else if (btnConn.getText().equals("stop")) {
				stopClient();
			}
		});
		
		
		//새로운 클라이언트 창이 뜨면 send버튼을 비활성화
		btnSend.setDisable(true); //버튼 활성화를 막음
		btnSend.setOnAction(e->txtInput.getText());
	}
	
	public void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost", 7777));
					Platform.runLater(() -> {
						displayText("[연결 성공 : " + socket.getRemoteSocketAddress() + "]");
						//연결이 성공하면 start버튼을 stop으로 바꾸고, send버튼을 활성화 한다.
						btnConn.setText("stop");
						btnSend.setDisable(false);
					});
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[서버 통신 불가"));
					if(!socket.isClosed()) {
						stopClient();
					}
					return;
				}
				//클라이언트가 연결에 성공하면 데이터 수신을 먼저하기 위해서 receive()호출
				receive();
			}
		};
		thread.start();
	}
	public void stopClient() {
		try {
			Platform.runLater(()-> {
				displayText("[접속 끊음]");
				btnConn.setText("start");
				btnSend.setDisable(true);//비활성화
			});
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {}
	}
	
	public void send(String data) {
		//데이터를 전송하는 메서드
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					byte[] byteArr = data.getBytes("UTF-8");
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(byteArr); //블로킹 상태 발생
					outputStream.flush();
					Platform.runLater(() -> {
						displayText("[송신 완료] : " + data);
						//데이터를 보내고 나면 텍스트 필드 내용을 초기화
						txtInput.setText("");
					});
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[서버 통신 불가]"));
					stopClient();
				}
			}
		};
		thread.start();
	}
	
	public void receive() {
		//데이터를 계속적으로 받기 위해서 무한루프로 작성함.
		while(true) {
			try {
				byte[] byteArr = new byte[1000];
				InputStream inputStream = socket.getInputStream();
				
				//서버가 비정상적으로 종료했을 경우 IOExecption를 발생
				int readCount = inputStream.read(byteArr);
				
				//서버가 정상적으로 Socket의 close()호출 했을 때는 -1을 리턴
				if(readCount == -1) {
					throw new IOException();
				}
				
				//읽은 데이터를 디코딩
				String data = new String(byteArr, 0, readCount, "UTF-8");
				Platform.runLater(() -> displayText("[수신 완료] : " + data));
			}catch (Exception e) {
				//비정상적 종료 일 떄
				Platform.runLater(() -> displayText("[서버 통신 불가]"));
				stopClient();
				break;
			}
		}
	}
}
	
	
