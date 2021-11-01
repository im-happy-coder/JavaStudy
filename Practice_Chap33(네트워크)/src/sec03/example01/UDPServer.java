package sec03.example01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public UDPServer(int port) {
		try {
			while(true) {
				DatagramSocket datagramSocket = new DatagramSocket(port);
				byte[] bytes = new byte[100];
				DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
				System.out.println("서버 시작");
				datagramSocket.receive(datagramPacket);
				//디코딩
				String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength(), "UTF-8");
				System.out.println("수신된 데이터 : " + str.trim());
				
				//클라이언트의 정보를 출력을 한다
				InetAddress inetAddress = datagramPacket.getAddress(); //클라이언트의 ip를 얻을 수 있다
				int clientPort = datagramPacket.getPort(); //포트번호를 얻는다.
				System.out.println("클라이언트 IP : " + inetAddress + "클라이언트 Port : " + clientPort);
				
				datagramSocket.close();
			}
		} catch (Exception e) {
			//비연결 지향적UDP이므로 예외를 확인 하기 힘들다.
			System.out.println("데이터 수신 예외 발생");
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new UDPServer(7777); //서버 포트
	}

}
