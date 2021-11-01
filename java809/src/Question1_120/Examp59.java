package Question1_120;

import java.util.Arrays;
import java.util.List;

public class Examp59 {

	public static void main(String[] args) {
		List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG"); 
		codes.forEach (c -> System.out.print(c + " ")); //여기서 codes 리스트를 한번 출력합니다.
		String fmt = codes.stream()
				.filter (s-> s.contains ("PEG"))
				.reduce((s,t) -> s+t).get();
				System.out.println("\n" + fmt);
				//이 스트림 문으로 PEG가 포함된 문자열만 출력합니다.
	}

}
//A. DOC MPEG JPEG MPEGJPEG