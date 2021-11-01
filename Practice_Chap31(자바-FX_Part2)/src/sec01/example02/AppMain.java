package sec01.example02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	public AppMain() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("AppMain생성자 호출");
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("Start메서드 호출");
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		
		Scene scene = new Scene(parent);
		primaryStage.setTitle("FXML이벤트처리");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
