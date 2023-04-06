package Bmi;

import java.util.*;
class Calculator{
    private double Height;
    private double Weight;

    public Calculator(){
        this.Height=0.0;
        this.Weight=0.0; 
    }
        public double getHeight(){
        return this.Height;
        }
        public void setHeight(double Height){
        this.Height=Height;
        }
        public double getWeight(){
        return this.Weight;
        }
         public void setWeight(double Weight){
            this.Weight=Weight;
        }
}
class Basedata{
    Scanner sc = new Scanner(System.in);
    Calculator cal=new Calculator();
    public void acceptData(){
    
        System.out.println("Height  : ");
        cal.setHeight( sc.nextDouble() );

        System.out.println("Weight : ");
        cal.setWeight( sc.nextDouble() );  }
    
    public void Printdata()
     {   
        double Bmiop=((cal.getWeight())/(cal.getHeight()*cal.getHeight()));
        System.out.println("BMI Calculator O/P   : "+Bmiop);
    }
}
class Bmi{

    public static void main(String args[])
    {
        Basedata BmiCalculator=new Basedata();
        
        BmiCalculator.acceptData();
        BmiCalculator.Printdata();
     }

    }
     
    






