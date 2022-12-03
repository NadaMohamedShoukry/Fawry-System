package FawrySystem;

import java.util.*;

public class Refund {
    Payment p = new Wallet(getMoney());
    ServiceFactory s;
    boolean status;

    public void RefundRequest() {
        System.out.println("Enter ID of the service: ");
        int ID = input.next();
        // send refund request to admin
        System.out.println("your refund request is send to the admin.");
        if (status) {
            System.our.println("your requset had been accepted check your wallet.");
        }
        System.out.println("your refund request has been rejected.");
    }

    public double getMoney() {
        if (status) {
            p.availMoney += s.amount;
        }

        return 0;
    }

}
