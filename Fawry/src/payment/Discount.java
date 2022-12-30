package payment;

public abstract class Discount implements Payment{
	public Payment obj;
	public double amount;
	
	@Override
	public double pay(double amount) {
		return amount;
	}

//	@Override
//	public void collectPayDet() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public boolean validatePay() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void account(double amount) {
		// TODO Auto-generated method stub
		
	}

}
