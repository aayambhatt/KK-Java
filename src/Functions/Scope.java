package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 50;
            int c = 99;
        }

        System.out.println(a);
//        System.out.println(c);  // cannot access

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }


    }

    static void randomFunc(){
        int c = 30;
    }
}
