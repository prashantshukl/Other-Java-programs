import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun(1,2,3,4,5,8,67) ;

    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
