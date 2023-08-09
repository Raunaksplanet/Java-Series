class kilas{
    int a = 15;
    kilas(int a){
        this.a = a;
    }
    kilas(){
        System.out.println("Constructor Returning the value of a is " + a);
    }
}

class kilas2 extends kilas{
    kilas2(int c){
        super(c);
        System.out.println("I'm Constructor of Derived class");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        kilas kl = new kilas();
        kilas2 kl2 = new kilas2(55);
    }
}