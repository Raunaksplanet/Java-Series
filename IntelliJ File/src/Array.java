public class Array {
    public static void main(String[] args) {

        //There is two ways of Declare array.
        //1.declaration and memory allocation at same time.
        int[] arr = new int[5];

        //2. first declare then  memory allocation.
        int[] arr2;
        arr2 = new int[5];

        //There is two ways of Initialize value in array.
        // 1. Providing values at each index
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //2. Providing values in continuous form.
        int[] arr3 = {1,2,3,4,5};

        // Length: Length is a function in array to find out the number of elements in array.

        int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Length of Array is " + arr4.length);

        //Array Traversal using length function
        System.out.println("Array Traversal");
        for(int i = 0 ; i < arr4.length ; i++){
            System.out.println(arr4[i]);
        }

        //Array Traversal using length function in reverse
        System.out.println("\nArray Traversal in reverse");
        for(int i = arr4.length-1 ; i >= 0 ; i--){
            System.out.println(arr4[i]);
        }

        //Array Traversal using for-each loop
        System.out.println("\nArray Traversal using for-each loop");
        for(int element: arr4){
            System.out.println(element);
        }
    }
}
