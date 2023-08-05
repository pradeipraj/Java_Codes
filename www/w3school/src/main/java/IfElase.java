public class IfElase {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("x is largest number");
        } else {
            System.out.println("y is largest number");
        }

        int batPrice = 800 ;
        if (batPrice == 200){
            System.out.println("80% Discount");
        } else if (batPrice == 500){
            System.out.println("50% Discount");
        } else if (batPrice == 800){
            System.out.println("20% Discount");
        } else if (batPrice == 1000){
            System.out.println("No Discount");
        } else if (batPrice > 1000){
            System.out.println("Too costly.");
        }

        String result = (batPrice >= 1000) ? "No Discount" : "Some Discount";
        System.out.println(result);

        int a = 10;
        int b = 11;
        String out = (a>b) ? "a is smaller" : "b is bigger";
        System.out.println(out);
    }
}
