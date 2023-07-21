public class MethodPara {

    static void myMethodPara(String firstName, String lastName, int age, String gender, String address)
    {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);

    }

    static void testMethod(String name, int age)
    {
        System.out.println(name + " is " + age + " years old");
    }

    static void anotherMethod(String yourName, String fatherName, String motherNAme)
    {
        System.out.println("My Name is " + yourName + ". My Father Name is " + fatherName +" and My Mother Name is " + motherNAme);
    }

    public static void main (String[] args)
    {
        anotherMethod("Rahul", "Rajeev", "Sonia");
        testMethod("Pradeep", 33);
        testMethod("Prakash", 34);
        testMethod("Somnath", 34);
        testMethod("Shiva", 44);
        myMethodPara("Pradeep", "Raj",33, "Male","Bangalore");
        myMethodPara("Prakash","Kalashetty", 34, "Male", "Gulbarga");
        myMethodPara("Shiva", "Patil", 34, "Male", "Chennai");
    }

}
