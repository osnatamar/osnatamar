import java.util.Scanner;

public class FirstNumbers {

    public static void main(String[] args) {
        int selectedVariable = selectNumber();

        for(int i=0 ; i<=selectedVariable;i++){
            if(checkPrime(i))
                System.out.println(i);
        }

    }
    public static boolean checkDividable(int firstNumber, int secondNumber){
        return (firstNumber % secondNumber)==0;
    }

    public static boolean checkPrime(int number){
        if(number <= 2){
            return false;
        }

        for(int i=2; i<number; i++){
            if(checkDividable(number,i))
                return false;
        }

        return true;
    }

    public static int selectNumber(){
        Scanner sc = new Scanner(System.in);

        int number = -1;
        do {
            number = sc.nextInt();
        } while(number < 0);

        return number;
    }
}

