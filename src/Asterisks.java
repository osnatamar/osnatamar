 import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
        int number = Nunber();
         Asterisk(number);

    }

    public static int Nunber() {
        int number;
      do {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter a number between 5-20 ");
          number = scanner.nextInt();
      }    while (number > 21 || number < 4) ;
    return number;
    }
    public static void Asterisk(int number){
        for ( int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
                    System.out.println("");
                }
            }

}

