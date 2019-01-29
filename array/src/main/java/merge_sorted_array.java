public class merge_sorted_array {
    public static int[] merge(int[] arr1, int[] arr2){
        int len1=arr1.length;
        int len2=arr2.length;
        int final_array_lenth=len1+len2;
        int[] result =  new int[final_array_lenth];

        int index1=0;
        int index2=0;
        int final_index=0;

        while(index1<len1 && index2<len2){
            result[final_index++] = arr1[index1] < arr2[index2] ? arr1[index1++]: arr2[index2++];
        }

        while(index1<len1 ){
            result[final_index++] = arr1[index1++];
        }

        while(index2<len2 ){
            result[final_index++] = arr2[index2++];
        }

        return result;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,10,20,30};
        int[] b = {5,6,7,11,12,13,14,20};
        for (int i : merge(a,b)){
            System.out.println(i);
        }
    }
}
