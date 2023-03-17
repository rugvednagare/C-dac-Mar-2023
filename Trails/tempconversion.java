
class tempconversion{
public static void main(String args[])

{
double temp_c=32.5;
//System.out.println("temp in C is="+temp_c);
double temp_f=((9/5)*temp_c+32);
System.out.println("temp in F is ="+temp_f);
 temp_f=43.5;
 temp_c=((5/9)*temp_f+32);
System.out.println("temp in C is="+temp_c);
}
}