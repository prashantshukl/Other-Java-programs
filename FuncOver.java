public class FuncOver {
    public static void main(String[] args) {
       fun(3,5 );
       fun(3);
    }
    static void fun(int a, int b) {
        System.out.println(a+b);
    }
    static void fun(int a)  {
        System.out.println(a+3);
    }
}
