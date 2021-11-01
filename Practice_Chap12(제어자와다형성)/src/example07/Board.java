package example07;

public class Board {

	private String subject; //제목
	private String content; //내용
	private String writer; //작성자
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	} 
	
	public void show() {
		System.out.println("제목 : " + this.getSubject());
		System.out.println("내용 : " + this.getContent());
		System.out.println("작성자 : " + this.getWriter());
	}
	
}
