package sec01.example01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		
		try {
			//자기 자신의 PC IP주소 확인
			InetAddress iAddress = InetAddress.getLocalHost();  //로컬
			String ip = iAddress.getHostAddress();
			System.out.println("내 컴퓨터의 ip 주소 : " + ip);
			
			//도메인 네임을 이용해서 IP주소를 확인
			//보통 큰 서버를 가지고 있는 회사들의 IP는 2개 이상이다.
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			for(InetAddress inetAddress : inetAddresses) {
				ip = inetAddress.getHostAddress(); //호스트
				System.out.println("네이버의 IP 주소 : " + ip );
			}
			
			InetAddress[] inetAddresses2 = InetAddress.getAllByName("www.samsung.com");
			for(InetAddress inetAddress : inetAddresses2) {
				ip = inetAddress.getHostAddress(); //호스트
				System.out.println("samsung전자의 IP 주소 : " + ip );
			}
		} catch (UnknownHostException e) {
		}
	}

}
