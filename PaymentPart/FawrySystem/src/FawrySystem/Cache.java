package FawrySystem;

public class Cache implements Payment{
	double amount;
	public Cache() {
		
	}
     public double pay(double amount) {
    	 return amount;
     }
     
     public boolean validatePay() {
    	 System.out.println("Allows Cache");
    	 return true;		
     }
     
     public void account(double amount) {
    	 System.out.println(" Pay on delivery ");
    	 
     }
}
