import java.util.HashMap;

public class findsum {
    public static void findpair(int[] arr,int value){
        //O(n^2)
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length && j!=i; j++ ){
                if (arr[i]+arr[j] == value){
                    System.out.println(arr[i] +","+ arr[j]);
                }
            }
        }
    }

    public static void findpair2(int[] arr, int value){
        //O(n)
        HashMap<Integer,Boolean> hmap  = new HashMap<Integer,Boolean>();
        for (int i:arr){
            hmap.put(value-i,true);
        }

        for (int i:arr){
            if (hmap.containsKey(i)){
                System.out.println(i + "," + (value-i));
            }
        }
    }

    public static void main(String[] args){
        int[] a = {1,21,3,14,5,60,7,6};
        //findpair(a,27);
        findpair2(a,27);
    }
}
