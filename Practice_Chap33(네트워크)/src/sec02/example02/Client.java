package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		//서버나 클라인트 read()에서 대기 상태(블로킹)이 된다.
		//클라이언트가 종료되거나 정전이 발생할때 블로킹이 풀린다.
		
		//클라이언트를 만듬
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("연결 요청");
			
			//서버에 접속하는 코드
			socket.connect(new InetSocketAddress("localhost", 7777));
			System.out.println("연결 성공");
			
			
			byte[] bytes = null;
			String data = null;
			
			///////////////////////////////////
			//데이터를 서버로 보내기 위한 코드
			OutputStream outputStream = socket.getOutputStream();
			data = "안녕 서버";
			//인코딩, 통상 네트워크 송수신을 할때는 문자셋은 UTF-8로 통일화가 되어있다.
			//한글은 3바이트이다.
			bytes = data.getBytes("UTF-8");
			outputStream.write(bytes);
			outputStream.flush();
			System.out.println("[데이터 보내기 성공]");
			
			/////////////////////////////////////
			//데이터를 받기위한 코드를 작성한다.
			InputStream inputStream = socket.getInputStream();
			bytes = new byte[1000];
			//read()에서  블로킹 상태가 된다.
			int readCount = inputStream.read(bytes);
			//디코딩
			data = new String(bytes, 0, readCount, "UTF-8");
			System.out.println("[데이터 받기 성공]  : " + data);
			
			outputStream.close();
			inputStream.close();
			
		} catch (IOException e) {}
		
		//연결을 끊기 위한 코드
		if(!socket.isClosed()) {
			try {
				socket.close();
				System.out.println("클라이언트의 소켓이 닫혔습니다.");
			} catch (IOException e) {}
		}
	}

}
