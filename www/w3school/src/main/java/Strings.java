public class Strings {
    public static void main(String[] args) {

        //String
        String firstName = "Pradeip";
        System.out.println("My name is " + firstName);

        //String Length
        System.out.println("The length of first name is " + firstName.length()); //Here + is concatenation.

        //To change uppercase
        System.out.println(firstName.toUpperCase());

        //To change lowercase
        System.out.println(firstName.toLowerCase());

        //To find the character or index
        System.out.println(firstName.indexOf("i"));

        //String Concatenation
        String lastName = "Sheelvant";
        System.out.println(firstName  + " " + lastName);
        System.out.println(firstName.concat(lastName));

        //Special Characters
        String myWords = "Hardworking is the first step of \"Success\".";
        System.out.println(myWords);

        String singleCol = "My name is \'Pradeip Raj\'";
        System.out.println(singleCol);

        String backSlash = "The path is D\\\\:Folder\\Files\\";
        System.out.println(backSlash);
    }
}
