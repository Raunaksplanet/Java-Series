interface fruits{
    void fruit(int amount);
}

interface vegetables{
    void vege(int amount);
}

class demon implements fruits, vegetables{
    public void vege(int amount) {
        System.out.println("Vegetables are " + amount);

    }
    public void fruit(int amount){
        System.out.println("Fruits are " + amount);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        demon dd = new demon();
        dd.vege(550);
        dd.fruit(650);
    }
}
