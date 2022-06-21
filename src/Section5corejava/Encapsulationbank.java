package Section5corejava;

public class Encapsulationbank {

	
		public int accountNo=12345;
		private int pinNo=54321;
		private double accountBalance=10000;
		
		
		
		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}




		public void setPinNo(int pinNo) {
			this.pinNo = pinNo;
		}




		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}




		public void changepin(int accountNo1,int oldpinNo1,int newpinNo )
		
		{
			
			if(accountNo==accountNo1&&pinNo==oldpinNo1)
			{
			pinNo=newpinNo;
			System.out.println("PinNo has been changed successfully");
		}
			else
			{
				System.out.println("Invalid Credentials!!!");
			}
			
		}
		
		
		
		
		public void withdraw(int accountNo1,int pinNo1,double amount1 )
		
		{
			if(accountNo==accountNo1&&pinNo==pinNo1)
			{
			double balanceAmount=accountBalance-amount1;
			System.out.println("Balance Amount="+balanceAmount);
		}
			else
			{
				System.out.println("Invalid Credentials!!!");
			}

		}
		
		
		
		}



