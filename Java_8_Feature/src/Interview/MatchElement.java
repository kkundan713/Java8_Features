package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatchElement {
	public static void main(String[] args) {
		int[] arr1= {1,5,6,8,7};
		int[] arr2= {7,5,5,8,7};
		matchElement(arr1,arr2);
				}

	private static void matchElement(int[] arr1, int[] arr2) {
		List<Integer> collect = Arrays.stream(arr1).filter(number->Arrays.stream(arr2).anyMatch(Num->number==Num)).boxed().collect(Collectors.toList());
		
		System.out.println("The comman element are: "+collect);
	}

}
