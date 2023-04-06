/*class Convert15{

    public static void main(String args[]){
        int I=25;

        System.out.println("Size of Integer value in Bits :"+(int)Integer.SIZE);
System.out.println("Size of Integer value in Byts :"+(int)Integer.BYTES);
System.out.println("Maximum value of Integer :"+(int)Integer.MIN_VALUE);
System.out.println("Minimum value of Integer :"+(int)Integer.MAX_VALUE);
    }
}*/

class Convert16{
    public static void main(String args[]){
    
    int I=30;
    String S=Integer.toString(I);
    Integer I1=Integer.valueOf(I);
    Integer I2=Integer.parseInt(S);
    String S1=Integer.toHexString(I);
    String S2=Integer.toOctalString(I);
     String S3=Integer.toBinaryString(I);

     System.out.println(S);
     System.out.println(I1);
     System.out.println(I2);
     System.out.println(S1);
     System.out.println(S2);
     System.out.println(S3);




    }
}