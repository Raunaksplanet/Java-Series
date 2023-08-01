import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        /*
        Task2 is to input 5 Subject marks from user and print
        total marks and percentage.
         */
        System.out.println("\nJava Program to find total percentage\nof 5 Subjects out of 100 Marks");
        Scanner sc = new Scanner(System.in);

        int Eng,Hin,Math,Bio,Gk;
        System.out.print("Enter English marks: ");
        Eng = sc.nextInt();

        System.out.print("Enter Hindi marks: ");
        Hin = sc.nextInt();

        System.out.print("Enter Math marks: ");
        Math = sc.nextInt();

        System.out.print("Enter Bio marks: ");
        Bio = sc.nextInt();

        System.out.print("Enter Gk marks: ");
        Gk = sc.nextInt();

        double total_marks = Eng + Hin + Math + Bio + Gk;
        System.out.println("Total marks is " + total_marks);

        double percentage = total_marks * 100/500;
        System.out.println("Total Percentage is " + percentage);
    }
}