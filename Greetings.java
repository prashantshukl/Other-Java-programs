import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        greetings();
        int a = diff() ;
        System.out.println(a);
    }
    static void greetings(){
        System.out.println("hello world");
    }
    static int diff() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = in.nextInt();
        System.out.print("enter first number :");
        int b = in.nextInt();
        int diffr = a - b;
        return diffr;
    }
}
