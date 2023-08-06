public class BearkContinue {
    public static void main(String[] args) {

        //Break - It stops execution when i == 4
        int i;
        for (i=1; i<=10; i++){
            if (i==4){
                break;
            }
            System.out.println(i);
        }

        //Continue - It skips execution when i == 4 and continue the for loop
        int j;
        for (j=1; j<=10; j++){
            if (j == 4){
                continue;
            }
            System.out.println(j);
        }
    }
}
