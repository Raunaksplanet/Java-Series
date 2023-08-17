interface raunak{
    void youtube();
    void college();
    void home();
    default void personel(){
        System.out.println("This is a personel Method");
    }
}

class work implements raunak{
    public void youtube(){
        System.out.println("Youtube work is GoingOn");
    }
    public void college(){
        System.out.println("College work is GoingOn");
    }
    public void home(){
        System.out.println("Home work is GoingOn");
    }
}

public class DefaultMethodsInterfaces {
    public static void main(String[] args) {

        work wk = new work();
        wk.youtube();
        wk.college();
        wk.home();
        wk.personel();
    }
}