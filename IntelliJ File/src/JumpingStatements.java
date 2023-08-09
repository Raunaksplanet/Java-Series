public class JumpingStatements {
    public static void main(String[] args) {

        //Break & Continue

        //1. Break
        System.out.println("Using Break Statement: ");
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            sum++;
            if(sum == 7) {
                break;
            }
        }

        sum = 0;
        System.out.println("\nUsing Continue Statement: ");
        for(int i = 1; i <= 10; i++){
            sum++;
            if(sum == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
