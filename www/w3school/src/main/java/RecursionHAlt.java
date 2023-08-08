import static java.lang.Long.sum;

public class RecursionHAlt {
    public static void main(String[] args) {
        long result = sum(7, 10);
        System.out.println(result);
    }

    public static long sum(long start, long end){
        if (end>start){
            return end + sum(start, end - 1);
        }else return 0;
    }
}
