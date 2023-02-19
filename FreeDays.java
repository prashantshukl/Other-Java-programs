import java.util.Scanner;

public class FreeDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter month name :");
        String a = in.next();
        switch (a) {
            case "January" -> System.out.println(15);
            case "February" -> System.out.println(14);
            case "March" -> System.out.println(15);
            case "April" -> System.out.println(15);
            case "May" -> System.out.println(15);
            case "June" -> System.out.println(15);
            case "July" -> System.out.println(15);
            case "August" -> System.out.println(15);
            case "September" -> System.out.println(15);
            case "October" -> System.out.println(15);
            case "November" -> System.out.println(15);
            case "December" -> System.out.println(15);
        }
    }
}
