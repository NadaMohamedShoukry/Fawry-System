package FawrySystem;

public class CreditCard implements Payment{
	String cardname;
	double availMoney;
	double amount;
	public CreditCard(String cardname,double availMoney) {
		this.cardname=cardname;
		this.availMoney=availMoney;
	}
     public double pay(double amount) {
    	 return amount;
     }
     
     public boolean validatePay() {
    	 if(availMoney > amount) {
    		 System.out.println("Money in Your Account : "+ (availMoney));
    		 System.out.println("Paid Sucessfully");
    		 return true;
    	 }else {
    		 System.out.println("Not Enough Money");
    		 return false;
    	 }
    		
     }
     
     public void account(double amount) {
    	 System.out.println(" Your Account Now " +  (availMoney-amount));
    	 
     }
}
