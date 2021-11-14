import java.util.Scanner;

public class Quadraticequation {
      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        double calculationRoot = b*b-4*a*c;
        double root= Math.sqrt(calculationRoot);
        double result1 = (-b+root)/2*a;
          double result2 = (-b-root)/2*a;
        if (calculationRoot==0){
            System.out.println("There is 1 result: x= " + result1 );
        }
        if (calculationRoot > 0){
            System.out.println( "There is 2 result x1 =" + result1 + " x2 =" + result2);
        }
        if (calculationRoot <  0){
            System.out.println("The equation has no solutions");
        }


    }


}