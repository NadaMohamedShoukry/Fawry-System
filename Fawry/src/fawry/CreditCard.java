package fawry;

import java.util.Scanner;

public class CreditCard implements Payment{
	Scanner input = new Scanner(System.in);
	String cardnumber;
	int Month;
	int Year;
	double availMoney;
	double amount;
	public CreditCard(String cardnumber,int Month,int Year,double availMoney,double amount) {
		this.cardnumber=cardnumber;
		this.Month=Month;
		this.Year=Year;
		this.availMoney=availMoney;
		this.amount=amount;
	}
	@Override
     public double pay(double amount) {
    	 System.out.println(" Your Account Now " +  (availMoney-amount));
    	 return availMoney;
     }
     
	@Override
     public boolean validatePay() {
    	 if(availMoney > amount) {
    		 System.out.println("Money in Your Account : "+ (availMoney));
    		 System.out.println("Paid Sucessfully");
    		 return true;
    	 }else {
    		 System.out.println("Not Enough Money");
    		 return false;
    	 }
    		
     }
     
	@Override
     public void account(double amount) {
    	 System.out.println(" Your Account Now " +  (availMoney-amount));
    	 
     }
	
	@Override
	public double collectPayDet()
	{
		System.out.println("Enter Card No.:");
		input = new Scanner(System.in);
		cardnumber=input.next();
		System.out.println("Enter Month:");
		input = new Scanner(System.in);
		Month=input.nextInt();
		System.out.println("Enter Year:");
		input = new Scanner(System.in);
		Year=input.nextInt();
		System.out.println("Enter Price:");
		input = new Scanner(System.in);
		amount=input.nextDouble();
		
		return availMoney - amount;
	}

}
