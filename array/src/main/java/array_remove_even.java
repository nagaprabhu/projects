public class array_remove_even {
    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};

        int oddcnt=0;
        for (int i=0;i<myArray.length;i++){
            if(1==myArray[i]%2){
                oddcnt++;
            }
        }

        int[] oddArray= new int[oddcnt];
        int index=0;
        for (int i=0;i<myArray.length;i++) {
            if(1==myArray[i]%2){
                oddArray[index]= myArray[i];
                index++;
            }
        }

            for(int i:oddArray){
            System.out.println(i);
        }
    }
}
