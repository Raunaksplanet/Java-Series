import com.sun.security.jgss.GSSUtil;

class base{
    public int a, b;
    public void setA(int A){
        a = A;
    }
    public int getA(){
        return a;
    }

    public void setB(int B){
        b = B;
    }
    public int getB(){
        return b;
    }
    public void print(){
        System.out.println("Value of A & B in Based class is " + a + b);
    }
}

class derived extends base{

    public int c;
    public void setC(int C){
        c = C;
    }
    public int getC(){
        return c;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        base bc = new base();
        derived dc = new derived();

        System.out.println("Accessing Variable A & B from base class ");
        bc.setA(45);
        System.out.println("Value of a is " + bc.getA());
        bc.setB(55);
        System.out.println("Value of b is " + bc.getB());

        System.out.println("\nAccessing Variable A & B from Derived class ");
        dc.setA(45);
        System.out.println("Value of a is " + dc.getA());
        dc.setB(55);
        System.out.println("Value of b is " + dc.getB());

        System.out.println("\nAccessing Variable C from Derived class ");
        dc.setC(99);
        System.out.println("Value of a is " + dc.getC());
    }
}
