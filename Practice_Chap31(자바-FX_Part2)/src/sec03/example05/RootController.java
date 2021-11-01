package sec03.example05;

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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable {
	
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	
	private boolean endOfMedia; //플래그 변수
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//재생할 소스(미디어)
//		Media media = new Media(getClass().getResource("media/audio.wav").toString()); //오디오
		Media media = new Media(getClass().getResource("media/테스트동영상.mp4").toString()); //비디오
		
		
		//미디어뷰를 컨트롤할 플레이어다
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		//미디어플레이어클래스가 제어하는 내용을 미디어뷰에 보여주기 위해서 작성함
		mediaView.setMediaPlayer(mediaPlayer);
		
		//소스가 분석도 제대로 안되었는데 play()호출하면 안됨(주의할 사항)
		//mediaPlayer.play();
		
		//setOnReady는 소스분석이 끝나고 unknown상태에서 ready상태가 되면 아래와같이 코드를 작성한다.
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
//				setDisable()매개값이 true이면 비활성화를 한다.
				btnPlay.setDisable(false); //재생버튼을 활성화
				btnPause.setDisable(true); //일시정지 버튼 비활성화
				btnStop.setDisable(true); //중지버튼 비활성화
			}
		});
		
		//미디어소스가 실행되고 있을 때를 감지해서 실행할 내용을 람다식으로 작성함
		mediaPlayer.setOnPlaying(()->{
			btnPlay.setDisable(true); //재생버튼을 비활성화
			btnPause.setDisable(false); //일시정지 버튼 활성화
			btnStop.setDisable(false); //중지버튼 활성화	
			});
		
		
		//미디어소스가 일시정지 상태가 되고 있을 때를 감지해서 실행할 내용을 람다식으로 작성함
		mediaPlayer.setOnPaused(() -> {
			btnPlay.setDisable(false); //재생버튼을 활성화
			btnPause.setDisable(true); //일시정지 버튼 비활성화
			btnStop.setDisable(false); //중지버튼 활성화	
		});
				
		//미디어소스가 중지 상태가 되고 있을 때를 감지해서 실행할 내용을 람다식으로 작성함
		mediaPlayer.setOnStopped(() -> {
			btnPlay.setDisable(false); //재생버튼을 활성화
			btnPause.setDisable(true); //일시정지 버튼 비활성화
			btnStop.setDisable(true); //중지버튼 비활성화	
		});
		
		//OnEndOfMedia는 미디어 소스가 정상적인 상태로 재생이 완료 되었을 때를 감지해서 실행할 내용을 작성함
		mediaPlayer.setOnEndOfMedia(() -> {
			btnPlay.setDisable(false); //재생버튼을 활성화
			btnPause.setDisable(true); //일시정지 버튼 비활성화
			btnStop.setDisable(true); //중지버튼 비활성화
			
			//문제는 재생이 완료가 되어도 재생버튼은 활성화가 되어 클릭은 되지만 재생이 다 완료가 되었을 때 다시 재생하면 재생이 안된다.
			//이유는 재생완료 시점에 미디어 소스의 상태가 머물러 있기 때문이다.
			//다시 처음 상태로 돌려줄 필요가 있다. 명시적으로 stop()를 호출하고 그 소스에 미디어의 상태를 처음으로 돌리는 코드 작성해야한다.
			//위의 플레그 변수를 활용하여 사용하면 된다.
			endOfMedia = true;
		});
		
		//재생 버튼의 이벤트 처리
		btnPlay.setOnAction(event -> {
			
			//플레그 변수가 true가 되었다는 것은 미디어 상태가 재생 완료(endOfMedia)상태가 되었다.
			//명시적은 stop()호출하고 미디어를 처음 시간으로 돌려준다.
			if(endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endOfMedia = false;
			}
			mediaPlayer.play();
		});
		
		//일시정지 버튼의 이벤트 처리
		btnPause.setOnAction(event -> {
			mediaPlayer.pause();
		});
		
		//중지 버튼의 이벤트 처리
		btnStop.setOnAction(event -> {
			mediaPlayer.stop();
		});
		
	}
}
