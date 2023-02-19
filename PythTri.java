import java.util.Scanner;

public class PythTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = in.nextInt();
        System.out.print("enter second number :");
        int b = in.nextInt();
        System.out.print("enter third number :");
        int c = in.nextInt();
        if (triplet(a,b,c)) System.out.println("Pythagorean Triplets");
        else System.out.println("NOT Pythagorean Triplets !!");

    }

    static boolean triplet(int a,int b, int c) {
        boolean ans = false;
        if (b > a) {
            if (b > c) {
                if (b * b == a * a + c * c) ans = true;
            } else {
                if (c * c == a * a + b * b) ans = true;
            }
        }
        else {
            if (a>c) {
                if(a*a==b*b+c*c) ans = true;
            }
            else if (c * c == a * a + b * b) ans = true;
        }
        return ans;
    }

}
