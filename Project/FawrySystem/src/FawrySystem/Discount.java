package FawrySystem;

public interface Discount implements Paymnet{
	Payment s = new Payment();
	double cost;
	
	public double pay(double amount);
	public void collectPayDet();
	public boolean validatePay();
	public void addDiscount(Discount d);
}
