public class MethodParameterTest {

    static void myMethodTest(String firstName, String lastName, int age)
    {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
    public static void main(String[] args)
    {
        myMethodTest("Pradeep", "Raj", 33);
    }
}
