package sec01.example03;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//예제의 목적
//1. Stage가 무대라는 것 즉 윈도우 창에 해당한다
//2. Stage가 설정되면 장면 즉 , Scene을 만들어서 설정해준다.
//3. Scene을 설정할 때 매개값은 통상 Parent클래스 오는데,추상클래스이므로 하위 컨터이너 클래스를 넘겨준다.
//4. Parent클래스를 상속 받는 컨테이너에 각종 컨트롤(내용)을 추가 배치한다.

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//VBox는 컨테이너클래스의 한 종류이며  Vertical Box (수직으로 내용들을 배치)
		//HBox는 수평으로 배치
		VBox root = new VBox();
		root.setPrefWidth(500); //넓이 설정
		root.setPrefHeight(350); //높이 설정
		root.setAlignment(Pos.CENTER); //중앙 정렬
		root.setSpacing(20); //배치 되는 컨트롤들 과의 간격을 20px로 하겠다
		
		Label label = new Label();
		label.setText("안녕! 자바FX");
		label.setFont(new Font(50)); //글자 크기
		
		Button button = new Button();
		button.setText("확인");
		//버튼 이벤트 처리
		button.setOnAction(event->Platform.exit()); //람다식으로 버튼을 종료되도록 간단히 이벤트 처리함 
		//익명 구현 객체를 직접 만들어서 이벤트 핸들링을 함(함수적 인터페이스)
		//EventHandler인터페이스는 handle()메서드를 하나 가지기 때문에 람다식이 사용가능하다.
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("윈도우 종료");
//				//Platform.exit();
//				//System.exit(0);
//			}
//		});
		
		//VBOX라는 컨테이너에 컨트롤들을 배치한다.
		ObservableList<Node> list = root.getChildren(); //배열 계열
		list.add(new Label("HELLO!!!"));
		list.add(label);
		list.add(button);
		//root.getChildren().add(label); //이렇게 사용 가능
		
		//Scene의 생성자의 매개값은 Parent라는 추상클래스이다.
		//VBOX가 Parent를 상속받으므로 Scene 매개값으로 사용가능하다.
		//Scene의 매개값은 통상 컨테이너가 들어간다.
		Scene scene = new Scene(root);
		primaryStage.setScene(scene); //장면 추가
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

	
	
}
