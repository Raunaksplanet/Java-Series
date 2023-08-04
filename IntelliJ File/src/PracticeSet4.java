public class PracticeSet4 {
    public static void main(String[] args) {

            /*
        Q1. Print this pattern.
        * * * * *
        * * * *
        * * *
        * *
        *
            */
//        System.out.println("Q1. Print this pattern.");
//        for(int i = 5; i >= 0; i--){
//            for(int j = i; j >= 0; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Q2. Write a program to sum first n even numbers using while loop
        System.out.println("\nQ2. Write a program to sum first n even numbers using while loop");

        int n = 0, sum = 0;
        while (n <= 10) {
            if (n % 2 == 0) {
                sum += n;
            }
            n++;
        }
        System.out.println("Sum of First n Even number is " + sum);

        //Q3. Write a program to print multiplication table
        System.out.println("\nQ3. Write a program to print multiplication table");
        int a = 5;
        for(int i = 1; i <= 10 ; i++){
            System.out.printf("%d x %d = %d\n",a,i,a*i);
        }


        //Q4. Write a program to print multiplication table in reverse
        System.out.println("\nQ4. Write a program to print multiplication table in reverse");
        a = 5;
        for(int i = 10; i >= 1 ; i--){
            System.out.printf("%d x %d = %d\n",a,i,a*i);
        }

        //Q5. Write a program to find factorial
        System.out.println("\nQ5. Write a program to find factorial");
        a = 5;
        int facto = 1;
        for(int i = 1; i <= a; i++) {
            facto *= i;
        }
        System.out.printf("Factorial of %d is %d", a, facto);


        //Q6. Repeat  5 using while loop
        System.out.println("\nRepeat  5 using while loop");
        for(int i = 0; i < 5; i++){
            System.out.print("5" + " ");
        }
    }
}
