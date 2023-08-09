import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        // Conditional Statements.
        //  If-Else.
        int a;
        System.out.print("Enter Your Age: ");
        a = sc.nextInt();
        if(a > 18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not Eligible for voting");
        }

    }
}
