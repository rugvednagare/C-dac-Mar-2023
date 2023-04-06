/*class Convert28{
    public static void main(String args[]){

double D=4628.36;

    String S=String.valueOf(D);
    Double D1=Double.valueOf(D);
     Double D2=Double.valueOf(S);
     long L=Double.doubleToLongBits(D);

     String S1= Long.toBinaryString(L);
     String S2= Long.toOctalString(L);
     String S3=Double.toHexString(D);

     System.out.println(S);     
     System.out.println(D1);
     System.out.println(D2);
     System.out.println(S1);
       System.out.println(S2);
       System.out.println(S3);
    }
}
*/
class Convert29{

    public static void main(String args[]){
   Double D=57846.45;

 byte b1=D.byteValue();
 short s=D.shortValue();
 int i=D.intValue();
 float f=D.floatValue();
 double d=D.doubleValue();
 long l=D.longValue();

System.out.println(b1);
System.out.println(s);
System.out.println(i);
System.out.println(f);
System.out.println(d);
System.out.println(l);
}


    }
