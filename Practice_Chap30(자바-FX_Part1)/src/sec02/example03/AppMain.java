package sec02.example03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		//두개의 여백을 주는 방법을 잘 이해할 필요가 있다.
		HBox hBox = new HBox();
//		hBox.setPadding(new Insets(20, 20, 20, 50)); //시계방향
//		Button button = new Button();
//		button.setPrefSize(100, 100);
		
		//마진 설정
		Button button = new Button();
		button.setPrefSize(100, 100);
		//HBox.setMargin를 호출할때 매개값으로 컨트롤을 주게되면,
		//컨트롤을 기준으로 마진(바깥여백)이 설정이된다.
		HBox.setMargin(button, new Insets(50,20,10,60)); //버튼을 기준으로 마진
		//패안마바(패딩은안쪽, 마진은 바깥여백)
		
		hBox.getChildren().add(button);
		Scene scene = new Scene(hBox);
		primaryStage.setTitle("여백");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
