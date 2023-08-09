interface bicycle{
    void applybrake(int decrement);
    void speedup(int increment);
}

class lower implements bicycle{
    int speed = 7;
    public void applybrake(int decrement){
        speed -= decrement;
        System.out.println("Speed is " + speed);
    }
    public void speedup(int increment){
        speed += increment;
        System.out.println("Speed is " + speed);
    }
}

public class IntroToInterfaces {
    public static void main(String[] args) {
        lower lw = new lower();

        lw.applybrake(5);
        lw.speedup(10);
    }
}
