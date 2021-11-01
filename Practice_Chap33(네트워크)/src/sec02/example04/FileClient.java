package sec02.example04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class FileClient {

	public static void main(String[] args) {
		
		
		Socket socket = null;
		try {
			socket = new Socket("localhost", 7777);
			OutputStream outputStream = socket.getOutputStream();
//			String filePath = "D:\\java작업\\Practice_Chap33(네트워크)\\src\\sec02\\example04\\files\\인트로.mp4";
			String filePath = "D:\\java작업\\Practice_Chap33(네트워크)\\src\\sec02\\example04\\files\\김연아.jpg";
			
			//파일 객체 얻기
			File file = new File(filePath);
			//파일 이름 얻기
			String fileName = file.getName();
			byte[] fileNameBytes = fileName.getBytes("UTF-8");
			fileNameBytes = Arrays.copyOf(fileNameBytes, 100);
			//파일 이름을 보내는 부분
			outputStream.write(fileNameBytes);
			
			//파일을 보내기 시작
			System.out.println("[파일 보내기 시작] : " + fileName);
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] filArr = new byte[1000];
			int readCount = -1;
			
			while((readCount = fileInputStream.read(filArr)) != -1) {
				outputStream.write(filArr, 0, readCount);
			}
			outputStream.flush();
			System.out.println("[파일 보내기 완료]");
			
			fileInputStream.close();
			outputStream.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("파일 보내기 예외 발생");
			e.printStackTrace();//에러시 경로를 나타내줌
		}
	
	
	}

}
