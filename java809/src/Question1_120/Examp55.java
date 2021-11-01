package Question1_120;
class Customer {
private String fName;
private String lName;
private static int count;
public Customer(String first, String last) {
	fName = first;
	lName = last;
	++count;}
static { count = 0; }  //이새끼도 왜 있는거임?
public static int getCount() {return count; }
}
public class Examp55 {
		public static void main(String[] args) {
			Customer c1 = new Customer("Larry", "Smith");
			Customer c2 = new Customer("Pedro", "Gonzales");
			Customer c3 = new Customer("Penny", "Jones");
			Customer c4 = new Customer("Lars", "Svenson");
			c4 = null;   //
			c3 = c2;  	//   이 두개는 아무런 영향이 없음
			//인스턴스를 생성해야 count가 증가함
			System.out.println (Customer.getCount());
	}
}


//답:  D. 4