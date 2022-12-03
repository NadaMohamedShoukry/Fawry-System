package FawrySystem;

import java.util.Scanner;

public class Services implements ServiceFactory {
    Scanner input = new Scanner(System.in);

    @Override
    public double payForDonations(Donations d) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double payForInternet(InternetPayment i) {
        System.out.println("Enter Internet fee: ");
        double amount = input.nextDouble();
        double cost = i.internetPay(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
    }

    @Override
    public double payForLandline(Landline l) {
    	System.out.println("Enter Landline fee per month: ");
        double amount = input.nextDouble();
        double cost = l.payReceipt(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
    }

    @Override
    public double payForMobile(MobileRecharge m) {
        System.out.println("Enter recharge amount: ");
        double amount = input.nextDouble();
        double cost = m.recharge(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
        // p.pay(amount); //we will call it later after coding it

    }

}
