package StreamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {
	public static void main(String[] args) {
		/*
		 * Stream<Integer> data = Stream.of(45,86,89,10,30,21,9,85);
		 * data.filter(i->i>=20).forEach(i->System.out.println(i));
		 */
		
		List<Integer> list = Arrays.asList(45,86,89,10,30,21,9,85);
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
	}

}
