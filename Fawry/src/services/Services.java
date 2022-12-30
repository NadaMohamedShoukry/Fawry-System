package services;

public class Services implements ServiceFactory {

    @Override
    public double payForDonations(Donations d, double amount) {
    	 
         double cost = d.donate(amount);
         // servID++;
         servs.add(cost); // to help in refund method
         System.out.println("the service ID is:" + servs.lastIndexOf(cost));
         return cost;
    }

    @Override
    public double payForInternet(InternetPayment i, double amount) {
        double cost = i.internetPay(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
    }

    @Override
    public double payForLandline(Landline l, double amount) {
        double cost = l.payReceipt(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
    }

    @Override
    public double payForMobile(MobileRecharge m, double amount) {
        double cost = m.recharge(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
        // p.pay(amount); //we will call it later after coding it

    }


}
