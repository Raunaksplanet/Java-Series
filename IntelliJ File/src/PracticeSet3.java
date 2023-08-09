public class PracticeSet3 {
    public static void main(String[] args) {

        //Q1 Covert a string into lowercase.
        String str = "HELLO";
        System.out.println("Q1 Covert a string into lowercase.\nBefore: " + str);
        System.out.println("After: " + str.toLowerCase());


        //Q2. Write a Java program to replace spaces with underscore.
        str = "H e l l o";
        System.out.println("\nQ2. Write a Java program to replace spaces with underscore.\nBefore: " + str);
        System.out.println("After: " + str.replace(' ','_'));


        //Q3. Write a Java program to replace <|name|>.
        str = "Dear <|name|>, Thanks a lot!";
        System.out.println("\nQ3. Write a Java program to replace <|name|>.\nBefore: " + str);
        System.out.println("After: " + str.replace("<|name|>","Raunak"));


        //Q4. Write a Java program to detect double and triple spaces in a string.
        str = "hell  o";
        System.out.println("\nQ4. Write a Java program to detect double and triple spaces in a string.\nBefore: " + str);
        int i = str.indexOf("  ");
        int f = str.indexOf("    ");
        if((f == -1) && (i == -1))
            System.out.println("Have no double or triple Spaces");
        else
            System.out.println("Have Spaces");


        //Q5. Write a Java program to format the following letter using escape sequence character.
        str = "Dear Raunak, Thanks for all the Code. You're great";
        System.out.println("\nQ5. Write a Java program to format the following letter using escape sequence character.\nBefore: " + str);
        str = "Dear Raunak,\n\t\t\t    Thanks for all the Code. You're great";
        System.out.println("After: " + str);

    }
}
