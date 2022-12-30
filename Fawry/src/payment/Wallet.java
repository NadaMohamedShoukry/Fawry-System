package payment;

public class Wallet implements Payment{
	
	public double availMoney;
	double amount;
	String verfyNum;

//	public Wallet(double availMoney, String verfyNum) {
//		this.availMoney=availMoney;
//		this.verfyNum=verfyNum;
//	}
	public void setAvailMoney(double availMoney) {
		this.availMoney = availMoney;
	}
	public void setverfyNum(String verfyNum) {
		this.verfyNum= verfyNum;
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
     
//     @Override
//     public void collectPayDet()
//     {
//    	 System.out.println("Enter verfy message");
// 		verfyNum=input.next();
//     }
//     
     public void account(double amount) {
    	 System.out.println(" Your Wallet Now " +  (availMoney-amount));
    	 
     }

}
