public class C {
    public static void main(String[] args) {
        double[] arrExa = {1, 2, 3, 4, 5, 6, 7};
        sumArray(arrExa);
        System.out.println(sumArray(arrExa));

    }

    public static double sumArray(double arr[]) {
        double sum = 0;


        for (int i = 0; i < arr.length; i++) {


            sum = sum + arr[i];
        }
        return sum;

        }
}
