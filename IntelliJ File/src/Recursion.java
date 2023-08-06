import java.util.Scanner;

public class Recursion {
    //Factorial using Recursion
    static int facto(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * facto(n-1);
        }
    }

    //fibonacci series using Recursion
    static int n1=0,n2=1,n3=0;
    static void fabo(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fabo(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Factorial using Recursion
        int n,m;
        System.out.println("Factorial using Recursion");
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + facto(n));

        //fibonacci series using Recursion
        System.out.println("fibonacci series using Recursion");
        System.out.print("Enter a number: ");
        m = sc.nextInt();
        fabo(m);
    }
}