import java.util.Scanner;

class employee{
    Scanner sc = new Scanner(System.in);
    int salary;
    String name;
    public String getname(){
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        return name;
    }

    public int getsal() {
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
        sc.nextLine();
        return salary;
    }
    public String changename() {
        System.out.print("Enter Changed Name: ");
        name = sc.nextLine();
        return name;
    }
}


public class PracticeSet7 {
    public static void main(String[] args) {

        employee e1 = new employee();
        int sal;
        String name, changedName;

        name = e1.getname();
        System.out.println("Name is " + name);
        sal = e1.getsal();
        System.out.println("Salary is " + sal);
        changedName = e1.changename();
        System.out.println("Changed name is " + changedName);


        System.out.println("Name is " + name);
        System.out.println("Salary is " + sal);
        System.out.println("Changed Name is " + changedName);
    }
}
