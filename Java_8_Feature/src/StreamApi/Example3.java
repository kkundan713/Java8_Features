package StreamApi;

import java.util.Arrays;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("Kundan","Ram","Shyam","Tilak","Sita","Ravi","Kailash");
	list.stream().filter(i->i.startsWith("K")).map(i->i+"-"+i.length()).forEach(e->System.out.println(e));

	}

}
