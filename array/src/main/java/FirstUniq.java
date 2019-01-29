public class FirstUniq {
    public static int find(int[] arr){
        int result=0;

        boolean duplication=false;
        for (int i=0;i<arr.length;i++){
            duplication=false;
            System.out.println("Processing " + arr[i]);
            for (int j=0;j<arr.length ; j++){
                System.out.println("comparing " + arr[i] +" vs "+ arr[j]);
                if (arr[i] == arr[j] && i !=j) {
                    duplication=true;
                    System.out.println("Duplicate for " + arr[i]);
                }
            }
            if (duplication==false){return arr[i];}
        }
        return 0;
    }

    public static void main(String[] args){
        int r=0;
        int[] arr = {1,2,3,1,3};
        r=find(arr);
        System.out.println(r);

    }
}
