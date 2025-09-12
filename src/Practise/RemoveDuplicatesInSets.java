package Practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInSets {
	
	public static void main(String[] args) {
		
		List<Integer> n = Arrays.asList(10,20,20,30,40,50);
		
		Set<Integer> newNumber = new HashSet<Integer>(n);
		
		System.out.println("Original List : "+n);
	    System.out.println("After Removing Duplicates :"+newNumber);
		
		
	}

}
