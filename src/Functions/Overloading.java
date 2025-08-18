package Functions;

public class Overloading {
    public static void main(String[] args) {
        // function overloading at compile time
        fun(5);
        fun("Aayam");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
