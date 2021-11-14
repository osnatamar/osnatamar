import java.util.Scanner;

public class Employeesalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int typeOfEmployee;
         do {
             System.out.println("Enter a  typeOfEmployee 0 for JuinorEmployee , 1 for seniorEmployee  :");
              typeOfEmployee = scanner.nextInt();
             System.out.println("Enter how many hours he worked: ");
             int numberOfHours = scanner.nextInt();
             System.out.println("Enter in a few days reached the goal: ");
             int daysReachedGoal = scanner.nextInt();
             System.out.println("The workers salary for the month is:" + monthlySalary(typeOfEmployee, numberOfHours, daysReachedGoal));
         } while (typeOfEmployee == 0 || typeOfEmployee ==1);
    }
    public static int monthlySalary(int typeOfEmployee, int numberOfHours,
                                    int daysReachedGoal) {
        int seniorEmployee = 1;
        int juniorEmployee = 0;
        int salary = 0;
        if (typeOfEmployee == 0) {
            salary = (numberOfHours * 50 + daysReachedGoal * 250);
            return salary;
        } else {
            salary = (numberOfHours * 200 + daysReachedGoal * 250);
            return salary;
        }
    }
}

