package sec02.example04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;

import javax.print.attribute.standard.Severity;

public class FileServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			 serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 7777));
			System.out.println("[서버 시작]");
		} catch (IOException e) {}
		//서버는 지속적으로 무한루프를 돌아야한다.
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				InputStream inputStream = socket.getInputStream();
				
				byte[] bytesArr = new byte[100];
				int readCount = -1;
				//파일 이름 읽기
				inputStream.read(bytesArr, 0, 100);
				String fileName = new String(bytesArr, 0, 100, "UTF-8");
				fileName = fileName.trim(); //파일이름 앞 뒤 공백제거
				
				System.out.println("[파일 받기 시작] : " + fileName);
				//파일을 받기 시작하게 되면, 저장 경로를 얻어서 파일의 내용을 저장하면 된다.
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Temp/" + fileName);
				while((readCount = inputStream.read(bytesArr)) != -1) {
					fileOutputStream.write(bytesArr, 0, readCount);
				}
				fileOutputStream.flush();
				System.out.println("[파일 받기 완료]");
				fileOutputStream.close();
				inputStream.close();
				
			} catch (Exception e) {
				System.out.println("파일 받기 예외 발생");
				break;
			}
		}
		try {
			serverSocket.close();
			System.out.println("[서버가 종료되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
