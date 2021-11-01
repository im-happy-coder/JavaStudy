package sec01.example02;

import javafx.application.Application;
import javafx.stage.Stage;

//자바FX의 라이프 사이클(생명 주기)
public class AppMain extends Application {

	//실행스레드 : JavaFX Application Thread (제일 먼저 호출됨)
	public AppMain() {
		System.out.println("생성자 호출");
		System.out.println("생성자 스레드 명 : " + Thread.currentThread().getName());
	}
	
	
	//실헹스레드 : JavaFx-Launcher Thread
	@Override
	public void init() throws Exception {
		System.out.println("init() 실행");
		System.out.println("init() 스레드 명 : " + Thread.currentThread().getName());
	}
	
	//실행스레드 : JavaFX Application Thread
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start() 실행");
		System.out.println("start() 스레드 명 : " + Thread.currentThread().getName());		
		primaryStage.show();
	}
	
	//실행스레드 : JavaFX Application Thread
	//stop()는 윈도우 창에 X표시(종료)를 클릭 시에 자동으로 호출
	//Application P/G에서 종료 시에 수행해야할 코드 들을 주로 작성하면 된다. 
	@Override
	public void stop() throws Exception {
		System.out.println("stop() 실행");
		System.out.println("stop() 스레드 명 : " + Thread.currentThread().getName());	
	}
	public static void main(String[] args) {
		Application.launch(args);
		
		
	}

}
