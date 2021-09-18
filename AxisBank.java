package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("The deposit method in Axis bank class");
	}
	
	public static void main(String[] args) {
		AxisBank bankObj = new AxisBank();
		bankObj.deposit();
		bankObj.saving();
		bankObj.fixed();
	}
}
