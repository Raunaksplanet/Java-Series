class Circle{
    Circle(){
        System.out.println("This is constructor of class Circle");
    }
}

class Cylinder extends Circle{
    Cylinder(){
        System.out.println("This is constructor of class Cylinder");
    }
}

public class PracticeSet8 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();


    }
}