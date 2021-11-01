package example07;

import java.util.Vector;

public class BoardEx {

	public static void main(String[] args) {

		Vector vector = new Vector();
		System.out.println("저장된 객체 수 : " + vector.size()); //vector의 size는 저장된 객체 수
		System.out.println("용량 : " + vector.capacity()); //기본적으로 저장할 수 있는 공간이 10개다
		
		//배열은 p[0] = new 자손이나 부모클래스 이렇게 해서 했다면
		//벡터는 .add()를 사용한다.
		vector.add(new Board("제목1", "내용1", "작성자1")); //0번째 인덱스
		vector.add(new Board("제목2", "내용1", "작성자1"));
		vector.add(new Board("제목3", "내용1", "작성자1"));
		vector.add(new Board("제목4", "내용1", "작성자1"));
		vector.add(new Board("제목5", "내용1", "작성자1"));
		vector.add(new Board("제목6", "내용1", "작성자1"));
		vector.add(new Board("제목7", "내용1", "작성자1"));
		vector.add(new Board("제목8", "내용1", "작성자1"));
		vector.add(new Board("제목9", "내용1", "작성자1"));
		vector.add(new Board("제목10", "내용1", "작성자1"));
		vector.add(new Board("제목11", "내용1", "작성자1")); //10번째 인덱스
		
		
		System.out.println("저장된 객체 수 : " + vector.size()); 
		System.out.println("용량 : " + vector.capacity()); 
		
		vector.remove(2);  
		vector.remove(5);  
		vector.remove(8);  
		System.out.println("저장된 객체 수 : " + vector.size()); 
		System.out.println("용량 : " + vector.capacity()); 
		
		System.out.println("-------------------------------------------------");
		
		
		for(int i=0; i<vector.size();i++) {
			if(vector.get(i) instanceof Board) { //vector.get(i) = Object타입이기 때문에 Board클래스의 상위클래스이므로 true이다
			Board board = (Board)vector.get(i);
			board.show();
			}

		}
	}

}
