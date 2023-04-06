class Convert8{
public static void main(String []args){

  byte val=10;
  String B=Byte.toString(val);
  Byte C=Byte.valueOf(val);
Byte B1=Byte.valueOf(B);

System.out.println(B);
System.out.println(C);
System.out.println(B1);
}


}