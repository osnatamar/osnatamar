public class string {
    public static void main(String[] args) {
         //String exa = "Example";
    //   System.out.println(exa.substring(0, 2) + exa.substring(3, exa.length()));

    }

    public static String osnat(String str, int index) {
        String  str1= str.substring(0, 2) + str.substring(3, str.length());
        System.out.println(str.substring(0,2));
        return str1;
    }
    public static String swap(String str, char c1 , char c2  ){
        String newStr = str;
        int i = str.indexOf(c1);
        while (i != -1 ) {
            newStr = newStr.substring(0,i) + c2 + str.length();
            i = str.indexOf(c1 ,i+1);
        }
       return newStr;

    }
}