import java.util.Scanner;

class kilas{
    kilas(int a){
        System.out.println("Constructor Returning the value of a: " + a);
    }
}

class kilas2 extends kilas{
    kilas2(int c){
        super(c);
        System.out.println("I'm Constructor of Derived class(Kilas 2)");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Data: ");
        int f = sc.nextInt();
        kilas2 kl2 = new kilas2(f);
    }
}
