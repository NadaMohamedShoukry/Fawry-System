package fawry;

import java.util.Scanner;

public class Cache implements Payment{
	Scanner input = new Scanner(System.in);
	double amount;
	String address;
	String number;
	public Cache() {
		
	}
	
	public Cache(double amount)
	{
		this.amount=amount;
	}
	@Override
     public double pay(double amount) {
    	 return amount;
     }
     
	@Override
     public boolean validatePay() {
    	 System.out.println("Allows Cache");
    	 return true;		
     }
     
	@Override
     public void account(double amount) {
    	 System.out.println(" Pay on delivery ");
    	 
     }
	
	@Override
	public void collectPayDet()
	{
		System.out.println("Enter the Address");
		address=input.next();
		System.out.println("Enter Phone Number");
		number=input.next();
		
		
		
	}

}
