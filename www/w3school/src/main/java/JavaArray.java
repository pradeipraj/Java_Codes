import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {

        String [] cars = {"Volvo", "BMW", "Ford"};
        cars[0] = "Renault";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        int [] myNumber = {1, 2, 3, 4, 5};
        System.out.println(myNumber[0]);
        System.out.println(myNumber[1]);
        System.out.println(myNumber[2]);
        System.out.println(myNumber[3]);
        System.out.println(myNumber[4]);

        //Find the Array Length
        System.out.println(cars.length);
    }
}
