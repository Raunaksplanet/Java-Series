import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ErrorHandling {
    public static void main(String[] args) {

        int a = 5;
        /*
         * Syntax of try-catch-finally block.
         * try {
         *      // Code
         * } catch(Exception e) {
         *      System.out.println(e);
         * } finally {
         *      // This block will always execute.
         * }
         */

        System.out.println("1.Arithematic Exception");
        // 1.Arithematic Exception
        try {
            a = a / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("This block will always execute\n");
        }


        System.out.println("2.NullPointerException");
        // 2.NullPointerException
        try {
            String s = null;
            System.out.println(s.length());

        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("This block will always execute\n");
        }


        System.out.println("3.NumberFormatException");
        // 3.NumberFormatException
        try {
            String str = "abc";
            int i = Integer.parseInt(str);

        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("This block will always execute\n");
        }


        System.out.println("4.ArrayIndexOutOfBoundsException");
        // 4.ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            arr[3] = 10;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("This block will always execute\n");
        }

        System.out.println("5.Exception");
        // 5.Exception (Simplly you can write exception and it will automatically figure out the exception)
        try {
            int[] arr = new int[3];
            arr[3] = 10;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This block will always execute\n");
        }
        
    }
}
