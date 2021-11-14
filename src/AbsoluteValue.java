import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter a number ");
        int number = scanner.nextInt();
        if( number >  0 ) {
            System.out.println( "The value of is " + number);
        }else {
            System.out.println( "The absolute value number" + number * -1);

        }

    }
}
