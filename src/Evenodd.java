import java.util.Scanner;

public class Evenodd {

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber;
        int secondNumber;
        int sum ;
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        sum = firstNumber + secondNumber;
        if (sum% 2 ==0){
            System.out.println("The sum  is a even number"); }
        else {
            System.out.println("The number is a odd");
        }
    }
}

