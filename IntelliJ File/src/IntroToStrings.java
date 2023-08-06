import java.util.Scanner;

public class IntroToStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        • In Java String is class and not a primitive data type
        but Java have special support to string that's why we can
        use string as a primitive data type.
        */


        // • there is two ways to initialize a string in Java
        String name = new String("Raunak");
        System.out.println("My Name is " + name);

        //              or

        String surname = "Gupta";
        System.out.println("My Surname is " + surname);

        /*
        • In Java we can input string from user using 2 Methods/Functions
          next() & nextline().

          using next(): Input single word.
          using nextline(): Input whole line.
        */
        /*
        System.out.print("Enter Name: ");
        String str = sc.next();
        System.out.print("Hello, " + str);
        */

        String str2;
        System.out.print("\nEnter Name: ");
        str2 = sc.nextLine();
        System.out.println("Hello, " + str2);
    }
}
