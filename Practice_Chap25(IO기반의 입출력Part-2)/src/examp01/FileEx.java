package examp01;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws Exception {
		//아랫줄을 실행한다고 해서 Temp\directory폴더를 만들지 않는다.
		File directory = new File("D:/Temp/directory"); 
//		File directory = new File("D:/directory"); 
		File file1 = new File("D:/Temp/file1.txt");
		File file2 = new File("D:/Temp/file2.txt");
		//원래형식은 file://localhost/D:Temp/file3.txt인데 개인pc는 localhost를 생략한다.
		File file3 = new File(new URI("file:///D:/Temp/file3.txt"));
//		URI 객체는 문자열 전송과 조작을 위한 프로토콜이다.
//		URL 객체는 네트워크 전송을 위한 프로토콜이다.
//		프로토콜은 통신규약 (TCP/IP, UDP..)
//		URI는 통합자원 식별자는 인터넷에 있는 자원을 나타내는 유일한 주소를 의미한다.
		
		//URI 사용 예시
//		String uriname = "http://www.google.co.kr/Temp/file3.txt";
//		URI uri = new URI(uriname);
//		System.out.println(uri);
		
		
	
		if(directory.exists() == false) {	//directory폴더가 존재하느냐?
//			mkdir()은 ("D:/Temp/directory")부모 디렉토리 Temp가 있기 때문에 실행해도 자동으로 디렉토리를 만들지 않는다
//			mkdir()은 ("D:/directory"); 애는 부모디렉토리가 없기 때문에 실행하면 바로 디렉토리를 만든다.
//			directory.mkdir();
			
			
			
//			mkdirs()은 ("D:/Temp/directory") 부모 폴더(Temp)와 디렉토리를 둘다 만들어 준다.(권장방법)
			directory.mkdirs();
		}
		if(file1.exists() == false) { //file1.exists()은 file1경로에 file.txt파일이 있니?없니? 없으면 생성
			//만약에 Temp폴더가 없다면 IOException를 발생시킨다.
			file1.createNewFile(); //file1 경로에 file1.txt파일 생성
			System.out.println("file1.txt가 생성되었습니다.");
		}
		if(file2.exists() == false) {
			file2.createNewFile(); //file2경로에 file1.txt파일 생성
			System.out.println("file2.txt가 생성되었습니다.");
		}
		if(file3.exists() == false) {
			file3.createNewFile(); //file3 경로에 file1.txt파일 생성
			System.out.println("file3.txt가 생성되었습니다.");
		}
		

		
		
		File tmp = new File("D:/Temp");
		//tmp서브 디렉토리 및 파일을 배열로 만들어서 출력해보기
		File[] contents = tmp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		System.out.println("날찌\t       시간\t\t형태\t크기\t이름");
		System.out.println(sdf.format(new Date()));
		System.out.println("-----------------------------------------");
		for(File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) { //file이 디렉토리냐?
				System.out.print("\t\t<Dir>\t\t" + file.getName()); //디렉토리 이름을 출력한다.
			}
			else { //file이면
				System.out.print("\t\t" + file.length() + "\t" + file.getName()); //파일의 크기와 이름을 출력한다.
			}
			System.out.println();
		}
		
		
	}

}
