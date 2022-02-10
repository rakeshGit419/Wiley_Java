public class merge2SortedArrays {
    public static void getSortedArray(int[] arr1,int[] arr2){

        int len1 = arr1.length,len2 = arr2.length,i=0,j=0;
        while(i<len1 && j<len2){
            if(arr1[i]<=arr2[j]){
                System.out.print(arr1[i]+" ");i++;
            }else{
                System.out.print(arr2[j]+" ");j++;
            }
        }

        while(i<len1) {System.out.print(arr1[i]+" ");i++;}

        while(j<len2) {System.out.print(arr2[j]+" ");j++;}
    }
    
    public static void main(String[] args){
        int[] arr1 = {2,5,7,23,45};
        int[] arr2 = {1,3,10,90,108};

        getSortedArray(arr1,arr2);
    }
}
