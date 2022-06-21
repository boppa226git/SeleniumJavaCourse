package Section5corejava;

public class EncapsulationAtm {

	public static void main(String[] args) {
		Encapsulationbank objbank=new Encapsulationbank();
		objbank.setAccountNo(123456789);
		objbank.setPinNo(55555);
		objbank.setAccountBalance(100000);
		objbank.changepin(12345, 54321, 55555);
		objbank.withdraw(12345, 12345, 100);
		objbank.withdraw(12345, 55555, 100);
		
	}

}
