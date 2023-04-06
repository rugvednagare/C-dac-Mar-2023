class Convert20{

public static void main (String args[]){

    long L=356472l;
    
     String S=Long.toString(L);
     Long L1=Long.valueOf(L);
     Long L2=Long.valueOf(S);
     String S1=Long.toBinaryString(L);
     String S2=Long.toOctalString(L);
     String S3=Long.toHexString(L);

System.out.println(S);
System.out.println(L1);
System.out.println(L2);
System.out.println(S1);
System.out.println(S2);
System.out.println(S);
}
    
}