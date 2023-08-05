import java.util.Scanner;

public class MethodOverloading {
    void work(int a,int b){
        System.out.println("Sum of two number is " + (a+b) + "\n");
    }
    void work(String str){
        System.out.println("Hello " + str + ", Good Morning.\n");
    }
    void work(int f){
        if(f%2==0) {
            System.out.println("Even\n");
        }
        else{
                System.out.println("Not even\n");
            }
    }
    void work(String str1, String str2){
        System.out.println(str1 + " is friend of " + str2 + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodOverloading mo = new MethodOverloading();
        //Method overloading: Two or more methods can have same name but different parameters
        //by using Method Overloading use can simple same method for multiple work.
        int a,b;
        String str,str1, str2;

        System.out.println("1.This Method will Give you some of Two number");
        System.out.println("First Method");
        System.out.println("Enter 1 number: ");
        a = sc.nextInt();
        System.out.println("Enter 2 number: ");
        b = sc.nextInt();
        sc.nextLine();
        mo.work(a,b);

        System.out.println("2.This Method will Greet you");
        System.out.println("Second Method");
        System.out.print("Enter your name: ");
        str = sc.nextLine();
        mo.work(str);

        System.out.println("3.This Method will tell you if given number is even or not");
        System.out.println("Third Method");
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        sc.nextLine();
        mo.work(a);

        System.out.println("4.This Method will tell you something");
        System.out.println("Fourth Method");
        System.out.print("Enter first name: ");
        str1 = sc.nextLine();
        System.out.print("Enter Second name: ");
        str2 = sc.nextLine();
        mo.work(str1,str2);
    }
}
