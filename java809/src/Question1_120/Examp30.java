package Question1_120;

import java.util.Optional;

class Employee {
Optional<Address> address;
Employee (Optional<Address> address) {
this.address = address;
}
public Optional<Address> getAddress() { return address; }
}
class Address {
String city = "New York";
public String getCity(){ return city;}
public String toString() {
return city;
}
}
public class Examp30 {

	public static void main(String[] args) {
		Address address = null;
		Optional<Address> addrs1 = Optional.ofNullable (address);  // .ofNullable()는 값이 null이면 null을 반환한다...
//											of()는 null허용 안함---즉 NullpointException이 발생한다.
		Employee e1 = new Employee (addrs1);
		String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
		System.out.println(eAddress);
	}

}
//B. City Not available