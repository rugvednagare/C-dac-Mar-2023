/*class Convert32{

    public static void main(String args[]){
    System.out.println("Enter your argument from cmd :"+args[2]);    

    }
}*/

class Convert32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=Integer.parseInt(args[0]);
        fLoat j=Float.parseInt(args[1]);
        double k=Double.parseInt(args[2]);
        int choice=0;
            
        do {
            System.out.println("1.Addition :");
            System.out.println("2.Substraction :");
            System.out.println("3.Multiplication :");
            System.out.println("4.Division :");
            System.out.println("5.Exit :");

            choice=sc.nextInt();
            switch(choice){
                case 1:System.out.println("Addition:"+(i+j+k) );
                break;
                case 2:System.out.println("Substraction :"+(i-j-k));
                break;
                case 3:System.out.println("Multiplication :"+(i-j-k));
                break;
                case 4:System.out.println("Division :"+(i*j*k));
                break;
                case 5:System.out.println("Exit");
            }
        
        }while(choice !=5);


         }
        }   

    
