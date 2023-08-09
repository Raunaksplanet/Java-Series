import java.util.Scanner;

public class PracticeSet6 {

    static void tabel(int n){
        for(int i = 1 ; i<=10 ; i++){
            System.out.printf("%d x %d = %d",n,i,i*n);
            System.out.println();
        }
    }

    static void pattern(){
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void sum(int n){
        int a = 0;
        for(int i = 0; i <= n; i++){
            a += i;
        }
        System.out.println("Sum of First n number is " + a);
    }


    static void pattern1(){
        for(int i = 4 ; i > 0 ; i--){
            for(int j = i ; j > 0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static int n1=0,n2=1,n3=0;
    static void fabo(int count){
        for(int i = 0; i < count ; i++){
            if(count>0){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" "+n3);
            }
        }

    }


    static void average(int a,int b, int c){
        System.out.println("Average of 3 number is " + ((a+b+c)/3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        /*
        1.Write a Java Method to Print Multiplication table of a number n
        2. Java Method to Print Pattern
        3. Java Method to Print Sum of first n number
        4.Java Method to Print 2nd Pattern
        5. Java Method to Print fabonacci series to Nth number
        6. Java Method to Print Average of 3 number
        */
        System.out.println("1. Java Method to Print Multiplication table of a number n");
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        tabel(a);

        System.out.print("\n2. Java Method to Print Pattern");
        pattern();


        int b;
        System.out.println("\n3. Java Method to Print Sum of first n number: ");
        System.out.print("Enter a number: ");
        b = sc.nextInt();
        sum(b);


        System.out.println("\n4.Java Method to Print 2nd Pattern");
        pattern1();

        int c;
        System.out.println("\n5. Java Method to Print fabonacci series to Nth number");
        System.out.print("Enter a number: ");
        c = sc.nextInt();
        fabo(c);


        int aa,bb,cc;
        System.out.println("\n\n6. Java Method to Print Average of 3 number");
        System.out.print("Enter first number: ");
        aa = sc.nextInt();
        System.out.print("Enter Second number: ");
        bb= sc.nextInt();
        System.out.print("Enter Third number: ");
        cc = sc.nextInt();
        average(aa,bb,cc);
    }
}
