class kls1{
    public void First(){
        System.out.println("I'm 1 Method of 1 Class");
    }

    public void Second(){
        System.out.println("I'm 2 Method of 1 Class");
    }
}

class kls2 extends kls1{
    @Override
    public void Second(){
        System.out.println("I'm 2 Method of 2 Class");
    }
    public void Third(){
        System.out.println("I'm 3 Method of 2 Class");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        kls1 k1 = new kls1();
        kls2 k2 = new kls2();
        k1.Second();
        k2.Second();

    }
}