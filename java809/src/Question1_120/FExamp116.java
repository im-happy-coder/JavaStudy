package Question1_120;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Vehicle4 {
	int vid;
	String vName;
	public Vehicle4(int vidArg, String vNameArg) {
		super();
		this.vid = vidArg;
		this.vName = vNameArg;
	}
	
	public int getvid() {return vid;}
	public String getvName() {return vName;}
	public String toString() {
		return vName;
	}
}
public class FExamp116 {

	public static void main(String[] args) {
		List<Vehicle4> vehicle = Arrays.asList(
				new Vehicle4(2, "Car"),
				new Vehicle4(3, "Bike"),
				new Vehicle4(1, "Truck"));
		vehicle.stream()
//		 .sorted((v1, v2) -> Integer.compare(v1.getvid(), v2.getvid()))//line n1
		.sorted(Comparator.comparing((Vehicle4 v) -> v.getvid()))//line n1
		.forEach(System.out::print);
	}

}

/*
  Which two code fragments, when inserted at line n1 independently, enable the code to print TruckCarBike?
  D. .sorted((v1, v2) -> Integer.compare(v1.getVId(), v2.getVid()))
	E. .sorted(Comparator.comparing ((Vehicle v) -> v.getVId()))	
*/
