package sec03.example03;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private ListView<String> listView;
	@FXML private ImageView imageView;
	@FXML private Button btn1_print;
	@FXML private Button btn2_exit;
	
	String str = null;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			
		//리스트 뷰에 대해서 속성감시를 통해서 파일경로를 알아내서 이미지뷰에 이미지를 보이게끔 한다.
		
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				str = newValue.toString(); //이미지의 경로를 출력하기 위해 저장
				
				//이미지뷰의 이미지를 리스트뷰에서 선택한 이미지를 보여주는 코드
				imageView.setImage(new Image(getClass().getResource("images/"+newValue.toString()).toString()));
			}
		});
		
		btn1_print.setOnAction(event-> btn1Print(event,str));
		btn2_exit.setOnAction(event->btn2Exit(event));
	}
	
	public void btn1Print(ActionEvent event, String str) {
		System.out.println("이미지 경로 : images/"+str );
	}
	
	public void btn2Exit(ActionEvent event) {
		Platform.exit();
	}
}
