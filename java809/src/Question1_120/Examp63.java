package Question1_120;
class FuelNotAvailException extends Exception { }
class Vehicle3 {
protected void ride() throws Exception { //line n1
System.out.println("Happy Journey!");
}
}             //같은 ride()메서드는 throws 예외를 던질때 서로 같아야한다.
class SolarVehicle extends Vehicle3 {
public void ride() throws Exception { //line n2
super.ride() ;
}
}
public class Examp63 {

	public static void main(String[] args)throws FuelNotAvailException, Exception {
		Vehicle3 v = new SolarVehicle ();
		v.ride();
	}

}
//  답 : Replace line n1 with protected void ride() throws Exception {