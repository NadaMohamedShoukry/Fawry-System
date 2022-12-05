package fawry;

import java.util.Scanner;

public class CancerHospital  implements Donations {
    Scanner input = new Scanner(System.in);

    @Override
    public double donate(double amount) {
        System.out.println("Enter Hospital Name: ");
        String name = input.next();
        // send amount to the hospital name
        System.out.println("You need to pay: " + amount);
        return amount;
    }
}
