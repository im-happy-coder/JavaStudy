package examp01;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingDecodingEx {

	public static void main(String[] args) throws Exception {
		
		String hangul = "한글";
		String[] encodings = new String[] {"x-windows-949", "EUC-KR", "UTF-8", "ISO8859-1"}; //인코딩 캐릭터 셋들이다
		String[] encoded =  new String[4];
		String decoded = "";
		for(int i=0; i<encodings.length; i++) {
			//인코딩 기계가 편한 쪽으로 변환
			encoded[i] = URLEncoder.encode(hangul,encodings[i]);
			System.out.println(encodings[i] + " 으로 인코딩된 값 : " +encoded);
		}
		System.out.println("==========================================================");
		for(int i=0; i<encodings.length; i++) {
			//디코딩 사람이 편한 쪽으로 변환
			decoded = URLDecoder.decode(encoded[i],encodings[i]);
			System.out.println(encodings[i] + " 으로 디코딩된 값 : " +decoded);
		}
		
		
		
		//이클립스의 디폴트 캐릭터셋
//		System.out.println(Charset.defaultCharset());

	}
}
