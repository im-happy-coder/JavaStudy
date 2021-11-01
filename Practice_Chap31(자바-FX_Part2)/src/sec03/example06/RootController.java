package sec03.example06;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {
	
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Label lebelTime;
	@FXML private Slider sliderVolumn;
	@FXML private Slider sliderMedia;
	
	
	
	
	
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
				
				/////////////////////////////////
				
				//재생정도를 미디어슬라이더에 최고값과 최소값을 초단위로 매핑함
				sliderMedia.setMin(0.0);
				sliderMedia.setValue(0.0);
				sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());
				
				//미디어 플레이어의 현재시간을 알아내는 속성감시한다. 시간이기에 제네릭타입은 Duration이다
				//재생이 되면서 currentTime이 변경이 되면 그 값은 newvalue에 계속 들어오게 된다.
				//currentTime을 ProgressBar와 ProgressIndicator에서 나타내기 위해서 0.0~1.0사이의 값으로 환산하여 나타태줘야하기 때문에 감시한다.
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						//현재 재생시간 / 총 재생시간  = 0.0 ~ 1.0
						double progress = mediaPlayer.getCurrentTime().toSeconds() /
								 mediaPlayer.getTotalDuration().toSeconds();
						//0.0~1.0값으로 각각 설정해준다.
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						
						//슬라이더에 미디어소스의 재생정도를 나타낸다
						sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());
						
						//라벨에 재생시간을 표시
						lebelTime.setText((int)mediaPlayer.getCurrentTime().toSeconds() + "/" + 
						(int)mediaPlayer.getTotalDuration().toSeconds() + "초");
						
						System.out.println("재생중");
						
					}
				});
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
			
			//강제적으로 1.0으로 설정하여 완료상태가 나오도록 만드는 코드
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
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
		
		//슬라이더 볼륨이 변경되었을 때 볼륨의 크기를 조절하는 속성감시 코드가 필요하다.
		//Slider의 value값의 범위는 0.0~100.0 이다. [ 미디어 플레이어의 벨류의 범위는 0.0~1.0이다.]
		sliderVolumn.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				mediaPlayer.setVolume(newValue.doubleValue() / 100.0);
				mediaPlayer.setVolume(sliderVolumn.getValue() / 100.0);
				System.out.println("볼륨조절");
			}
		});
		
		sliderVolumn.setValue(50.0); //볼륨의 기본값
		
		//일시정지 버튼의 이벤트 처리
		btnPause.setOnAction(event -> {
			mediaPlayer.pause();
		});
		
		//중지 버튼의 이벤트 처리
		btnStop.setOnAction(event -> {
			mediaPlayer.stop();
		});
		
		///////////////////////////////////////////////////////////
		
		//슬라이더미디어 부분을 마우스로 드래그하거나 움직일때 미디어소스도 같이 변화가 일어나게 코드를 작성한다.
		sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				//마우스로 드래그할때
				if(sliderMedia.isValueChanging()) {
					System.out.println("마우스 드래그");
					mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
				} 
				//정상 재생 마우스로 클릭할때
				else {
					//정상재생 마우스로 클릭할때 범위가 0.5이상이면 이동 ,, 0.5미만은 seek하지 않겟다.
					if(Math.abs(oldValue.doubleValue() - newValue.doubleValue()) > 0.5){
						System.out.println("마우스 클릭");
						mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
					}
				}
					
				
				
			}
		});
		
	}
}
