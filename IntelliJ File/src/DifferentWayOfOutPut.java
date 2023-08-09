public class DifferentWayOfOutPut {
    public static void main(String[] args) {

        // In This Chapter we'll se Different print statement.
        //1. System.out.print(); = simple print does not give next line by default in output.
        int a = 65;
        System.out.print("A value is " + a);


        //2. System.out.println(); = println give next line by default in output.
        System.out.println("\nA value is " + a);


        //3. System.out.printf(); = by using printf we can simply use format specifier in print statement.
        System.out.printf("A value is %c", a);


        //4. System.out.format(); = format is same as printf.
        System.out.format("\nA value is %c", a);
    }
}
