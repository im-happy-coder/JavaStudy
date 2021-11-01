package sec02.example01;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//프로그램적 레이아웃
				//컨테이너 설정 및 각종 컨트롤들을 생성하고 배치하는 것이 전부 자바 코드로 이루어진다.
				
				HBox hBox = new HBox();  // HBOX가 루트컨테이너이다.
				hBox.setPadding(new Insets(10,10,10,10)); //안쪽 여백
				hBox.setSpacing(10); //컨트롤간 간격
				
				
				//글자를 입력 받을 수 있는 컨트롤이다.
				TextField textField = new TextField();
				textField.setPrefWidth(200); //가로 길이
				
				Button button = new Button();
				button.setText("확인");
				
				//컨테이너에 컨트롤들을 배치하기 위해서 이다
				ObservableList<Node> list = hBox.getChildren();
				list.add(textField);
				list.add(button);		
				
				//화면에 루트컨테이너(Parent)객체(추상클래스) HBox는 Parent가 조상이기 때문에 매개변수로 사용가능하다.
				Scene scene = new Scene(hBox); //장면 설정
				primaryStage.setTitle("AppMain");  //윈도우 타이틀 설정
				primaryStage.setScene(scene);
				primaryStage.show();
				
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
