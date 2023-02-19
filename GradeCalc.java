import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Marks :");
        int a = in.nextInt();
        System.out.println("Your Grade is :"+Grade(a));
    }
    static String Grade(int a) {
        if (a <= 40) {
            return "Fail";
        } else if (41<=a && a<=50) {
            return "DD";
        }else if (51<=a && a<=60) {
            return "CD";
        }else if (61<=a && a<=70) {
            return "BC";
        }else if (71<=a && a<=80) {
            return "BB";
        }else if (81<=a && a<=90) {
            return "AB";
        }else if (91<=a && a<=100) {
            return "AA";
        }else return "enter Marks out of Hundred";
    }
}
