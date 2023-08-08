public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(myMethod1(2,2));
        System.out.println(myMethod2("Pradeep ", 25));

    }

    static int myMethod(int x){
        return (x + 5);
    }

    static int myMethod1(int x, int y){
        return (x + y);
    }

    static String myMethod2(String name, int age){
        return (name + age);
    }
}
