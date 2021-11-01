package sec03.example01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

public class RootController implements Initializable {

	
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	
	@FXML private ImageView chkImageView;
	
	@FXML private ToggleGroup group;
	
	@FXML private ImageView radioImageView;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//속성감시
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			//ToggleGroup에 속해져 있는 라디오버튼을 속성감시를 통해서 ImageView에 Image가
			//뿌려지도록 한다. 라디오버튼이 바뀔 때마다 ChangeListener가 호출되어 root.fxml파일에 있느 라디오 버튼에 userData속성이용해서 파일 이름을 지정한 후에
			//그것을 경로로하여 이미지를 ImageView에 뿌려지는것이다.
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				Image image = new Image(getClass().getResource("images/" + newValue.getUserData()).toString().toString());
				radioImageView.setImage(image);
			}
		});
		
	}
	
	public void handleCheckAction(ActionEvent event) {
		//Image()의 매개값은 String타입의 url이기 때문에 반드시 toString()을 호출해서 경로를 Strin타입으로 만들어서 대입을 해야한다.
		if(chk1.isSelected() && chk2.isSelected()) {
			chkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		} else if(chk1.isSelected()) {
			chkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		} else if(chk2.isSelected()) {
			chkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		} 
		
		
	}
	
	public void handleBtnExitAction(ActionEvent event) {
		Platform.exit();
	}
}
