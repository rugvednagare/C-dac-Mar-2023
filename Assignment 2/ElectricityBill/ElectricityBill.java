package ElectricityBill;
//import java.lang.*;
import java.util.Scanner;

class Program {

    String customerName;
    double unitsConsumed;
    double billAmount;

    public Program() {
        customerName = "Rugved Nagare";
        unitsConsumed = 0.0;

    }

    public double getUnitsCunsumed() {
        return this.unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumned) {
        this.unitsConsumed = unitsConsumned;
    }

    Scanner sc = new Scanner(System.in);

    void calculateBillAmount() {
        
        System.out.println("Enter the Units Consumed    :");
        setUnitsConsumed(sc.nextDouble());

        if (unitsConsumed < 100) {

            double Bill = (unitsConsumed * 5);
            System.out.println("Your Light Bill is   :" + Bill);
        } else if (unitsConsumed > 100 && unitsConsumed < 200) {
            double Bill1 = (unitsConsumed * 7);
            System.out.println("Your Light Bill is    :" + Bill1);
        } else {
            double Bill2 = (unitsConsumed * 10);
            System.out.println("Your Light Bill is    :" + Bill2);
        }

    }

    class ElecticityBill {

        public static void main (String []args){
            Program B1 = new Program();
            B1.calculateBillAmount();
        }

    }
}
