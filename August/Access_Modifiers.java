// Example 1: Access Modifiers with Class

// Public class can be accessed from anywhere
public class PublicClass {
}

// Default class can be accessed within the same package
class DefaultClass {
}

// Example 2: Access Modifiers with Fields

public class MyClass {
    public int publicField;          // Accessible everywhere
    protected int protectedField;    // Accessible within same class, subclasses, and same package
    int defaultField;                // Accessible within same class and same package (default access)
    private int privateField;        // Accessible only within same class
}

// Example 3: Access Modifiers with Methods

public class MyClass {
    public void publicMethod() {
        // Can be accessed everywhere
    }
    
    protected void protectedMethod() {
        // Can be accessed within same class, subclasses, and same package
    }
    
    void defaultMethod() {
        // Can be accessed within same class and same package (default access)
    }
    
    private void privateMethod() {
        // Can be accessed only within same class
    }
}
