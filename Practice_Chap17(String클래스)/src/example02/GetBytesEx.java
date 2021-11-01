package example02;

public class GetBytesEx {

	public static void main(String[] args) throws Exception {

		String str = "안녕하세요";
		//getbytes()메서드
		//인코딩(기계가 알아 보기 편하게 변환하는 과정이다)
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1(EUC-KR)로 받았을 때의 길이 : " + bytes1.length); //EUC-KR 한글 2바이트

		
		byte[] bytes2 = str.getBytes("UTF-8");
		System.out.println("bytes1(UTF-8)로 받았을 때의 길이 : " + bytes2.length); //UTF-8 한글 3바이트
		
		//디코딩(인간이 알아보기 쉽게 변환하는 과정이다)
		String str1 = new String(bytes1, "EUC-KR");
		System.out.println("EUC-KR로 디코딩한 문자열 : " + str1);
		
		String str2 = new String(bytes2, "UTF-8");
		System.out.println("UTF-8로 디코딩한 문자열 : " + str2);
	}

}
