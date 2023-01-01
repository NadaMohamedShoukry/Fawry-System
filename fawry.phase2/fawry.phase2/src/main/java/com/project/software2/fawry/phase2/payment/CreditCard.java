package com.project.software2.fawry.phase2.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCard implements Payment{
	
	String cardnumber;
	public int Month;
	public int Year;
	public double  availMoney;
	public double amount;
	
//	public  CreditCard(double aval) {
//		this.availMoney=aval;
//	}
//	public CreditCard(String cardnumber,int Month,int Year,double availMoney,double amount) {
//		this.cardnumber=cardnumber;
//		this.Month=Month;
//		this.Year=Year;
//		this.availMoney=availMoney;
//		this.amount=amount;
//	}
	@PostMapping(value="/creditdetails")
	public CreditCard creditDetails(@RequestBody CreditCard obj) {
		//this.amount=obj.amount;
		this.availMoney=obj.availMoney;
		this.cardnumber= obj.cardnumber;
		this.Month=obj.Month;
		this.Year=obj.Year;
		return this;
	}
	 @PostMapping(value="/creditpay/{amount}")
	@Override
     public double pay(@PathVariable("amount")double amount) {
		this.amount=amount;
		return amount;
     }
     
	 @GetMapping(value="/validatecredit")
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
     
	 @GetMapping(value="/creditaccount/{amount}")
	@Override
     public String account(@PathVariable("amount")double amount) {
    	 System.out.println(" Your Account Now " + (availMoney-amount));
    	 return (" Your Account Now " + (availMoney-amount));
    }
	
	 public void setAmount(double amount) {
			this.amount=amount;
		}
		public void setavailMoney(double amount) {
			this.availMoney=amount;
		}
		
		public void setMonth(int month) {
			this.Month=month;
		}
		public void setYear(int y) {
			this.Year=y;
		}
		
		
		public double getAmount() {
			return amount;
		}
		public double getAvailMoney() {
			return availMoney;
		}
		public int getMonth() {
			return Month;
		}
		public int getYear() {
			return Year;
		}

}
