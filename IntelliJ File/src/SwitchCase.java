import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;
        System.out.print("Enter any vowel: ");
        a = sc.next().charAt(0);

        switch (a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'A':
            case 'I':
            case 'E':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not Vowel");
        }

    }
}
