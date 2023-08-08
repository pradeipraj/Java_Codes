public class MethodIfElse {
    public static void main(String[] args) {
        checkAge(19);
    }

    static void checkAge(int age){
        if (age<18){
            System.out.println("Not Eligible to vote");
        }else
            System.out.println("Eligible to vote");
    }
}
