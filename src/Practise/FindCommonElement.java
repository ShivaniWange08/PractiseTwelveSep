package Practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElement {
	
	public static void main(String[] args) {
		
		Set<String> s1 = new HashSet<String>(Arrays.asList("A", "B", "C", "D"));
		Set<String> s2 = new HashSet<String>(Arrays.asList("A", "C"));
		
		s1.retainAll(s2);
		
		System.out.println("Common Elements : "+s1);
	}

}
