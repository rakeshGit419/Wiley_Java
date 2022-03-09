import java.util.*;

public class MapDriver{
    public static void main(String[] args){

        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map2.put(1,"C");
        map2.put(2,"D");

        Map<Integer,List<String>> map3 = new HashMap<>();

        map1.forEach((k,v)->map3.put(k,new ArrayList<>(Arrays.asList(v))));
        for(Integer i: map2.keySet()){
            if(map3.containsKey(i)) map3.get(i).add(map2.get(i));
            else map3.put(i, new ArrayList<>(Arrays.asList(map2.get(i))));
        }
        // map3.forEach((k,v)->System.out.println(k+" = "+v));
        System.out.println(map3);
    }
}