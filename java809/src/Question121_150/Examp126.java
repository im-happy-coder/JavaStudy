package Question121_150;


class Book {
	private int id;
	private String name;
	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {this.id = id;}
	public void setName(String name) {this.name=name}
	
}
public class Examp126 {

	public static void main(String[] args) {
//		Which statement is true about the Book class?
//				A. It demonstrates encapsulation.
//				B. It is defined using the factory design pattern.
//				C. It is defined using the singleton design pattern.
//				D. It demonstrates polymorphism.
//				E. It is an immutable class.
		
		
		//답 : A. It demonstrates encapsulation.
	}

}
//-- private final 불변클래스


//createProduct 메소드가 팩토리 메소드이다.
//abstract class Factory {
//    public final Product create(String owner) {
//        Product p = createProduct(owner);
//        registerProduct(p);
//        return p;
//    }
//    protected abstract Product createProduct(String owner);
//    protected abstract void registerProduct(Product p);
//}




// 싱글톤 패턴
//public class Printer {
//	  // 외부에 제공할 자기 자신의 인스턴스
//	  private static Printer printer = null;
//	  private Printer() { }
//	  // 자기 자신의 인스턴스를 외부에 제공
//	  public static Printer getPrinter(){
//	    if (printer == null) {
//	      // Printer 인스턴스 생성
//	      printer = new Printer();
//	    }
//	    return printer;
//	  }
//	  public void print(String str) {
//	    System.out.println(str);
//	  }
//	}
//	https://gmlwjd9405.github.io/2018/07/06/singleton-pattern.html
