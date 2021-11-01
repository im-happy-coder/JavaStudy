package tokenExample;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {

	public static void main(String[] args) {
		
		String data = "baby cat dog a d c d e f s a s f e g e s g r t";
		
		long start = System.nanoTime();
		
		//split()는 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고 있다면,
		//공백도 하나의 토큰으로 인식한다. = 공백이 여러개면 다 출력이된다 
		String[] result = data.split(" ");
		for(String str : result) {
			System.out.println(str);
		}
		long end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end-start) + "ns");
//		System.out.println("토큰 개수 : " + result.length); //공백도 토큰이라서 공백 포함 갯수
		System.out.println("------------------------------------------");
		
		
		//StringTokenizer는 구분자로 공백을 주면 데이터가 공백을 다수 포함하고 있다면,
		//공백은 토큰으로 인정하지 않는다. = 공백이 여러개여도 단 하나의 공백으로 인식한다
		StringTokenizer stringTokenizer = new StringTokenizer(data, " ");
		start = System.nanoTime();
		while(stringTokenizer.hasMoreTokens()) {
//			System.out.println("남은 토큰 수 : " + stringTokenizer.countTokens());
			String str = stringTokenizer.nextToken();
			System.out.println(str);
		}
		end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end-start) + "ns");
	}

}
