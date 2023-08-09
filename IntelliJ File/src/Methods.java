import java.util.Scanner;

public class Methods {
    //Static class
    static void even(int a){
        if(a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is not Even");
        }

        if(a>10){
            System.out.println("Number is Larger than 10");
        }
    }

    //Non-static Method
    int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Methods are basically like functions but Such functions are made under
        class are being called method.
        Methods basically functions other than main which help in code reuse ability
        Here I'm, creating a Method which tell us if given number is larger than 10 and even
        or not.
        */
        int a;
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        // 1. Our Method "even()" is Static thats why we dont need to create a object of class.
        even(a);

        //Our Method "sum()" is not static, so now we have to create a object first then call a function using object.
        Methods obj = new Methods();

        int x,y;
        System.out.print("Enter First number: ");
        x = sc.nextInt();
        System.out.print("Enter Second number: ");
        y = sc.nextInt();
        System.out.println("Sum of two number is " + obj.sum(x,y));

    }
}
