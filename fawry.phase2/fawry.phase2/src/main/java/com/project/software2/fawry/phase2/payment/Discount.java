package com.project.software2.fawry.phase2.payment;

import org.springframework.stereotype.Service;

@Service
public class Discount implements Payment{
	public Payment obj;
	public double amount;
	
	@Override
	public double pay(double amount) {
		return amount;
	}

	@Override
	public boolean validatePay() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String account(double amount) {
		// TODO Auto-generated method stub
		return "";
		
	}


}
