

public class JavaBoolean {

    public static void main(String[] args) {

        //Boolean will tell you in true or false conditions
        boolean isItTrue = true;
        boolean isItFalse = false;

        System.out.println(isItTrue);
        System.out.println(isItFalse);

        //We can use comparator operator to get boolean output
        int x = 10;
        int y = 11;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x==y);

        int myAge = 17;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        if (myAge >= votingAge) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }


    }


}
