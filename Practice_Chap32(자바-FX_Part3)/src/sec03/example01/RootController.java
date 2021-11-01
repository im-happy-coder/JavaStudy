package sec03.example01;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	
	@FXML private Label lblTime;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	private boolean stop; //플래그 변수
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//이벤트 처리 부분
		btnStart.setOnAction(e->BtnStart(e));
		btnStop.setOnAction(e->BtnStop(e));
		
	}
	
	public void BtnStart(ActionEvent e) {
		this.stop = false;
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				
//			}
//		});
		Thread thread = new Thread() {
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				while(!stop) {
					//계속 시스템의 시간을 얻어온다.
					String strTime = sdf.format(new Date());
					System.out.println("run()실행 스레드 명 : " + Thread.currentThread().getName());
					
					
					//작업스레드가 직접 UI를 변경하는 코드를 넣어보면 예외가 발생한다.
//					lblTime.setText(strTime);
//					System.out.println("현재 시간 : " + strTime);
					
					//작업스레드가 계속적으로 시스템으로 부터 시간을 얻어오고 그것을 이벤트 큐에 저장을 해주면
					//JavaFX Application Thread가 그 이벤트를 가져와서 Platform.runLater()를 실행한다.
					//하여, UI를 변경하는데 문제가 없다.
					Platform.runLater(()-> {
						System.out.println("runLater() 호출 됨");
						System.out.println("runLater()실행 스레드 명 : " + Thread.currentThread().getName());
						//UI변경 코드
						lblTime.setText(strTime);
					});
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		};
		thread.setDaemon(true); //메인스레드가 종료되면 모든 스레드가 종료됨
		thread.start();
	
	}
	public void BtnStop(ActionEvent e) {
		this.stop = true;
	}

}
