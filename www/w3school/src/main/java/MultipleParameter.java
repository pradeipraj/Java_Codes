public class MultipleParameter {

    static void myMethod(String firstName, String lastName, int codeNumber){
        System.out.println("The first name is: " + firstName);
        System.out.println("The last name is: " + lastName);
        System.out.println("The code number is: " + codeNumber);
    }
    public static void main(String[] args) {

        myMethod("Pradeep", "Raj", 10);
        myMethod("Prashant", "Kognur", 11);

        dataTypes(1, 1, 10, 75.25, 20.5,'A', true);
    }

    static void dataTypes(int serialNumber, int questionNumber, int age, double perCentage, double milage, char section, boolean isIt){

        System.out.println(serialNumber);
        System.out.println(questionNumber);
        System.out.println(age);
        System.out.println(perCentage);
        System.out.println(milage);
        System.out.println(section);
        System.out.println(isIt);
    }
}
