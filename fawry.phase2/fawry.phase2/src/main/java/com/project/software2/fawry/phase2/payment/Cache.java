package com.project.software2.fawry.phase2.payment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cache implements Payment{
	
	double amount;
	String address;
	String number;
	
	@PostMapping(value="/cachedetails")
	public Cache cacheDetails(@RequestBody Cache obj) {
		//this.amount=obj.amount;
		this.address=obj.address;
		this.number= obj.number;	
		return this;
	}
	
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
	
	 @PostMapping(value="/cachepay/{amount}")
	@Override
     public double pay(@PathVariable("amount")double amount) {
		this.amount=amount;
    	 return amount;
     }
	 @GetMapping(value="/validatecache")
	@Override
     public boolean validatePay() {
    	 System.out.println("Allows Cache");
    	 return true;		
     }
     
	 @GetMapping(value="/cacheaccount/{amount}")
	@Override
     public String account(@PathVariable("amount")double amount) {
    	 System.out.println(" Pay on delivery ");
    	 return " Pay on delivery ";
     }
}


