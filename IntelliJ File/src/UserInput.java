//Importing Scanner class in Java file to use Scanner function.
import java.util.Scanner;
//  OR you can use other method to import same file
//import java.util.*;

public class UserInput {
    public static void main(String[] args) {

        System.out.println("Taking Input from user");
        // Creating Scanner class Object as "sc" in main function.
        Scanner sc = new Scanner(System.in);

        //Inputting Integer data type from user using sc object and nextInt() function
        System.out.print("Enter 1 Integer: ");
        int a = sc.nextInt();
        System.out.print("Enter 2 Integer: ");
        int b = sc.nextInt();
        System.out.println("Sum of Two number is " + (a+b));

        //Inputting Double data type from user using sc object and nextDouble() function
        System.out.print("Enter 1 Double: ");
        double aa = sc.nextDouble();
        System.out.print("Enter 2 Double: ");
        double bb = sc.nextDouble();
        System.out.println("Sum of Two Double value is " + (aa+bb));


        //Inputting String data type from user using sc object and next() function
        System.out.print("Enter 1 String: ");
        String str1 = sc.next();
        System.out.println(str1);

        //Inputting String data type from user using sc object and nextLine() function
        System.out.print("Enter 2 String: ");
        String str2 = sc.nextLine();
        System.out.println(str2);

    }
}
