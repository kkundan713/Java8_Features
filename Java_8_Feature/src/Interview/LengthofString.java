package Interview;

import java.util.Arrays;
import java.util.Comparator;

public class LengthofString {
	public static void main(String[] args) {
		String[] str= {"Apple","Orange","Mango","Banana"};
		
		/*
		 * int len = Arrays.stream(str).mapToInt(st->st.length()).max().orElse(0);
		 * System.out.println(len);
		 */
		  
		  
				
		
		String st = Arrays.stream(str).max(Comparator.comparing(String::valueOf)).get();
		System.out.println(st);
	
	
	}

}
