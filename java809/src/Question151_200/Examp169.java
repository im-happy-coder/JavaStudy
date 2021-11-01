package Question151_200;
class FuelNotAvailException extends Exception { }
class Vehicle {
public void ride() throws FuelNotAvailException { //line n1
System.out.println("Happy Journey!");
}
}
class SolarVehicle extends Vehicle {
public void ride () throws FuelNotAvailException { //line n2 
	super.ride();
}
}

public class Examp169 {

	public static void main(String[] args) throws Exception{
			Vehicle v = new SolarVehicle ();
			v.ride();
	}

}
//Which modification enables the code fragment to print Happy Journey!?


/*A. Replace line n1 with public void ride() throws FuelNotAvailException {
B. Replace line n1 with protected void ride() throws Exception {
C. Replace line n2 with public void ride()throws FuelNotAvailException, Exception {
D. Replace line n2 with private void ride() throws FuelNotAvailException {*/




//https://www.briefmenow.org/oracle/which-modification-enables-the-code-fragment-to-print-h/ 
// 이사이트와 유형이 비슷하니 참고하자