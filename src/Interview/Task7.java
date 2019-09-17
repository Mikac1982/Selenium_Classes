package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {

	public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList(0);
	list.add(4);
	list.add(6);
	list.add(11);
	list.add(4);
	list.add(11);
		
	Set<Integer> hset=new HashSet<>(list);
	System.out.println(hset);	
		
	Set<Integer> hset2=new HashSet<>();	
	for (Integer num:list) {
		hset2.add(num);
	}
	System.out.println(hset2);	
		
	Set<Integer> lset=new LinkedHashSet<Integer>();		
	lset.addAll(list);
	System.out.println(lset);
	
	}
}
