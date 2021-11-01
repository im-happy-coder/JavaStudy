package Question151_200;

import java.util.Optional;

class Employee {
Optional<Address> address;
Employee (Optional<Address> address) {
this.address = address;
}
public Optional<Address> getAddress() { return address; }
}
class Address {
String city = "New York";  //이값이 null이면 null을 출력함
public String getCity() { return city; }
public String toString() {
return city;
}
}

public class Examp194 {

	public static void main(String[] args) {
		Address address = new Address();
//		Address address = null; ---------null일시 답은 "City Not available"
		Optional<Address> addrs1 = Optional.ofNullable (address);
		Employee e1 = new Employee (addrs1);
		String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
		System.out.println(eAddress);
		//답 : New York
		
		//30번 문제

//		A. New York  -->Address address = new Address();이고 String city = "New York";일떄
//		B. City Not available   -->Address address = null; 일때
//		String city = null; 일때의 답 : C. null
//		D. A NoSuchElementException is thrown at run time.
		
		
		//https://www.briefmenow.org/oracle/what-is-the-result-945/  참고
		//ofNullable = null값을 허용함
				//of = null 허용 안함
	}

}
