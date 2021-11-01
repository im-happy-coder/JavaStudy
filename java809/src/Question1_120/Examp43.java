package Question1_120;
interface Rideable {Car getCar(String name); }
class Car {
private String name;
public Car (String name) {
this.name = name;
}
}
public class Examp43 {
	public static void main(String[] args) {
//		Car auto = Car ("MyCar"):: new;
//		Car auto = Car :: new; Car vehicle = auto :: getCar("MyCar");
		 Rideable rider = Car :: new; Car vehicle = rider.getCar("MyCar");   //Á¤´ä
//		 Car vehicle = Rideable :: new :: getCar("MyCar");
		 
	}
}
