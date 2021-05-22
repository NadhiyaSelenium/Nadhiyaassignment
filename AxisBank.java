package Assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Deposists in Bank class");
	}
	
	public static void main(String[]args)
	{
		AxisBank axis= new AxisBank();
		axis.deposit();
		axis.saving();
		axis.fixed();
	}

}
