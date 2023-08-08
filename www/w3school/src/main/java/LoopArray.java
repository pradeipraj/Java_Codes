public class LoopArray {
    public static void main(String[] args) {
        //For loop in Array
        String[] myCars = {"Renault", "Breeza", "Creata", "Venue", "Kia", "Audi", "BMW"};
        for (int i = 0; i < myCars.length; i++) {
            System.out.println(myCars[i]);
        }

        //For Loop in Array with Break
        String[] myBikes = {"TVS", "Honda", "Bullet", "Avengers", "Hayabusa", "Suzuki"};
        System.out.println(myBikes.length);
        for (int j = 0; j < myBikes.length; j++) {
            if (j == 0) {
                continue;
            }
            System.out.println(myBikes[j]);

        }
        String[] myBike = {"TVS", "Honda", "Bullet", "Avengers", "Hayabusa", "Suzuki"};
        System.out.println(myBike.length);
        for (int k = 0; k < myBike.length; k++) {
            if (k == 3) {
                break;
            }
            System.out.println(myBikes[k]);
        }

    }
}
