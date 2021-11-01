package examp05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
//		HashMap은 신버전 
//		HashTable은 구버전
//		기능은 똑같다.
		Map<String, String> map = new Hashtable<String, String>();
		//객체 추가
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12");
		System.out.println("총 Entry 수 : " + map.size());
		
		
		int count = 0; //비밀번호의 틀린 갯수
		
		//객체 검색
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 비밀번호를 입력하세요");
			System.out.print("아이디 : ");
			String id = scanner.nextLine(); //공백포함
			
			System.out.print("비밀번호 : ");
			String password = scanner.nextLine(); 
			System.out.println();
			
			//저장되어 있는 객체를 검색하여(일종의 DB라고 생각하자) 아이디와 비밀번호가 일치하면 로그인 성공, 아니라면 무한루프를 빠져나감
			if(map.containsKey(id)) {//containsKey는 키 객체가 있니 물어보는것 , 
				//id 즉, 키를 주고 얻어오는 값은 password이니까, 같다면 로그인 성공, 아니면 비밀번호 불일치 된다. 단, 틀린 횟수 1증가됨
				if(map.get(id).equals(password)) { //map.get(id)여기서 나오는 비밀번호와 .equals(password) 여기 비밀번호와 비교한다.
					System.out.println(id + "님이 로그인 되었습니다.");
					break;
				}
				else {
					count++; //비밀번호 틀린 횟수 증가
					System.out.println("비밀번호가 "+ count + "회" + "틀렸습니다.");
					if(count == 3) { //3번 틀리면
						System.out.println("비밀번호가 "+ count + "회" + "틀렸습니다. 지점 방문 부탁드립니다.");
						break;
					}
				}
			}
			else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
		
		scanner.close();
	}

}
