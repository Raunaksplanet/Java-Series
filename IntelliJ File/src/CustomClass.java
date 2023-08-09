import java.util.Scanner;

class details{
    Scanner sc = new Scanner(System.in);
        int age;
        String name;
        public void getdata(){
            int a;
            String str;
            System.out.print("Enter age: ");
            a = sc.nextInt();
            sc.nextLine();
            age = a;

            System.out.print("Enter Name: ");
            str = sc.nextLine();
            name = str;
        }
    public void showdata(){
        System.out.println(name + " is " + age + " year's old");
    }
}

public class CustomClass {
    public static void main(String[] args) {
        details p1 = new details();
        p1.getdata();
        p1.showdata();
    }
}