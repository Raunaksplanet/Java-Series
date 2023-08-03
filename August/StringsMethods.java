public class StringsMethods {
    public static void main(String[] args) {

        /*
        String Methods:- String Methods operate on Java strings.
        They can use to find the length of the string, convert
        to lowercase etc.
        Some of the Commonly Used String Methods are:-
        */

        // Variables to work with
        String str = "Raunak";
        String str2;
        String str3 = "  Raunak  ";
        char  c;
        int var;
        boolean var2;

        //1. length(): Return length of string.
        System.out.println("1. length(): Return length of string.");
        var = str.length();
        System.out.println("String is " + str);
        System.out.println("The Size of String is " + var);


        //2. toLowerCase(): return a new string which has all the
        //                  lowercase characters from the string str.

        System.out.println("\n2. toLowerCase(): return a new string which has all the\nlowercase characters from the string str");
        str2 = str.toLowerCase();
        System.out.println("Old String: " + str);
        System.out.println("New String: " + str2);


        //3. toUpperCase(): return a new string which has all the
        //                  UpperCase characters from the string str.
        System.out.println("\n3. toUpperCase(): return a new string which has all the\nUpperCase characters from the string str");
        str2 = str.toUpperCase();
        System.out.println("Old String: " + str);
        System.out.println("New String: " + str2);


        //4. trim(): return a new string after removing all the
        //           leading & trailing strings from the original string.
        System.out.println("\n4. trim(): return a new string after removing all the\nleading & trailing strings from the original string.");
        str2 = str3.trim();
        System.out.println("Old String: " + str3);
        System.out.println("New String: " + str2);


        //5. substring(): return a substring from X index to Y index
        System.out.println("\n5. substring(): return a substring from X index to Y index.");
        str2 = str.substring(2,5);
        System.out.println("Old String: " + str);
        System.out.println("New String: " + str2);



        //6. replace('a','k'): return a string with replaced words.
        System.out.println("\n6. replace('a','k'): return a string with replaced words..");
        str2 = str.replace("a","o");
        System.out.println("Old String: " + str);
        System.out.println("New String: " + str2);


        //7. startsWith("Rau"): return a boolean value if string start with given arguments.
        System.out.println("\n7. startsWith(\"Rau\"): return a boolean value if string start with given arguments");
        var2 = str.startsWith("Rau");
        System.out.println("Old String: " + str);
        System.out.println("New String: " + var2);


        //8. endsWith("nak"): return a boolean value if string ends with given arguments.
        System.out.println("\n8. endsWith(\"nak\"): return a boolean value if string ends with given arguments.");
        var2 = str.endsWith("nak");
        System.out.println("Old String: " + str);
        System.out.println("New String: " + var2);


        //9. charAt(3): return a character at given Index.
        System.out.println("\n9. charAt(3): return a character at given Index.");
        c = str.charAt(3);
        System.out.println("Old String: " + str);
        System.out.println("New String: " + c);


        //10. indexOf("u"): return a Index no of given character.
        System.out.println("\n10. indexOf(\"u\"): return a Index no of given character.");
        var = str.indexOf("u");
        System.out.println("Old String: " + str);
        System.out.println("New String: " + var);


        //11. str.equals("Raunak"): Return boolean value as true if Given string is equal else false, Case Sensitive.
        System.out.println("\n11. str.equals(\"Raunak\"): Return boolean value as true if Given string is equal else false, Case Sensitive.");
        var2 = str.equals("Raunak");
        System.out.println("Old String: " + str);
        System.out.println("New String: " + var2);


        //12. str.equalsIgnoreCase("raunak"): Return boolean value as true if Given string is equal else false.
        System.out.println("\n12. str.equalsIgnoreCase(\"raunak\"): Return boolean value as true if Given string is equal else false, Non-Case Sensitive.");
        var2 = str.equalsIgnoreCase("raunak");
        System.out.println("Old String: " + str);
        System.out.println("New String: " + var2);
    }
}
