public class DataTypes {
    public static void main(String[] args) {

        // Data Types in Java.
        byte a = 10;
        System.out.println("1.Byte: " + a);

        short b = 10000;
        System.out.println("2.short: " + b);

        int c = 100000;
        System.out.println("3.int: " + c);

        long d = 100000L;
        System.out.println("4.long: " + d);

        float e =234.5f;
        System.out.println("5.float: " + e);

        double f = 12.3;
        System.out.println("6.double: " + f);

        char g = 'G';
        System.out.println("7.Char: " + g);

        boolean h = true;
        System.out.println("8.boolean: " + h);

        /*
            Following table summarize the resulting
            data types after arithmetic operation on them.
            byte = b, short = s
            int = i,  long = l
            float = f, double = d
            char = c, boolean = b

            Results:-
            1) b + s -> int
            2) s + i -> int
            3) l + f -> float
            4) i + f -> float
            5) c + i -> int
            6) c + s -> int
            7) l + d -> double
            8) f + d -> double
        */
    }
}
