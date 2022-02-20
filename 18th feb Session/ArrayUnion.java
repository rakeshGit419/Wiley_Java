import java.util.Arrays;
import java.util.Scanner;

public class ArrayUnion {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = scanner.nextInt();
        }

        int[] arr2 = new int[m];
        for(int i=0;i<n;i++){
            arr2[i] = scanner.nextInt();
        }
        
        

        System.out.println(getUnionCount(getArr(arr1),getArr(arr2),n,m));
    }

    private static int[] getArr(int[] arr) {
        Arrays.sort(arr);
 
        int len = arr.length;
        int j = 0;
 
        for (int i = 0; i < len - 1; i++) {
 
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
 
        arr[j++] = arr[len - 1];
        return arr;
    }

    private static int getUnionCount(int[] arr1, int[] arr2,int n,int m) {
        int i=0,j=0,count = 0;
        while(i<n && j<m){
            if(arr1[i] == arr2[j]) count++;
            else count += 2;
            i++;j++;
        }
        if(i<n) count += (n-i);
        if(j<m) count += (m-j);
        return count;
    }
}


/*
import java.util.*;
public class ArrayUnion {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();

int[] a1=new int[m];
int[] a2=new int[n];

for(int i=0;i<m;i++)
    a1[i]=sc.nextInt();

for(int i=0;i<n;i++)
    a2[i]=sc.nextInt();

int count=0;
for(int i=0;i<m;i++)
    for(int j=0;j<n;j++)
        if(a1[i]==a2[j])
            count++;
System.out.println((n+m)-c);
}
}
*/ 
