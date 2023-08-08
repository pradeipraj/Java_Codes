public class TestArray {
    public static void main(String[] args) {
        int [] myNum = {1,2,3,4,5,6,7,8,9,0};
        myNum[3] = 20;
        System.out.println(myNum[0]);
        System.out.println(myNum[1]);
        System.out.println(myNum[2]);
        System.out.println(myNum[3]);
        System.out.println(myNum[4]);
        System.out.println(myNum[5]);
        System.out.println(myNum[6]);
        System.out.println(myNum[7]);
        System.out.println(myNum[8]);
        System.out.println(myNum[9]);
        System.out.println(myNum.length);

        String [] myCars = {"Creata", "Breeza", "Venue", "Renault"};
        myCars[2] = "Maruti";
        System.out.println(myCars[0]);
        System.out.println(myCars[1]);
        System.out.println(myCars[2]);
        System.out.println(myCars[3]);
        System.out.println(myCars.length);
    }
}
