package services;

public class CancerHospital  implements Donations {
    
   String hosptName;
   public CancerHospital(String name) {
	   this.hosptName=name;
   }
    
    @Override
    public double donate(double amount) {
        // send amount to the hospital name (hosptName)
        System.out.println("You need to pay: " + amount);
        return amount;
    }
}
