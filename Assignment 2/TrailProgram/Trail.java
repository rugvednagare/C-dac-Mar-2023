package TrailProgram;
import java.util.Date;
import java.text.SimpleDateFormat;

class Trail{
  public static void main(String[] args) {
    Date date = new Date( );
    //SimpleDateFormat sdf = new SimpleDateFormat( "dd-MM-yyyy");     
    //SimpleDateFormat sdf = new SimpleDateFormat( "dd/MMM/yyyy");
    SimpleDateFormat sdf = new SimpleDateFormat( "dd/MMMM/yyyy");
    String strDate = sdf.format(date);
    System.out.println( strDate );
  }
  public static void main1(String[] args)throws Exception {
    String pattern = "dd/MM/yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat( pattern); 
    String source = "23/07/1983";
    Date date = sdf.parse( source );
    
    int day = date.getDate();
    int month = date.getMonth() + 1;
    int year = date.getYear() + 1900;
    System.out.println(day+" / "+month+" / "+year);
  }
}
