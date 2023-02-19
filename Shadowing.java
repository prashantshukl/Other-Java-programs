import org.w3c.dom.ls.LSOutput;

public class Shadowing {
    // Shadowing is only for class variables
    static int x = 45;
    public static void main(String[] args) {
        System.out.println(x);
        fun() ;
        int x = 98;
        System.out.println(x);
        fun() ;
    }
    static void fun() {
        System.out.println(x);
    }

}
