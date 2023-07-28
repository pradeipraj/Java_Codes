import javax.sound.midi.Soundbank;
import java.text.spi.DateFormatProvider;
import java.util.Date;

public class PrintVariable {
    public static void main (String [] args)
    {
        String firstName;
        firstName = "Pradeep";
        System.out.println("The first name is: " + firstName);

        String middleName;
        middleName = "Raj";
        System.out.println("The middle name is: " + middleName);

        String lastName;
        lastName = "Sheelvant";
        System.out.println("The last name is: " + lastName);

        String emailID;
        emailID = "pradeip@gmail.com";
        System.out.println("The e mail ID is: " + emailID);

        int age;
        age = 33;
        System.out.println("The age is: " + age);

        String dateOfBirth;
        dateOfBirth = "11/02/1990";
        System.out.println("The Date of birth is: " + dateOfBirth);

        int x = 5;
        int y = 10;

        int add = x + y;
        System.out.println("The addition is: " + add);

        int sub = x - y;
        System.out.println("The subtraction is: " + sub);

        int mul = x * y;
        System.out.println("The multiplication is: "+ mul);

        int div = y/x;
        System.out.println("The division is: " + div);
    }
}
