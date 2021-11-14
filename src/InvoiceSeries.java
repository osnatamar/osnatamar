import java.util.Scanner;

public class InvoiceSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  firstNumber ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a differenceOfNumbers ");
        int differenceOfNumbers = scanner.nextInt();
        System.out.println("Enter a amount of number    ");
        int amountOfNumber = scanner.nextInt();
        seriesOrgans(firstNumber, differenceOfNumbers, amountOfNumber);

    }

    public static void seriesOrgans(int firstNumber, int difference, int amountOfNumber) {
        int i;
        for (i = 0;i < amountOfNumber;i++ ) {
            firstNumber += difference;
            System.out.println(firstNumber);

        }
        }
    }





