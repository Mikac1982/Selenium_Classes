package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task8 {

	public static void main(String[] args) {
		//convert string array into array list
		
		String[] array= {"hi","hello","bye"};
		List<String> alist=Arrays.asList(array);
		System.out.println(alist);
		
//		List<String> alist=new ArrayList<>();
//	    alist.add("hi");
//		alist.add("hello");
//		System.out.println(alist);
			
		 String[] words = {"ace", "boom", "crew", "dog", "eon"};
	     List<String> wordList = Arrays.asList(words);
	     for (String e : wordList) {
	        System.out.println(e);
	     }
		 System.out.println(wordList);
		
		
	}
	
	
	
}
