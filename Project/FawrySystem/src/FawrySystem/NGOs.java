package FawrySystem;

import java.util.Scanner;

public class NGOs implements Donations {
    Scanner input = new Scanner(System.in);

    @Override
    public double donate(double amount) {
        System.out.println("Enter NGO (organizations) Name: ");
        String name = input.next();
        // send amount to the organizations name
        System.out.println("You need to pay: " + amount);
        return amount;
    }

}
