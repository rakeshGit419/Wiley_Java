public class minMaxArray {
    public static void main(String[] args){
        int[] arr = {67,12,98,1,34,2};

        int max = arr[0],min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];// 98
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("largest element: "+max+"\nSmallest element: "+min);
    }
}
