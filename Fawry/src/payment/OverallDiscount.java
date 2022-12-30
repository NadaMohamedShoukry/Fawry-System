package payment;

public class OverallDiscount extends Discount{
    double overAll;
    public OverallDiscount(Payment obj) {
  	  super.obj=obj;
    }
    
    public double pay(double amount) {
    	overAll = obj.pay(amount);
		overAll =overAll-((overAll/100)*10.0);
	return overAll;
    }
   
}