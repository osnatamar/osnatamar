import java.util.Scanner;

public class Ascendingorder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3 && number2 > number3) {
            System.out.println(number1 + "max" + number2 + "mid" + number3 + "min");
            }
        if( number1 > number2 && number1 > number3 && number2 < number3) {
                System.out.println(number1 + "max" + number3 + "mid" + number2 + "min");
            }
            if (number2 > number1 && number2 > number3 && number1 > number3) {

                System.out.println(number2 + "max" + number1 + "mid" + number3 + "min");
            }
            if (number2 > number1 && number2 > number3 && number1 < number3) {
                System.out.println(number2 + "max" + number3 + "mid" + number1 + "min");
            }
            if (number3 > number2 && number3 > number1 && number2 > number1) {
                System.out.println(number3 + "max" + number2 + "mid" + number1 + "min");
            }
            if (number3 > number2 && number3 > number1 && number2 < number1) {
                System.out.println(number3 + "max" + number1 + "mid" + number2 + "min");
            }

        }
    }


