package com.project.software2.fawry.phase2.payment;

public class SpecialDiscount extends Discount{
	double overAll;
	//Services s;
    public SpecialDiscount(Payment obj) {
 	   super.obj=obj;
    }
    public double pay(double amount) {
    		overAll = obj.pay(amount);
    		overAll =overAll-((overAll/100)*20.0);
    	return overAll;
    }

}
