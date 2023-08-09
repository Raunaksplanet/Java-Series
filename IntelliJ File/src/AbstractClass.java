abstract class superior{
    superior(){
        System.out.println("I'm Constructor of Superior Class");
    }
    public abstract void DoesSomeThing();
}

class child1 extends superior{
    @Override
    public void DoesSomeThing(){
        System.out.println("Im Child 1");
    }
}

class child2 extends superior{
    @Override
    public void DoesSomeThing(){
        System.out.println("Im Child 2");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.DoesSomeThing();
        child2 c2 = new child2();
        c2.DoesSomeThing();
    }
}
