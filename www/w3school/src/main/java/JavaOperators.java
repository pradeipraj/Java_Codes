public class JavaOperators {
    public static void main(String[] args) {
        int x = 150 + 50;
        System.out.println(x);

        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum2 + 50;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        //Assignment Operators
        int a = 10; // here = is an assignment operator
        System.out.println(a);

        //Addition assignment
        int b = 10;
        b += 5; //Here += is an addition assignment that adds the value 5 to variable 'b' unless it is final.
        System.out.println(b);

        b -= 5; //Here -= is subtraction assignment.
        System.out.println(b);

        b *= 2; //Here *= is Multiply assignment.
        System.out.println(b);

        b /= 2; //Here /= is Division assignment.
        System.out.println(b);

        b %= 2; //Here %= is Reminder assignment. Output will be the reminder
        System.out.println(b);

        int c = 3;
        c &= 2; //Here &= is a binary AND operation.
        System.out.println(c);

        int d = 2;
        d |= 3; //Here |= is a binary OR operation.
        System.out.println(d);

        //Comparative operators
        int myAge = 33;
        int myWifeAge = 30;
        System.out.println(myAge < myWifeAge); //Less than operator
        System.out.println(myAge > myWifeAge); //Greater than operator
        System.out.println(myAge == myWifeAge); //Equal operator
        System.out.println(myAge != myWifeAge); //Not Equal operator
        System.out.println(myAge >= myWifeAge); //Greater than or equal to operator
        System.out.println(myAge <= myWifeAge); //Less than or equal to operator

    }
}
