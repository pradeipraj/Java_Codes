public class MethodParameter {

    static void myMethod(String firstName){
        System.out.println("The first name is: " + firstName);
    }

    static void myMethod1(String lastName){
        System.out.println("The lastname is: " + lastName);
    }
    public static void main(String[] args) {

        myMethod("Pradeep");
        myMethod1("Raj");

    }
}
