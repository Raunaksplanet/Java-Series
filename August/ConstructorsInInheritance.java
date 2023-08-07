class base1{
    base1(){
        System.out.println("I'm Constructor of Base Class");
    }
}

class derived1 extends base1{
    derived1(){
        System.out.println("I'm Constructor of Derived Class");
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        
//      base1 bc = new base1();
        derived1 dc = new derived1();

    }
}
