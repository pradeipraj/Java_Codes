public class NestedLoop {
    public static void main(String[] args) {

        int i;
        int j;
        int k;
        int l;
        for (i=1; i<=5; i++){
            System.out.println(i);

            for (j=10; j<=25; j++){
                System.out.println(j);
            }
        }

        for (k=1;k<=3; k++){
            System.out.println("Heading");

            for (l=1; l<=5; l++){
                System.out.println("Paragraph");
            }
        }
    }
}
