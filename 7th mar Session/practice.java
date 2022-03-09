import java.util.Arrays;
import java.util.List;

class Prem<T extends Number>{
    T value;
    
    public Prem(T value) {
        this.value = value;
    }

    public void getSum(List<? extends Number> arr){
        double sum = 0;
        for(Number i:arr) sum += i.doubleValue();
        System.out.println(sum);
    }

    public void display(){
        System.out.println(value);
    }
}

public class practice{
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,4,5,6);
        // int[] arr1 = {2,3,4,5};
        arr.forEach(System.out::print);
        arr.forEach(n-> System.out.print(n+" "));
        for(Integer i : arr) System.out.print(i+" ");
        System.out.println(arr);
    }
}