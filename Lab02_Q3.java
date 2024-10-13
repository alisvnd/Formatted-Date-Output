
import java.util.Scanner ;

public class Lab02_Q3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in) ;
        System.out.print("Enter date and time:");
        String allDate = in.nextLine() ;

        int FirstSlash = allDate.indexOf("/") ;
        int SecondSlash = allDate.indexOf("/", FirstSlash + 1) ;


        String Date = allDate.substring(SecondSlash + 1, allDate.indexOf(",")).trim();
        String Day = allDate.substring(allDate.indexOf(",")+1 , allDate.indexOf("-")).trim();
        String Month = allDate.substring(FirstSlash +1, SecondSlash).trim();
        String Year = allDate.substring(0, 4) ;
        String Hour = allDate.substring(allDate.indexOf("-" )+1, allDate.indexOf(":")).trim() ;
        String Minute = allDate.substring(allDate.indexOf(":")+1) ;
        


        System.out.printf("%n %-10s %-10s" , "Date: " , Date);
        System.out.printf("%n %-10s %-10s" , "Day: " , Day);
        System.out.printf("%n %-10s %-10s" , "Month: " , Month);
        System.out.printf("%n %-10s %-10s" , "Year: " , Year);
        System.out.printf("%n %-10s %-10s" , "Time: " , Minute + " Minutes after " + Hour);
       
    }
    
}
