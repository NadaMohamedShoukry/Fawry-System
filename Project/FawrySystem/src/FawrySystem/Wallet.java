package FawrySystem;

public class Wallet implements Payment{
	double availMoney;
	double amount;

	public Wallet() {
		
	}

	
	
	public Wallet(double availMoney) {
		this.availMoney=availMoney;
	}
	@Override
     public double pay(double amount) {
    	 System.out.println(" Your Wallet Now " +  (availMoney-amount));
    	 return availMoney;
     }
     @Override
     public boolean validatePay() {
    	 if(availMoney > amount) {
    		 return true;
    	 }else {
    		 return false;
    	 }
    		
     }
     
//     public void account(double amount) {
//    	 System.out.println(" Your Wallet Now " +  (availMoney-amount));
//    	 
//     }
}
