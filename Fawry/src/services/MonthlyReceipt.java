package services;

public class MonthlyReceipt implements Landline {
	
    String landNumber; 
    public MonthlyReceipt(String numb) {
    	this.landNumber=numb;
    }
    @Override
    public double payReceipt(double amount) {
        
        // send number and amount to the company to Pay for internet(landNumber)
        System.out.println("You need to pay: " + amount);
        return amount;
    }

}
