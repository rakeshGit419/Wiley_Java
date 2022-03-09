import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Container<T extends Number>{
    T value;
    
    public Container(T value) {
        this.value = value;
    }

    public void display(){
        System.out.println(value);
    }

    public void get(List<? extends Number> arr){
        double sum = 0;
        for(Number i:arr){
            sum += i.doubleValue();
        }
        System.out.println(sum);
    }
}
public class GenericClasesDriver {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,4,5,6);
        int[] a = {2,3,4,5,6,87,2,465,2,1};
        List<String> names = Arrays.asList("Rakesh","Balaji","ShowBot");
        // arr.stream().map(x -> x*x).forEach(System.out::println);
        // List<Integer> newarr = arr.stream().map(x -> x*x*x).collect(Collectors.toList());
        // newarr.forEach(n -> System.out.print(n+" "));
        // arr.stream().filter(n -> n%2==0).forEach(n -> System.out.print(n+" "));
        // Optional<Integer> user = arr.stream().reduce((a,b)-> a*b);
        // System.out.println(user.get());
        // Integer sum = arr.stream().reduce(0, Integer::sum);
        // System.out.println(sum);
        // names.stream().sorted().forEach(n-> System.out.print(n+" "));
        boolean res = IntStream.of(a).anyMatch(x->x==380);
        System.out.println(res);
    }
}
