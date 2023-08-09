public class VarArgs {

//    public static int sum(int a, int ...arr){
    public static int sum(int ...arr){
        int total = 0;
        for(int a: arr){
            total += a;
        }
        return total;
    }
    public static void main(String[] args) {
        //Varargs replace the concept of function over loading in more efficient way.

        System.out.println("Sum of 1, 2, 3 is " + sum(1,2,3));
        System.out.println("Sum of 1, 2, 3, 4 is " + sum(1,2,3,4));
        System.out.println("Sum of 1, 2, 3, 4, 5 is " + sum(1,2,3,4,5));
        System.out.println("Sum of 1, 2, 3, 4, 5, 6 is " + sum(1,2,3,4,5,6));
    }
}
