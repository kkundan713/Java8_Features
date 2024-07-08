package Interview;

import java.util.Arrays;

public class SecondSmallest {
	
	
	public static void main(String[] args) throws IllegalAccessException {
		int[] number= {5,2,3,8,9,2};
		findsecondSmallest(number) ;
	}

	public  static void findsecondSmallest(int[] number) throws IllegalAccessException {
		int second = Arrays.stream(number).sorted().distinct().skip(1).findFirst().orElseThrow(()-> new IllegalAccessException("Array does not have a second smallest element"));
		System.out.println("Second smallest element is="+second);
		
	}

}
