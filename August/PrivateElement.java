class Private{
    private int id;
    private String name;

    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }
}

public class PrivateElement {
    public static void main(String[] args) {

        Private e1 = new Private();

        e1.setName("Raunak Gupta");
        System.out.println(e1.getName());
    }
}
