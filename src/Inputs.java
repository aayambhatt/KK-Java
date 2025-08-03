import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // System.in means where do we want the input from? keyword!
        System.out.print("Please enter your rollNo: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);
    }
}
