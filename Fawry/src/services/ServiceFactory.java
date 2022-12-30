package services;

import java.util.ArrayList;

public interface ServiceFactory {

	//public static int servID = 0;
	public int servID=-1;
    public static ArrayList<Double> servs = new ArrayList<>();

    public double payForMobile(MobileRecharge m, double amount);

    public double payForInternet(InternetPayment i, double amount);

    public double payForLandline(Landline l, double amount);

    public double payForDonations(Donations d, double amount);
}
