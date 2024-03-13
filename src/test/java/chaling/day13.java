package chaling;

public class day13 {


    public static void main(String[] args) {
        System.out.println(reverseString("String to reverse"));

    }

   //1. write a java program that revers String
    public static String reverseString(String input) {

    String result = "";
    for (int i = input.length()-1; i>=0;i--){

        result += input.charAt(i);
    }
    return result;
    }

    //2. write a java program to swab two number
    public static void  swabNumber(int a, int b){
        System.out.println("Before swab :");
        System.out.println("a: " + a + " ");
        System.out.println("b: " + b + " ");

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a + " ");
        System.out.println("b: " + b );
    }


}
