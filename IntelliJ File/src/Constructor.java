class employes{
    private int id;
    private String name;

    public employes(){
        System.out.println("Employee 1");
        id = 400;
        System.out.println("ID: " + id);
        name = "Raunak Gupta";
        System.out.println("Name: " + name);
    }
    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }
}

public class Constructor {
    public static void main(String[] args) {
        employes e1 = new employes();
    }
}