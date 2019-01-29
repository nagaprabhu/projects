public class findproduct {
    public static int[] findmul(int[] arr){
            //O(n), but will burst if input contains 0.
            int[] result = new int[arr.length];
            int product=1;
            for (int i=0;i<arr.length;i++){
                product*=arr[i];
            }

            for (int i=0;i<result.length;i++){
                result[i]=product/arr[i];
            }

            return result;
        }


    public static int[] findmul2(int[] arr) {
        int roll_left=1;
        int roll_right=1;
        int[] result = new int[arr.length];

        for (int i=0;i<result.length;i++){
            result[i]=1;
        }

        //Left roll
        for (int i=0;i<arr.length;i++){
            result[i]=roll_left;
            roll_left*=arr[i];
        }

        //Right roll
        for (int i=arr.length-1;i>=0;i--){
            result[i]*=roll_right;
            roll_right*=arr[i];
        }

        return result;
    }

        public static void main(String[] args){
            int[] arr = {0,1,2,3,4,5,6,7};
            //for (int i : findmul(arr)){
            //    System.out.println("one "+ i);
            //}

            for (int i : findmul2(arr)){
                System.out.println("Two " + i);
            }

        }
    }



