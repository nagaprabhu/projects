
public class array1 {
    public static void main(String[] args){

        //Declaration Syntax
        //int myArray[];
        //int[] myArray;
        //Initialization Syntax
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};

        int[] myArray2;
        myArray2 = new int[] {1,2,3,4,5,6,7,8,9,10};

        //for (int i=0;i<10;i++){
        //   System.out.println(myArray[i]);
        // }

        for(int i:myArray){
            //Critical: dont have access to index.
            System.out.println(i);
        }

        Integer[] newArray = {2,4,6,8,10};
            }
}


