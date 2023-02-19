import java.util.Scanner;

public class LarOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = in.nextInt();
        System.out.print("enter second number :");
        int b = in.nextInt();
        System.out.print("enter third number :");
        int c = in.nextInt();
        System.out.println("Largest number is :"+largest(a,b,c));
        System.out.println("Smallest number is :"+smallest(a,b,c));


    }
    static int largest(int a,int b, int c) {
        int lar = a;
        if (b>a) {
            if (b>c) lar = b;
            else lar = c;

        }
        return lar;
    }
    static int smallest(int a, int b, int c) {
        int smal = a;
        if (b<a) {
            if (b<c) smal = b;
            else smal = c;
        }
        return smal;
    }
}
