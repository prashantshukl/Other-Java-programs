import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum() ;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = in.nextInt();
        System.out.print("enter first number :");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("the sum is : " + sum);
    }
}
