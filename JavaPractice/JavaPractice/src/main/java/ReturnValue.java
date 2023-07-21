public class ReturnValue {

    static int methodForReturnValue(int x)
    {
        return 5 + x;
    }

    static int myMethodReturn(int x, int y)
    {
        return x+y;
    }

    static int methodToStore(int x, int y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        int z=methodToStore(10, 10);
        System.out.println(z);

        System.out.println("The Addition of x and y is: " + myMethodReturn(10,10));
        System.out.println("The returned value is :" + methodForReturnValue(1));
        System.out.println("The returned value is :" + methodForReturnValue(2));
        System.out.println("The returned value is :" + methodForReturnValue(3));
        System.out.println("The returned value is :" + methodForReturnValue(4));
        System.out.println("The returned value is :" + methodForReturnValue(5));
        System.out.println("The returned value is :" + methodForReturnValue(6));
    }

}
