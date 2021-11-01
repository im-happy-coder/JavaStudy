package Question1_120;

import java.util.function.DoubleSupplier;

class Job1{
	String name;
	Integer cost;
	public Job1(String name, Integer cost) {
		this.name = name;
		this.cost = cost;
	}
	String getName() {return name;}
	int getCost() {return cost;}
	
}
public class Examp92 {

	public static void main(String[] args) {
		Job1 j1 = new Job1("IT", null);   //여기에 null이 들어가서 NPE 에러 발생
//		Job1 j1 = new Job1("IT", 0);     // IT:0.0            
		DoubleSupplier js1 = j1::getCost; //Supplier(공급자) 리턴값만 있음
		System.out.println(j1.getName()+":"+js1.getAsDouble());
	}

}

//DoubleSupplier	double getAsDouble()	double 값을 리턴

//답 : B. A NullPointerException is thrown at run time.