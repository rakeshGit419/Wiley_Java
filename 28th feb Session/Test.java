import java.util.*;
import java.util.stream.*;

public class Test
{
	public static void main(String[] args) {

		List<String> list = Arrays.asList("vijay","rakesh","renuka","vijay","rakesh","renuka");
		list.stream().distinct().forEach(System.out::println);
	}
}

