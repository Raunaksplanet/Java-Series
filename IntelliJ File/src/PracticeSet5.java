import java.util.Scanner;

public class PracticeSet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Q1. Create an array of 5 floats and calculate their sum.
        Q2. check if n element is present in array or not
        Q3. calculate average marks of all students in math using for-each loop
        Q4. create two matrix of 2x3 and output sum.
        Q5. reverse an array.
        Q6. find the maximum element in array.
        Q7. find the minimum element in array.
        Q8. find if array is sorted or not.
        */

        // Q1. Create an array of 5 floats and calculate and find their sum.
        System.out.println("\nQ1. Create an array of 5 floats and calculate and find their sum.");
        float[] arr = new float[5];
        float var = 0;
        System.out.print("Enter elements in array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextFloat();
        }

        System.out.println("Elements in array are : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
            var += arr[i];
        }
        System.out.println("\nSum of All Float value is " + var);


        //Q2. check if n element is present in array or not
        int target,a = 0;
        System.out.println("\nQ2. check if n element is present in array or not");
        System.out.print("Enter elements in array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target value: ");
        target = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                a++;
                System.out.println("Target value find at " + i + "index");
            }
        }
        if(a == 0){
            System.out.println("target value is not available");
        }


        //Q3. calculate average marks of all students in math using for-each loop
        a = 0;
        System.out.println("\nQ3. calculate average marks of 5 students in math using for-each loop");
        System.out.print("Enter Marks: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            a += arr[i];
        }
        System.out.println("Average Marks of 5 student: " + a/5);


        //Q4. create two matrix of 2x3 and output sum.
        System.out.println("\nQ4. create two matrix of 2x3 and output sum.");
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[2][3];
        System.out.print("Enter Elements in 1st array: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Elements in 2nd array: ");
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements in 1st array: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Elements in 2nd array: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Sum of 2-d array: ");
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                arr3[i][j] = arr2[i][j] + arr1[i][j];
            }

        }
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println();
        }


        //Q5. reverse an array.
        int[] arr4 = new int[5];
        System.out.println("\nQ5. reverse an array.");
        System.out.print("Enter Element1s: ");
        for(int i = 0; i < arr4.length; i++){
            arr4[i] = sc.nextInt();
        }
        for(int i = arr4.length-1; i >= 0; i--){
            System.out.print(arr4[i] + "  ");
        }


        //Q6. find the maximum element in array.
        int max = 0;
        System.out.println("\nQ6. find the maximum element in array.");
        System.out.print("Enter Elements: ");
        for(int i = 0; i < arr4.length; i++){
            arr4[i] = sc.nextInt();
        }
        for(int i = 0; i < arr4.length; i++){
            if(arr4[i] > max){
                max = arr4[i];
            }
        }
        System.out.println("Maximum element: " + max);


        //Q7. find the minimum element in array.
        int min = 0;
        System.out.println("\nQ7. find the minimum element in array.");
        System.out.print("Enter Elements: ");
        for(int i = 0; i < arr4.length; i++){
            arr4[i] = sc.nextInt();
        }
        min = arr4[0];
        for(int i = 0; i < arr4.length; i++){
            if(arr4[i] < min){
                min = arr4[i];
            }
        }
        System.out.println("Minimum element: " + min);


        //Q8. find if array is sorted or not.

    }
}
