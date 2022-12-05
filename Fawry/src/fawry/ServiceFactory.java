package fawry;

import java.util.ArrayList;

public interface ServiceFactory {

	//public static int servID = 0;
	public int servID=-1;
    public static ArrayList<Double> servs = new ArrayList<>();

    public double payForMobile(MobileRecharge m);

    public double payForInternet(InternetPayment i);

    public double payForLandline(Landline l);

    public double payForDonations(Donations d);
}
