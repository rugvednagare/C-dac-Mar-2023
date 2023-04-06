import java.util.*;

class Program {
    private String CustomerName;
    private String PhoneNo;
    private int No_of_Calls;
    private double Duration_of_calls;

    Program() {
        CustomerName = " ";
        PhoneNo = "0000000000";
        No_of_Calls = 0;
        Duration_of_calls = 0.0;
    }

    public String getCustomerName() {
        return this.CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getPhoneNo() {
        return this.PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public int getNo_of_Calls() {
        return this.No_of_Calls;
    }

    public void setNo_of_Calls(int No_of_Calls) {
        this.No_of_Calls = No_of_Calls;
    }

    public double getDuration_of_calls() {
        return this.Duration_of_calls;
    }

    public void setDuration_of_calls(double Duration_of_calls) {
        this.Duration_of_calls = Duration_of_calls;
    }
}
class Calculation {
        Scanner sc = new Scanner(System.in);
        Program prg=new Program();

        void acceptrecord() {

            System.out.println("Enter the customer name    :");
            prg.setCustomerName(sc.nextLine());
            sc.nextLine();

            System.out.println("Enter the Phone no :");
            prg.setPhoneNo(sc.nextLine());

            System.out.println("Enter the No. of Calls :");
            prg.setNo_of_Calls(sc.nextInt());

            System.out.println("Enter the Duration Of Calls :");
            prg.setDuration_of_calls(sc.nextDouble());

        }

        void GenerateBill(){
            int Fix_Rate=10;

            if (prg.getNo_of_Calls() < 100) {
                System.out.println("Your Bill is  :" + (prg.getNo_of_Calls() * 50+(Fix_Rate)));
            } else if (prg.getNo_of_Calls() > 100) {
                System.out.print("Your Bill is  :" + (prg.getNo_of_Calls() * 25+(Fix_Rate)));

            }

        }
    }
class TelephoneBill {
    public static void main (String args[])throws Exception{
        Calculation Cal=new Calculation();
        Cal.acceptrecord();
        Cal.GenerateBill();


    }
}
