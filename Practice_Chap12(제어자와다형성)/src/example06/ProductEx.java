package example06;

import java.util.Scanner;

public class ProductEx {

	//클래스 영역에 올라가서 공용데이터로 사용 된다.
	static int productID = 0;
	static int numberOfProduct = 0;  //배열 인덱스 변수
	static Product[] p = new Product[10];
	static Scanner sin = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice = 0;
		while(choice != 3) {
			int type = 0;
			
			System.out.println("상품조회 프로그램 입니다.");
			System.out.print("상품 추가는 (1), 상품조회(2), 끝내기(3) >> ");
			choice = sin.nextInt();
			
			switch(choice) {
			case 1 :
				if(numberOfProduct >= p.length) { //10보다 크면 안되니까  numberOfProduct(인덱스)는 배열크기보다 크면 안된다.
					System.out.println("더 이상 상품추가 불가");
					break;
				}
				System.out.print("책이면 (1), 음악CD(2), 회화책(3) >> ");
				type = sin.nextInt();
				if(type < 1 || type > 3) {
					System.out.println("잘못 입력 하셨습니다.");
					break;
				}
				addProduct(type);
				break;
			case 2:
				for(int i=0; i<numberOfProduct; i++) {
					p[i].showInfo();
				}
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			}
		}
			
	}
	public static void addProduct(int type) {
		sin.nextLine(); //버퍼 비우기(엔터키)
		System.out.print("상품 설명 >> ");
		String desc = sin.nextLine();
		System.out.print("생산자 >> ");
		String maker = sin.nextLine();
		System.out.print("가격 >> ");
		int price = sin.nextInt();
		sin.nextLine();//버퍼 비우기(엔터키)
		switch(type) {
		//Book 클래스
		case 1 :
			System.out.print("일반 책 제목 >> ");
			String title = sin.nextLine();
			System.out.print("저자 >> ");
			String author = sin.nextLine();
			System.out.print("국제표준도서번호(ex. 0001)  >> ");
			int ISBN = sin.nextInt();
			sin.nextLine();//버퍼 비우기(엔터키)
			//필드의 다형성(조상 객체배열에 자손의 인스턴스를 붙이고 있다.)
			p[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
			break;
			//CompactDisc 클래스
		case 2 :
			System.out.print("앨범 제목  >> ");
			String albumTitle = sin.nextLine();
			System.out.print("가수  >> ");
			String artist = sin.nextLine();
			p[numberOfProduct] = new CompactDisc(productID++, desc, maker, price, albumTitle, artist);
			break;
			//ConversationBook 클래스
		case 3 :
			System.out.print("회화책 제목  >> ");
			String title2 = sin.nextLine();
			System.out.print("저자  >> ");
			String author2 = sin.nextLine();
			System.out.print("언어  >> ");
			String language = sin.nextLine();
			System.out.print("국제표준도서번호(ex. 0001)  >> ");
			int iSBN2 = sin.nextInt();
			p[numberOfProduct] = new ConversationBook(productID++, desc, maker, price, iSBN2, title2, author2, language);
			break;
		}
		numberOfProduct++;
		
	}
	
}
