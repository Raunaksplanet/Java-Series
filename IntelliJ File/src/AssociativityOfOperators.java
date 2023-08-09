public class AssociativityOfOperators {
    public static void main(String[] args) {

        // Precedence and Associativity of Operators.
        int a = 6*5-32/2;
        /*
            = 30-34/2
            = 30-16
            = 14
        */
        System.out.println(a);

        int b = 60/5-32*2;
        /*
            = 12-32*2;
            = 12-68;
            = -56;
        */
        System.out.println(b);

    }
}
