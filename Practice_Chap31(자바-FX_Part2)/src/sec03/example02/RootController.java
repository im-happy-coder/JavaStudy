package sec03.example02;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {

	@FXML private TextField textTitle;
	@FXML private PasswordField txtPassword;
	@FXML private ComboBox<String> comboTxt;
	@FXML private DatePicker date;
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void handleBtnPrint() {
		String title = textTitle.getText();
		System.out.println("제목 : " + title);
		
		String passWord = txtPassword.getText();
		System.out.println("비밀번호 : " + passWord);
		
		String combo = comboTxt.getValue();
		//선택이 되지 않았을 경우도 생각을 해야하므로 조건문을 넣어야 된다.
		if(combo != null) {
			System.out.println("공개여부 : "+ combo);
		} else
			System.out.println("공개여부는 입력되지 않았습니다.");
		
		//DatePicker는 사용자로부터 날짜가 선택이 되어야지만 그 값을 LocalDate타입으로 리턴을 한다.
		//만약에 선택하지 않으면 null이 리턴되어지므로 유효성 검사하는 코드가 들어가는게 좋다
		LocalDate localDate = date.getValue();
		if( localDate != null) {
			System.out.println("게시 종료일 : " + localDate.toString());
		}else
			System.out.println("게시종료일은 선택하지 않았습니다.");
		
		String content = textArea.getText();
		System.out.println("내용 : " + content);
	}
	public void handleBtnExit(ActionEvent event) {
		Platform.exit();
	}
}
