import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    }

    public static int[] fillArray(int size, int value) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
        }
        return numbers;
    }
 public static void printArr(int []arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println( arr [i] + ",");

        }
 }

 public static int [] creatArrayWithSuccossors ( int size , int firstNumber) {
        int [] numbers = new int [size];
        int currenNumbers = firstNumber;
        for ( int i = 0; i < numbers.length ; i++) {
            numbers [i] = currenNumbers;
            currenNumbers++;
        }
        return numbers;





 }
}