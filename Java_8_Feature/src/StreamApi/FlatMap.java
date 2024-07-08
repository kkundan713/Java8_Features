package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("CoreJava","AdvJava","Spring","SpringBoot");
		List<String> uicourses = Arrays.asList("html","css","JavaScript","BootStrap");
		   List<List<String>> list = Arrays.asList(javacourses,uicourses);
		  // list.stream().forEach(e->System.out.println(e));
		   Stream<String> flatMap = list.stream().flatMap(s->s.stream());
		   
		   flatMap.forEach(s->System.out.println(s));
	}

}
