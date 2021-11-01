package sec01.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


//FXML파일당 하나의 컨트롤러만 지정을 한다. 각 종 이벤트에 대한 처리 내용을 기술하는데, 반드시 해야할 것은 Initializable인터페이스를 구현해야 한다.
public class RootController implements Initializable {
	public RootController() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("RootController생성자 호출");
	}
	//root.fxml파일에 fx:id로 설정한 버튼3개의 참조를 얻어와서 컨트롤러에서 사용을 한다.
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	
	
//	initialize()는 AppMain.java파일이 로딩이 될 때 FXMLLoader.load()가 실행될때 
//	RootController객체가 만들어지고, FXML파일에 선언되어 있는 컨트롤에 참조가 이루어진 다음
//	initialize메서드를 자동으로 JavaFxApplicationThread가 자동으로 호출해준다.
	
	
	//보통 initialize()는 이벤트처리 코드의 내용이 짧든 길든 간에 직접 작성을 해도 되지만 코드가 난잡해진다.
	//initialize()안에서는 이벤트 등록만 해주고 실질적인 내용을 담당하는 메서드들은 외부로 빼서 메서드를 작성하는 것이 코드의 가식성과 바람직한 방법이다.
	//initialize()는 UI변경이나 이벤트 등록을 할때만 쓴다.
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("initialize메서드 호출");
		
		//익명 구현 객체를 이용한 코드
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				btn1Handle(event);
			}
		});
		
		//람다식으로 이벤트를 등록하는 코드
		btn2.setOnAction(event->btn2Handle(event));
		btn3.setOnAction(event->btn3Handle(event));
		
	}
	//btn1의 실질적인 이벤트 처리 메서드를 분리한다.
	public void btn1Handle(ActionEvent event) {
		System.out.println("btn1클릭되었습니다.");
	}
	
	//btn2의 실질적인 이벤트 처리 메서드를 분리한다.
	public void btn2Handle(ActionEvent event) {
		System.out.println("btn2클릭되었습니다.");
	}
	//btn3의 실질적인 이벤트 처리 메서드를 분리한다.
	public void btn3Handle(ActionEvent event) {
		System.out.println("btn3클릭되었습니다.");
	}
	public void btn4Handle(ActionEvent event) {
		System.out.println("btn4클릭되었습니다.");
	}
	
	
}
