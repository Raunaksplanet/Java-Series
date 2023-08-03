import java.util.Scanner;

public class PracticeSet2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Q1. What will be the result of the following expression
        //    float a = 7/4*9/2
        float a = (7 / 4f)*(9 / 2f);
        System.out.println("1.Answer = " + a);


        //Q2.Write a java program to encrypt a grade by
        //   adding 8 to it. Decrypt it to show the correct grade.
        System.out.println("\nEncrypting \"A\" Grade with adding 8");
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println("Encrypted Grade: " + grade);

        System.out.println("\nDecrypting \"A\" Grade with subtracting 8");
        grade = (char)(grade - 8);
        System.out.println("Decrypted Grade: " + grade);

        //Q3. Write a program to check if Given number is greater or
        //    by number entered by user or not using comparison operator.
        System.out.print("\nGiven number is 10\nEnter a number: ");
        int num = sc.nextInt();
        if(num>10){
            System.out.println("Given number is greater then 10");
        }
        else{
            System.out.println("Given number is not greater then 10");
        }


        //Q4. Write a following expression in a Given Java program.
              int v = 4,u = 2;
              System.out.println("Answer of Given Expression is " + (v*2 - u*2)/ 2);

        //Q5. Find the value of the following expression.
        // int x = 7
        // int a = 7*49/7 + 35/7

        int x = 7;
        int aa = 7*49/7 + 35/7;
        System.out.println("Answer of Given Expression is " + aa);
    }
}
