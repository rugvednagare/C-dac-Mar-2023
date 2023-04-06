/*class Convert24{
    public static void main(String args[]){

    float F=46374f;

    String S=String.valueOf(F);
    Float F1=Float.valueOf(F);
     Float F2=Float.valueOf(S);
     String F3=Float.toHexString(F);

     System.out.println(S);     
     System.out.println(F1);
     System.out.println(F2);
     System.out.println(F3);
    
    }
}*/

class Convert24{

    public static void main(String args[]){
   Float F=2556f;

 byte b1=F.byteValue();
 short s=F.shortValue();
 int i=F.intValue();
 float f=F.floatValue();
 double d=F.doubleValue();
 long l=F.longValue();

System.out.println(b1);
System.out.println(s);
System.out.println(i);
System.out.println(f);
System.out.println(d);
System.out.println(l);
}


    }