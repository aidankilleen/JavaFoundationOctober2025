package ie.rc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingInvestigation {

	
	public static int CompareTwoIntegers(int a, int b) {
		
		if (a<b) {
			return -1;
		} else if (a == b) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 6, 43, 7, 3, 9, 99, 76, 45, 32, 14, 54, 100, 27};
		
		// you can't use a built-in type (int, float, double...) as a generic
		//List<int> numberList = new ArrayList<int>();
		
		List<Integer> numberList = new ArrayList<>();
		
		for (int i : numbers) {
			numberList.add(i);
		}
		
		
		numberList.sort(Comparator.naturalOrder());
		
		for (int i : numberList) {
			System.out.println (i);
		}
		
		
		// lambda
		// is a function
		// defined inline rather than separately
		// don't have a name
		
		numberList.sort((a, b) -> {
			System.out.printf("comparing %d with %d\n", a, b);
			return Integer.compare(b,  a);
		});
		
		for (int i : numberList) {
			System.out.println (i);
		}		
		
		
		
		
		
		
		

	}

}
