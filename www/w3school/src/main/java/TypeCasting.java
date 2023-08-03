public class TypeCasting {
    public static void main(String[] args) {

        //Automatic type casting or Widening type casting
        int myInt = 10;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        //Manual type casting or Narrowing type casting
        double myDbl = 10.8;
        int myItr = (int) myDbl;

        System.out.println(myDbl);
        System.out.println(myInt);
    }
}
