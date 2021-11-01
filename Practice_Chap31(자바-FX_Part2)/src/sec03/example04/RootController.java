package sec03.example04;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	
	@FXML private TableView<Car> tableView;  //Car클래스와 매핑
	@FXML private ImageView imageView;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			
		//동적으로 테이블뷰에 데이터를 추가하기 위해서 아래와 같이 아이템을 Car의 인스턴스를 추가한다.
		
		ObservableList<Car> carList = FXCollections.observableArrayList(
				new Car("람보르기니_세스토_엘레멘토", "30억", "01_람보르기니_세스토_엘레멘토.jpg"),
				new Car("부가티_베이론 그랜드_스포츠_로블랑", "25억", "02_부가티_베이론 그랜드_스포츠_로블랑.jpg"),
				new Car("부가티_베이론_수퍼스포트", "24억", "03_부가티_베이론_수퍼스포트.jpg"),
				new Car("코닉세그_트레비타", "23억", "04_코닉세그_트레비타.jpg"),
				new Car("코닉세그_CCXR", "22억", "05_코닉세그_CCXR.jpg"),
				new Car("애스톤마틴_ONE-77", "21억", "06_애스톤마틴_ONE-77.jpg"),
				new Car("파가니_존다_친퀘_로드스터", "20억", "07_파가니_존다_친퀘_로드스터.jpg"),
				new Car("페라리_FXX", "19억", "08_페라리_FXX.jpg"),
				new Car("람보르기니_레벤톤", "16억", "09_람보르기니_레벤톤.jpg"),
				new Car("코닉세그_아제라R", "15억", "10_코닉세그_아제라R.jpg"));
		
		//테이블 뷰의 0번째 컬럼을 가져온다.
		TableColumn<?, ?> tcCarName = tableView.getColumns().get(0);
		
		//테이블뷰에 컬럼 중에 있는 "이름" 컬럼의 내용들을 Car클래스의 멤버변수인carName과 매핑을 한다.
		tcCarName.setCellValueFactory(new PropertyValueFactory("carName"));
		
		//"가격"컬럼의 carMoney를 매핑한다.
		TableColumn<?, ?> tcCarMoney = tableView.getColumns().get(1);
		tcCarMoney.setCellValueFactory(new PropertyValueFactory("carMoney"));
		
		tableView.setItems(carList);
		
		
		//속성 감시 코드
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Car>() {
			@Override
			public void changed(ObservableValue<? extends Car> observable, Car oldValue, Car newValue) {
				
				if(newValue != null) {
				//Car클래스에 저장된 이미지파일명.jpg의 값을 얻어서 url객체로 넘겨준다.
				imageView.setImage(new Image(getClass().getResource("images/" + newValue.getCarImage()).toString()));
				}
			}
		});
		
		
	}
}
