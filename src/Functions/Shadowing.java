package Functions;

public class Shadowing {
    String name = "Outer Name";  // instance variable

    public void printName() {
        String name = "Inner Name";  // local variable shadows instance variable
        System.out.println(name);        // prints "Inner Name"
        System.out.println(this.name);   // prints "Outer Name"
    }

    public static void main(String[] args) {
        Shadowing example = new Shadowing();
        example.printName();
    }
}
