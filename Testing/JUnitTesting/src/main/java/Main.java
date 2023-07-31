public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int add = calculator.add(2,3);
        System.out.println("The Result is: " + add);

        int sub = calculator.sub(3,2);
        System.out.println("The Result is: " + sub);

        int mul = calculator.mul(2,2);
        System.out.println("The Result is: " + mul);

        double div = calculator.div(10,2);
        System.out.println("The Result is: " + div);
    }
}
