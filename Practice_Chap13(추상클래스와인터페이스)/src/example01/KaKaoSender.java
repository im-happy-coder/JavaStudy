package example01;

public class KaKaoSender extends ContentSender{

	private String content;

	public KaKaoSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
	
	public String getContent() {
		return this.content;
	}


	//조상클래스의 추상메서드를 오버라이딩함
	@Override
	public void sendMessage(String recipient) { //sendMessage(String content)를 오버라이딩함 그래서 받는사람 recipient가 호출됨
		System.out.println("제목 : "+ this.getTitle());
		System.out.println("이름 : "+ this.getName());
		System.out.println("내용 : "+ this.getContent());
		System.out.println("받는 사람 : "+ recipient);
		
	}
}
