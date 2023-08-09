import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Looping Statements:- 1) While loop
                             2) Do-While loop
                             3) For loop
        */
        // 1) While loop
        int a,b;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number(Should be greater then first one): ");
        b = sc.nextInt();
        while(b>=a){
            System.out.print(a + "  ");
            a++;
        }

        // 2) Do-While loop
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number(Should be less then first one): ");
        b = sc.nextInt();
            do{
                System.out.print(a + "  ");
                a--;
            }while(b<=a);


        // 3) for loop
        System.out.print("Enter number to print table: ");
        a = sc.nextInt();
        for(int i = 1; i <= 10 ; i++){
            System.out.printf("%d x %d = %d\n",a,i,a*i);
        }
    }
}
