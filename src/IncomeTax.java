import java.util.Scanner;

public class IncomeTax {
    public static void main (String [] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println ("Enter a day  ");
         int  day = scanner.nextInt();
         System.out.println("Enter what is the earliest hour you can arrive" );
        int  earlyHour = scanner.nextInt();
        System.out.println("Enter what is the latest hour you can arrive");
         int lateHour = scanner.nextInt();
         switch(day) {
             case 1:
             case 2:
             case 4:
             case 5:
         if (  earlyHour < 9 && lateHour < 17 ) {
             System.out.println("You can come");
         }  if ( earlyHour > 9 || lateHour > 17) {
                 System.out.println( "Lncome tax is open from 9 a.m. to 5 p.m.");
             }
         break;
             case 3:
                 if (  earlyHour < 8 && lateHour < 12 ) {
                     System.out.println("You can come");
                 }  if ( earlyHour > 8 || lateHour > 12) {
                 System.out.println("Lncome tax is open from  8 a.m. to 12 p.m.");
                 break;
             }
             case 6: case 7:
                 System.out.println( "Closed income tax weekends");
                 break;
             default:
                 System.out.println("You hava selected an invalid day or time");

             }
    }
}
