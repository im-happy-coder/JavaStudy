package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.ws.handler.MessageContext.Scope;

public class Server {

	public static void main(String[] args) {
		
		//서버를 만듬
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			//포트와 바인딩하기 위한 코드
			serverSocket.bind(new InetSocketAddress("localhost", 7777));
			
			//서버는 클라이언트의 요청이 언제 들어올 지 모르므로 무한 루프를 돌아야한다.
			while(true) {
				System.out.println("[연결 기다림]");
				
				//accept()는 클라이언트의 연결 요청을 해오기 전까지는 대기, 즉 블로킹 상태로 된다.
				//클라이언트의 요청이 들어오면 비로소 서버에서 통신용 Socket 만들어서 리턴한다.
				Socket socket = serverSocket.accept(); 
				
				//클라이언트의 ip주소를 얻는코드
				//타입 변환을 하는 이유는 getRemoteSocketAddress()는 SocketAddress클래스를 리턴하므로
				//SocketAddress클래스의 자손인 InetSocketAddress로 다운 캐스팅을 하는것이다
				InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] : " + inetSocketAddress.toString());
				
				
				byte[] bytes = null; //인코딩
				String data = null;  //디코딩
				/////////////////////////////////////
				//데이터를 받기 위해서 소켓에서 입력스트림을 얻는 코드
				InputStream inputStream = socket.getInputStream();
				bytes = new byte[1000];
				
				//클라이언트에게 들어오는 데이터를 읽는 부분
				int readCount = inputStream.read(bytes);
				//저장했던 바이트배열을 String으로 디코딩
				data = new String(bytes, 0, readCount, "UTF-8");
				
				System.out.println("[데이터 받기 성공] : " + data );
				
				
				////////////////////////////////////////
				//데이터를 보내기 위해서 소켓에서 출력스트림을 얻는 코드
				OutputStream outputStream = socket.getOutputStream();
				data = "안녕하세요 클라이언트";
				//인코딩을 하는 코드
				bytes = data.getBytes("UTF-8");
				outputStream.write(bytes);
				outputStream.flush();
				
				System.out.println("[데이터 보내기 성공]");
				
				inputStream.close();
				outputStream.close();
				socket.close();
			}
		} catch (IOException e) {}
		//시스템의 리소스(자원)을 다 사용하고 나면 반드시 close()를 호출하자.
		//지금은 이 코드가 의미가 없다.
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {}
		}
	}

}
