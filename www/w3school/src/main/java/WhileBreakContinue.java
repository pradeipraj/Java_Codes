public class WhileBreakContinue {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        while (i <= 10){
            System.out.println(i);
            i++;
            if (i == 4){
                break;
            }
        }
        while (j <= 10){
            System.out.println(j);
            j++;
            if (j==4){
                continue;
            }
        }
    }
}
