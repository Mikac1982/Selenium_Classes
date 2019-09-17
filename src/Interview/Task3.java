package Interview;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
//	String str="madams";
	String str;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a string");
	str=scan.nextLine();
	
	String rev="";
	
	for (int i=str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);	
	}
	if (str.equalsIgnoreCase(rev)) {
		System.out.println("String is a palindrpme");
	}else {
		System.out.println("String is NOT a palindrpme");
	}
		
		
		
		
		
		
	}
}
