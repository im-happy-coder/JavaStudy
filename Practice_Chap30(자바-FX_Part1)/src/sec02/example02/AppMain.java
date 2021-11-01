package sec02.example02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//root.fxml에 작성된 데로 parent객체 즉 컨테이너와 컨트롤들을 가져와서 생성하라.
		Parent parent = (Parent)FXMLLoader.load(getClass().getResource("root.fxml")); //load는 Object를 가져와야한다.
		
		//씬(장면) 생성
		Scene scene = new Scene(parent);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
		
	}

}
