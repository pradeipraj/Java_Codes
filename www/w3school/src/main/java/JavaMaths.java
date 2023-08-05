public class JavaMaths {
    public static void main(String[] args) {

        int x = 10;
        int y = 12;
        double z = -2.5;

        int maxNum = Math.max(x,y);
        int minNum = Math.min(x,y);
        double squareRoot = Math.sqrt(x);
        double absValue = Math.abs(z);

        System.out.println(maxNum);
        System.out.println(minNum);
        System.out.println(squareRoot);
        System.out.println(absValue);

        //Random number between 0.0 to 1.0
        System.out.println(Math.random());
        //Random number between 1 and 100
        System.out.println(Math.random()*1000);

    }
}
