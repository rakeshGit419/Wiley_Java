// import java.util.ArrayList;
// import java.util.List;
import java.util.*;
import java.util.stream.*;

public class CollectionsTask {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('A');
        list.add('5');
        list.add('Z');
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        for(Character ch : list){
            int a = ch;
            set.add(a);
        }
        List<Integer> newlist = set.stream().collect(Collectors.toList());
        Collections.sort(newlist,Collections.reverseOrder());
        System.out.println(newlist);
            
    }
}

