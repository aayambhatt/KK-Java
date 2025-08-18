package Functions;

public class Greet {
    public static void main(String[] args) {
        String greet1 = greet("Aayam");
        System.out.println(greet1);

        String greet2 = greet("Aaryan Bhatt");
        System.out.println(greet2);
    }

    static String greet(String name){
        return "Hello " + name;
    }


}
