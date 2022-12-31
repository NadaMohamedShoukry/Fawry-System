package com.project.software2.fawry.phase2.payment;


public class Cache implements Payment{
	
	double amount;
	String address;
	String number;
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public void setNum(String number) {
		this.number=number;
	}
	
	public double getAmount() {
		return amount;
	}
	public String getAdd() {
		return address;
	}
	public String getNum() {
		return number;
	}
	
//	public Cache(double amount,String address,String number)
//	{
//		this.amount=amount;
//		this.address=address;
//		this.number=number;
//	}
	@Override
     public double pay(double amount) {
		this.amount=amount;
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
}


