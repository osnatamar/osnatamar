import java.util.Random;
import java.util.Scanner;
public class Fate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1000) + 1;
        int playOne;
        int playTow;
        int numberTryOne = 0;
        int numberTryTwo = 0;
        do {
            System.out.println("play  one please enter a number 1-1000");
            playOne = scanner.nextInt();
            numberTryOne++;
            if (playOne == randomNumber) {
                System.out.println("you are win"+ " " + numberTryOne +" " + "tries");
                break;
            } else if (playOne > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }

            System.out.println("play tow please enter a number 1-1000");
            playTow = scanner.nextInt();
            numberTryTwo++;
            if (playTow == randomNumber) {
                System.out.println("You  are win" + numberTryTwo + "tries");
                break;
            } else if (playTow > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }


            while (playOne != randomNumber && playTow !=  randomNumber) ;

    }
}
