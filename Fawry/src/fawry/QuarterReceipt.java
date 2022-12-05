package fawry;

import java.util.Scanner;

public class QuarterReceipt implements Landline {
    Scanner input = new Scanner(System.in);

    @Override
    public double payReceipt(double amount) {
        System.out.println("Enter Landline number: ");
        String number = input.next();
        // send number and amount to the company to Pay for internet
        System.out.println("You need to pay: " + amount * 3);
        return amount * 3;
    }

}
