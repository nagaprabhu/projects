public class arrar2 {
    public static void main(String[] args){
        int[][] my2DArray;
        my2DArray = new int[3][4];

        my2DArray[1][1]=0*0;
        my2DArray[2][3]=10;

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.println(my2DArray[i][j]);
            }
        }
    }
}
