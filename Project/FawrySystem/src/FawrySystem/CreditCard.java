package FawrySystem;

public class CreditCard implements Payment{
	String cardnumber;
	int Month;
	int Year;
	double availMoney;
	double amount;
	public CreditCard(String cardnumber,int Month,int Year,double availMoney,double amount) {
		this.cardnumber=cardnumber;
		this.Month=Month;
		this.Year=Year;
		this.availMoney=availMoney;
		this.amount=amount;
	}
     public double pay(double amount) {
    	 System.out.println(" Your Account Now " +  (availMoney-amount));
    	 return availMoney;
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
     
//     public void account(double amount) {
//    	 System.out.println(" Your Account Now " +  (availMoney-amount));
//    	 
//     }
}
