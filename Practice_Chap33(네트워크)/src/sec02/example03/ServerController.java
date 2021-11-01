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
import javafx.stage.Stage;

//서버와 클라이언트로 동작하기 때문에 AppMain을 따로 만들지 않았다.
public class ServerController extends Application implements Initializable{
	//중첩 클래스
	class Client{
		Socket socket;
		public Client(Socket socket) {
			this.socket = socket;
			receive();
		}
		
		//데이터를 받는 메서드 코드 작성
		public void receive() {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
				try {
					while(true) {
						byte[] byteArr = new byte[1000];
							InputStream inputStream = socket.getInputStream();
							
							int readCount = inputStream.read(byteArr); //여기서 블로킹 상태
							
							//클라이언트가 정상 종료될 때 = Socket을 close() 되면 -1를 리턴한다
							if(readCount == -1) {
								throw new IOException();
							}
							String data = "[클라이언트의 요청 처리 : " + socket.getRemoteSocketAddress() +
												" : " + Thread.currentThread().getName() + "]";
							Platform.runLater( () -> displayText(data));
							
							String message = new String(byteArr, 0, readCount, "UTF-8");
							
							//서버에 연결된 클라이언트 전부에게 보내기 위한 코드
							for(Client client : clientList) {
								client.send(message);
							}
						} 
					}catch (Exception e) {
						try{
							clientList.remove(Client.this);
						
						String data = "[클라이언트가 끊겼습니다. : " + socket.getRemoteSocketAddress() +
											Thread.currentThread().getName() + "]";
						Platform.runLater(()-> displayText(data));
						socket.close();
						} catch (IOException ie) {}
					}
				}
			};
			executorService.submit(runnable);
		}
		
		//데이터를 보내는 메서드 코드
		public void send(String data) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);//블로킹상태
						outputStream.flush();
						
					} catch (Exception e) {
						try {
							String data = "[클라이언트가  연결이 끊겼습니다. : " + socket.getRemoteSocketAddress() +
												Thread.currentThread().getName() + "]";
							Platform.runLater(()-> displayText(data));
							clientList.remove(Client.this);
							socket.close();
						} catch (IOException e1) {}
					}
					
				}
			};
			executorService.submit(runnable);
		}
	}
		
		
	@FXML private TextArea txtDisplay;
	@FXML private Button btnStartStop;
	
	///////////////////////////////////
	
	ExecutorService executorService; //스레드 풀 객체를 만들기 위한 선언
	ServerSocket serverSocket; //서버 소켓
	List<Client> clientList = new Vector<Client>(); //클라이언트를 관리하기 위한 컬렉션 선언
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//시작
		Parent root = FXMLLoader.load(getClass().getResource("server.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("채팅 서버");
		primaryStage.show();
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//이벤트 처리
		txtDisplay.setEditable(false);
		//버튼으로부터 서버의 시작과 중단을 알리는 코드
		btnStartStop.setOnAction(event->{
				if(btnStartStop.getText().equals("start")) {
					startServer();
				} else if(btnStartStop.getText().equals("stop")) {
					stopServer();
				}
		});
	}
	
	
	//로그를 남기기 위해서 textarea에 텍스트를 표시하는 메서드
	public void displayText(String data) {
		txtDisplay.appendText(data + "\n");
	}
	
	//서버를 시작하기 위한 코드 작성
	public void startServer() {
		//스레드 풀을 생성
		executorService = Executors.newFixedThreadPool(10);
		try {
			serverSocket = new ServerSocket();
			//서버 소켓 바인딩
			serverSocket.bind(new InetSocketAddress("localhost", 7777));
		} catch (IOException e) {
			if(!serverSocket.isClosed()) {
				stopServer();
				return;
			}
		}
		//서버에서 accept()에서 블로킹이 일어나기 때문에 따로 하나의 스레드가 담당하도록 만든다.
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				//일반스레드가 UI를 변경하면 예외가 발생하므로 runLater()를 사용한다. 
				Platform.runLater(()->{  //javaFX Application 스레드가 UI변경
					displayText("서버가 시작되었습니다.");
					btnStartStop.setText("stop");
				});
				while(true) {
					try {
						//클라이언트의 연결이 오면 수락을 하고 통신용 소켓을 리턴한다.
						Socket socket = serverSocket.accept();
						String data = "[연결 수락 : " + socket.getRemoteSocketAddress() + " : " 
													+ Thread.currentThread().getName() + "]";
						Platform.runLater(()->displayText(data));
						
						Client client = new Client(socket);
						
						//연결된 클라이언트를 추가하는 코드
						clientList.add(client);
						
						Platform.runLater(()->{
							displayText("[연결된 클라이언트의 수 : " + clientList.size() + "]");
						});
					} catch (IOException e) {
						if(!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		//스레드풀에 있는 작업큐에다가 Runnable작업 객체를 넣어두면 executorservice의 스레풀이 하나의 스레드가 도맡아서 처리
		executorService.submit(runnable);
	}
	
	
	//서버를 중지하는 코드를 작성한다.
	public void stopServer() {
		try {
			Iterator<Client> iterator = clientList.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
				}
			
			//서버 소켓 닫기
			if(serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			//스레드 풀 종료
			if(executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(()->{
				displayText("서버가 종료 되었습니다.");
				//서버 재시작
				btnStartStop.setText("start");
			});
			} catch (IOException e) {
		}
	}
}
	
	
