package Week3.day2;

public class Axisbank extends BankInfo{
	public void deposit() {
		System.out.println("Money");
		
	}
public static void main(String[] args) {
	Axisbank Money=new Axisbank();
	Money.deposit();
	
			
	
}

}
abstract class BankInfo{
	public void saving() {
		System.out.println("Save Money");
		
	}
	public void fixed() {
		System.out.println("Fixed");
	}
abstract public void deposit();
}