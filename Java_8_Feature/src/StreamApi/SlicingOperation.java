package StreamApi;

import java.util.Arrays;
import java.util.List;

public class SlicingOperation {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("CoreJava","AdvJava","Spring","SpringBoot");
	list.stream().limit(3).forEach(e->System.out.println(e));
	list.stream().skip(3).forEach(e->System.out.println(e));
	
	List<String> data = Arrays.asList("ram","teja","ram","shyam");
	data.stream().distinct().forEach(e->System.out.println(e));

	}

}
