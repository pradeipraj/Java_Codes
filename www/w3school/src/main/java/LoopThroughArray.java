public class LoopThroughArray {
    public static void main(String[] args) {

        String [] cars = {"Volvo", "Ford", "BMW", "Renault"};
        for (int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String i : cars){
            System.out.println(i);
        }
    }
}

