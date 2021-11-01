package example06;
//자손클래스
public class ConversationBook extends Book {
	
	
	private String language;
	

	public ConversationBook(int productID, String description, String maker, int price, int iSBN, String title,
			String author, String language) {
		super(productID, description, maker, price, iSBN, title, author);
		this.language = language;
	}


	public String getLanguage() {
		return language;
	}


	@Override
	public void showInfo() {
		super.showInfo(); //조상클래스의 메서드를 명시적으로 호출
		System.out.println("언어  >>" + this.getLanguage());
	}
	
	

}
