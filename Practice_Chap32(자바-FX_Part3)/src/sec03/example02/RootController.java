package sec03.example02;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable {
	
	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	//결과 값이 없는 Task를 만들기 위해서 void타입을 썻다
	private Task<Void> task;
	//Void는 클래스
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//이벤트 처리 부분 등록
		btnStart.setOnAction(e->BtnStart(e));
		btnStop.setOnAction(e->BtnStop(e));
	}
	
	public void BtnStart(ActionEvent e) {
		System.out.println("BtnStart()실행 스레드 명 : " + Thread.currentThread().getName());
		
		task = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				System.out.println("call()실행 스레드 명 : " + Thread.currentThread().getName());
				for(int i=0; i<=100; i++) {
					//취소가 되었는지 계속 감시 하는 코드를 아래와 같이 작성함
					if(this.isCancelled()) {
						this.updateMessage("취소됨");
						break;
					}
					//updaeProgressms ProgressBar, ProgressIndicator에만 국한되어있다.
					this.updateProgress(i, 100); //i는 1~100까지도는데 진행값을 말하고, 100은 완료값
					//작업이 완료가 되면 i값을 lblWorkDone에 뿌려준다
					this.updateMessage(String.valueOf(i)+ "%");
					
					//call()에는 예외처리가 되어 있다. 하지만 지금은 외부에서 interrupt()를 호출할 수 있기 때문에
					//task가 취소되도록 만듬
					try {
					Thread.sleep(100);
					} catch (InterruptedException e) {
						if(this.isCancelled()) {
							this.updateMessage("인터럽트로 인한 취소");
//							break;
						}
					}
				}
				return null;
			}
		};
		
		//속성 바인딩 코드
		//progressBar컨트롤의 속성과 task의 updateProgress의 progress속성과 바인딩 처리를 한다.
		//이렇게 해주면 progressBar의 진행정도가 변한다.
		progressBar.progressProperty().bind(task.progressProperty());
		//위와 같이 Label컨트롤의 속성과 updateMessage의 속성을 바인딩한다.
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		//Task<V> Runnable클래스를 구현을 하기 때문에 스레드의 매개값으로 들어갈 수 있다.
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	public void BtnStop(ActionEvent e) {
		System.out.println("BtnStop()실행 스레드 명 : " + Thread.currentThread().getName());
		task.cancel();
	}
}
