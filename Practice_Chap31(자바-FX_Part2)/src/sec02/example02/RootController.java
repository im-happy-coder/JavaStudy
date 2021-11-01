package sec02.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class RootController implements Initializable {

	@FXML private TextArea textArea;
	@FXML private TextField textField;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//단방향 바인드 처리
		textArea.textProperty().bind(textField.textProperty());
		
		//단방향 바인드 해제
		textArea.textProperty().unbind();
		
		//양방향 바인드 처리
//		textArea.textProperty().bindBidirectional(textField.textProperty());
		
		//Bindings클래스를 이용하여 사용하는 것이 편하다.(양방향)
//		Bindings.bindBidirectional(textArea.textProperty(), textField.textProperty());
		//양방향 바인드 해제
		
//		Bindings.unbindBidirectional(textArea.textProperty(), textField.textProperty());
		

		

		
		
		
		
	}
}
