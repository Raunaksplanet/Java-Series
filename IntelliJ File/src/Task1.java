import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        /*
        Task is to make a Java program to input a full name from user
        and greet them like this:-
        Hello "Name", Welcome to IntelliJ IDE.
         */

        //Solution.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String str = sc.nextLine();
        System.out.print("Hello " + str + ", Welcome to IntelliJ IDE");
    }
}
