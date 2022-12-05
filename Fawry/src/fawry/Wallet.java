package fawry;

public class Wallet implements Payment{
	double availMoney;
	double amount;

	public Wallet(){}

	
	public Wallet(double availMoney) {
		this.availMoney=availMoney;
	}
	@Override
     public double pay(double amount) {
		this.amount=amount;
    	 return amount;
     }
     @Override
     public boolean validatePay() {
    	 if(availMoney > amount) {
    		 return true;
    	 }else {
    		 return false;
    	 }
    		
     }
     
     @Override
     public double collectPayDet()
     {
    	 return availMoney;
     }
     
     public void account(double amount) {
    	 System.out.println(" Your Wallet Now " +  (availMoney-amount));
    	 
     }

}
