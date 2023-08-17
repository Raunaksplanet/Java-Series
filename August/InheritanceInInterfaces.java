interface fast{
    void fast1();
    void fast2();
}

interface fast2 extends fast{
    void fast3();
    void fast4();
}

class show implements fast2{
    public void fast1(){
        System.out.println("This is fast1");
    }
    public void fast2(){
        System.out.println("This is fast2");
    }
    public void fast3(){
        System.out.println("This is fast3");
    }
    public void fast4(){
        System.out.println("This is fast4");
    }
}


public class InheritanceInInterfaces {
    public static void main(String[] args) {

        show sw = new show();
        sw.fast1();
        sw.fast2();
        sw.fast3();
        sw.fast4();
    }
}
