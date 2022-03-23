// import static java.util.stream.Collectors.*;
 
// import java.lang.*;
import java.util.*;
// import java.util.stream.*;
// import java.util.stream.Collectors;

public class main{
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("rakesh",100);
        map.put("vijay",200);
        map.put("ajay",12);
        map.put("prem",34);
        map.put("charani",45);
        map.put("vaishnavi",300);

        List<Map.Entry<String,Integer>> lmap = new LinkedList<>(map.entrySet());
        Collections.sort(lmap,(i1,i2) -> i2.getValue().compareTo(i1.getValue()));

        HashMap<String,Integer> newMap = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> em : lmap){
			newMap.put(em.getKey(),em.getValue());
		}

        newMap.forEach((k,v)->{System.out.println(k+" "+v);});
        
    }
}