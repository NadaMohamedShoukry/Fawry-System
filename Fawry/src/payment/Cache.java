package payment;

public class Cache implements Payment{
	
	double amount;
	String address;
	String number;
	
	public Cache(double amount,String address,String number)
	{
		this.amount=amount;
		this.address=address;
		this.number=number;
	}
	@Override
     public double pay(double amount) {
		this.amount=amount;
    	 return amount;
     }
     
	@Override
     public boolean validatePay() {
    	 System.out.println("Allows Cache");
    	 return true;		
     }
     
	@Override
     public void account(double amount) {
    	 System.out.println(" Pay on delivery ");
    	 
     }
//	
//	@Override
//	public void collectPayDet()
//	{
//		System.out.println("Enter the Address");
//		address=input.next();
//		System.out.println("Enter Phone Number");
//		number=input.next();
//		
//		
//		
//	}

}
