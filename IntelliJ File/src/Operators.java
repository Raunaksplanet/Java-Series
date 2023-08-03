import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        /*
            1. Arithmetic Operators.
            2. Unary Operators.
            3. Assignment Operators.
            4. Relational Operators.
            5. Logical Operators.
            6. Ternary operators.
            7. Shift Operators.
        */
        // 1. Arithmetic Operators: Use to perform Simple Arithmetic operations on primitive data.
        // 1.1 Multiplication
        System.out.println("1. Arithmetic Operators\n1.1 Multiplication \"*\"");
        System.out.print("Enter 1 Number: ");
        a = sc.nextInt();
        System.out.print("Enter 2 Number: ");
        b = sc.nextInt();
        System.out.println("Multiplication of Two number is " + (a*b));

        // 1.2 Division
        System.out.println("1.2 Division \"/\"");
        System.out.print("Enter 1 Number: ");
        a = sc.nextInt();
        System.out.print("Enter 2 Number: ");
        b = sc.nextInt();
        System.out.println("Division of Two number is " + (a/b));

        // 1.3 Modulo
        System.out.println("1.3 Modulo \"%\"");
        System.out.print("Enter 1 Number: ");
        a = sc.nextInt();
        System.out.print("Enter 2 Number: ");
        b = sc.nextInt();
        System.out.println("Modulo of Two number is " + (a%b));

        // 1.4 Addition
        System.out.println("1.4 Addition \"+\"");
        System.out.print("Enter 1 Number: ");
        a = sc.nextInt();
        System.out.print("Enter 2 Number: ");
        b = sc.nextInt();
        System.out.println("Addition of Two number is " + (a+b));

        // 1.5 Subtraction
        System.out.println("1.5 Subtraction \"-\"");
        System.out.print("Enter 1 Number: ");
        a = sc.nextInt();
        System.out.print("Enter 2 Number: ");
        b = sc.nextInt();
        System.out.println("Subtraction of Two number is " + (a-b));

        // 2. Unary Operators: Use only one value and also use to increment or decrement the value.
        //    Increment are of two Types Post-Increment & Pre-Increment.
        //    Decrement are of two Types Post-Decrement & Pre-Decrement.

        // 2.1 Increment Operator
        System.out.println("2. Unary Operators\n2.1 Increment Operator \"++\"");
        System.out.print("Enter a Number: ");
        a = sc.nextInt();
        System.out.println("it will increment the value in next iteration " + (a++));
        System.out.println("Like this " + (a));

        // 2.2 Decrement Operator
        System.out.println("2.2 Decrement Operator \"--\"");
        System.out.print("Enter a Number: ");
        b = sc.nextInt();
        System.out.println("it will increment the value in next iteration " + (b--));
        System.out.println("Like this " + (b));


        // 3. Assignment Operators: Assignment Operator is used to assign a value to any variable.
        // 3.1 Sum
        System.out.println("3. Assignment Operators\n\n3.1 Sum \"+=\"");
        System.out.println("Eg = \"a += b\"");


        // 3.2 Division
        System.out.println("\n3.2 Minus \"-=\"");
        System.out.println("Eg = \"a -= b\"");

        // 3.3 Modulo
        System.out.println("\n3.3 Multiply \"*=\"");
        System.out.println("Eg = \"a *= b\"");

        // 3.4 Addition
        System.out.println("\n3.4 divide \"/=\"");
        System.out.println("Eg = \"a /= b\"");

        // 3.5 Subtraction
        System.out.println("\n3.5 modulo \"%=\"");
        System.out.println("Eg = \"a %= b\"");


        // 4. Relational Operators: AUse to check relation like
        // equals to, greater, less then. It returns boolean value

    }
}
