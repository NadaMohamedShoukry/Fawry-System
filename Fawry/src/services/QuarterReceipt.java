package services;

public class QuarterReceipt implements Landline {
	
    String landNumber; 
    public QuarterReceipt(String numb) {
    	this.landNumber=numb;
    }

    @Override
    public double payReceipt(double amount) {    
        // send number and amount to the company to Pay for internet(landNumber)
        System.out.println("You need to pay: " + amount * 3);
        return amount * 3;
    }

}
