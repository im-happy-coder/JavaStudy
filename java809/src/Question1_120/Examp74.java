package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

class FileThread implements Runnable {
String fName;
public FileThread(String fName) { this.fName = fName; }
public void run () {System.out.println(fName);}
}
public class Examp74 {
	public static void main(String[] args) throws IOException, InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		Stream<Path> listOfFiles = Files.walk(Paths.get("D:\\data")); 
		listOfFiles.forEach(line -> { executor.execute(new FileThread(line.getFileName().toString())); // line n1
		});  //모든 하위 디렉토리의 파일들을 하나의 리스트로 만들기 
		//Files.walk(path);path에는 String 문자열이 아닌 Path 인터페이스의 객체를 파라미터로 받으며 Paths.get("경로"); 를 이용해 객체를 얻어 낼 수 있다

		//답: B. 프로그램은 파일 이름을 동시에 인쇄합니다. The program prints files names concurrently.
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.DAYS); // line n2
		//지정된 5일동안 대기 하며 모든 작업이 모든 중지되었는지 체크 한다. 작업이 모두 중지 될때 까지, 지정된 시간별로 Loop 실행
	}
}
	//The Java Projects directory exists and contains a list of files. 
//		Java Projects 디렉토리가 존재하며 파일 목록을 포함합니다.
//	Files 클래스의 walk 메서드는 깊이 우선을 사용하여 들어오는 파일의 경로를 방문 할 수 있습니다.

//ExecutorService 개체의 execute 메서드는 새 스레드를 사용하여 전달 된 Runnable 개체를 실행할 수 있습니다.
//shutdown 메서드는 더 이상 새 실행 개체 (Runnable 또는 Callable)를 허용하지 않도록 ExecutorService 
//개체를 닫을 수 있지만 현재 실행되고 대기중인 작업이 완료 될 때까지 기다리지 않습니다. awaitTermination 메서드는 ExecutorService 
//개체가 모든 작업 처리를 완료 할 때까지 대기하는 상한 시간을 지정할 수 있습니다. 
//B. The program prints files names concurrently.

/*
newFixedThreadPool
주어진 스레드개수만큼 생성하고, 그 수를 유지한다. 이때 생성된 스레드중 일부가 작업시 종료되었다면 스레드를 다시생성하여 주어진 수를 맞춘다.

newCachedThreadPool
처리할 작업의 스레드가 많아지면 그 만큼 스레드를 증가하여 생성한다. 만약 쉬는 스레드가 많다면 스레드를 종료시킨다. 반면 스레드를 제한두지 않기때문에 조심히 사용해야 한다.

newSingleThreadExecutor
스레드를 단 하나만 생성한다. 만약 스레드가 비정상적으로 종료되었다면 다시 하나만 생성한다.

newScheduledThreadPool
특정시간 이후에 실행되거나 주기적으로 작업을 실행할 수 있다.
*/
