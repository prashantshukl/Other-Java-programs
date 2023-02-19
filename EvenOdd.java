import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number :");
        int a = in.nextInt();
        System.out.println("the number is :"+EveOdd(a));
    }
    static String EveOdd(int a) {
        if (a%2 == 0) return "even";
        else return "odd";
    }
}
