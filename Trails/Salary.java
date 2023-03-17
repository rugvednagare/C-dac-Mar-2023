class Salary 
{
public static void main(String args[])
{ 
double basicSalary=10000.478936;
double TA=5600.6778;
double PA=7000.5674;
double DA =0.14*basicSalary;
double TaxDeduction= (0.0176*DA);

 System.out.println("basicSalary  ="+basicSalary);
 System.out.println("Travlling allowance ="+TA);
 System.out.println("Petrol Allowance = "+PA);
 System.out.println("DA               ="+DA);
 System.out.println("Tax Deduction ="+TaxDeduction);
 
 Double GrossSalary = ((basicSalary+TA+DA+PA)-TaxDeduction);
 System.out.println("Total Salary="+GrossSalary);
 }
 
}