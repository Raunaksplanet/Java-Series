class employe{
    private int id;
    private String name;

    public employe(){
        System.out.println("Employee 1");
        id = 400;
        System.out.println("ID: " + id);
        name = "Raunak Gupta";
        System.out.println("Name: " + name);
    }

    public employe(String str, int i){
        System.out.println("\nEmployee 2");
        id = i;
        System.out.println("ID: " + id);
        name = str;
        System.out.println("Name: " + name);
    }
    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        employe e1 = new employe();
        employe e2 = new employe("Raunak Gupta", 401);
    }
}
