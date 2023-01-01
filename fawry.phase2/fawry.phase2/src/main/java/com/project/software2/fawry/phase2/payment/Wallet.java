package com.project.software2.fawry.phase2.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wallet implements Payment{
	
	public double availMoney;
	double amount;
	String verfyNum;
//	public Wallet(double availMoney, String verfyNum) {
//		this.availMoney=availMoney;
//		this.verfyNum=verfyNum;
//	}
	@PostMapping(value="/walletdetails")
	public Wallet walletDetails(@RequestBody Wallet obj) {
		//this.amount=obj.amount;
		this.availMoney=obj.availMoney;
		this.verfyNum= obj.verfyNum;
		return this;
	}
	 @PostMapping(value="/walletpay/{amount}")
	@Override
     public double pay(@PathVariable("amount")double amount) {
		this.amount=amount;
    	 return amount;
     }
	 @GetMapping(value="/validatewallet")
     @Override
     public boolean validatePay() {
    	 if(availMoney > amount) {
    		 return true;
    	 }else {
    		 return false;
    	 }
    		
     }
     
//     @Override
//     public void collectPayDet()
//     {
//    	 System.out.println("Enter verfy message");
// 		verfyNum=input.next();
//     }
//     
	 @GetMapping(value="/walletaccount/{amount}")
     public String account(@PathVariable("amount")double amount) {
    	 System.out.println(" Your Wallet Now " +  (availMoney-amount));
    	 return (" Your Wallet Now " +  (availMoney-amount));
    	 
     }
	 public void setAmount(double amount) {
			this.amount=amount;
		}
	 
		public void setavailMoney(double amount) {
			this.availMoney=amount;
		}
		public void setVerfyNum(String verfyNum) {
			this.verfyNum=verfyNum;
		}
		
		public double getAmount() {
			return amount;
		}
		public double getAvailMoney() {
			return availMoney;
		}
		public String getVerfyNum() {
			return verfyNum;
		}

}
