package fawry;

import java.util.Scanner;

public class Orange  implements MobileRecharge, InternetPayment {
    Scanner input = new Scanner(System.in);

    @Override
    public double recharge(double amount) {
        System.out.println("Enter mobile number: ");
        // send number and amount to the company to charge money
        System.out.println("You need to pay: " + (amount * 1.5));
        return (amount * 1.5);
    }

    @Override
    public double internetPay(double amount) {
        System.out.println("Enter Landline number used to internet: ");
        String number = input.next();
        // send number and amount to the company to Pay for internet
        System.out.println("You need to pay: " + amount);
        return amount;
    }


}
