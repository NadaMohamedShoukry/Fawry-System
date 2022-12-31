package com.project.software2.fawry.phase2.payment;



public class CreditCard implements Payment{
	
	String cardnumber;
	public int Month;
	public int Year;
	public double  availMoney;
	public double amount;
	
	public  CreditCard(double aval) {
		this.availMoney=aval;
	}
	public CreditCard(String cardnumber,int Month,int Year,double availMoney,double amount) {
		this.cardnumber=cardnumber;
		this.Month=Month;
		this.Year=Year;
		this.availMoney=availMoney;
		this.amount=amount;
	}
	@Override
     public double pay(double amount) {
		this.amount=amount;
		return amount;
     }
     
	@Override
     public boolean validatePay() {
    	 if(availMoney > amount) {
    		 System.out.println("Money in Your Account : "+ (availMoney));
    		 System.out.println("Enough Money");
    		 return true;
    	 }else {
    		 System.out.println("Not Enough Money");
    		 return false;
    	 }
    		
     }
     
	@Override
     public void account(double amount) {
    	 System.out.println(" Your Account Now " + (availMoney-amount));
    }
	

}
