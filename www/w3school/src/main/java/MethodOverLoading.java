public class MethodOverLoading {

    static int myMethod(int x, int y){
        return x + y;
    }

    static double myMethod(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(2,2));
        System.out.println(myMethod(2.5, 2.6));

    }
}
