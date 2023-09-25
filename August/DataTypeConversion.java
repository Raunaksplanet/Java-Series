public class DataTypeConversion {
    public static void main(String args[]) {

        // 1.Integer to String
        int a = 123;
        String str = Integer.toString(a);
               str = String.valueOf(a);
               str = String.format("%d", a);
        
        
        // 2.Double to String
        Double d = 12.3212;
        String str2 = Double.toString(d);
               str2 = String.valueOf(d);
               str2 = String.format("%.2f",d);
        
        // 3.String to Int
        String str3 = "1010";
        int c = Integer.parseInt(str3);
            c = Integer.valueOf(str3);
            c = Integer.valueOf(str3,2);
        
        // 3.String to Double
        String str4 = "12.21";
        Double dd = Double.parseDouble(str4);
               dd = Double.valueOf(str4);
    }
}
