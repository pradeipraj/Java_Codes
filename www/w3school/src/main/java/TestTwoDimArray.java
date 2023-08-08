public class TestTwoDimArray {
    public static void main(String[] args) {
        int[][] TwoDimNum = {{1,2,3}, {4,5,6}};
        System.out.println(TwoDimNum.length);
        System.out.println(TwoDimNum[0].length);
        System.out.println(TwoDimNum[1].length);

        System.out.println(TwoDimNum[0][0]);
        System.out.println(TwoDimNum[0][1]);
        System.out.println(TwoDimNum[0][2]);
        System.out.println(TwoDimNum[1][0]);
        System.out.println(TwoDimNum[1][1]);
        System.out.println(TwoDimNum[1][2]);


        String [][] myTeam = {{"A", "B","C"}, {"D","E","F"}};
        System.out.println(myTeam.length);
        System.out.println(myTeam[0].length);
        System.out.println(myTeam[1].length);

        for (int i=0; i<myTeam.length; i++){
            for (int j=0; j<myTeam[i].length; j++){
                System.out.println(myTeam[i][j]);
            }
        }
    }

}
