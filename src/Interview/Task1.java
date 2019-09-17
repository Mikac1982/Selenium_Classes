package Interview;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++) {
			for (int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=7; i++) {
			for (int j=6; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	int[] arr= {6, 74, -4, 31, 0, 212, -44};
	
	Arrays.parallelSort(arr);
	int min2=arr[0];
	int max2=arr[arr.length-1];
	int Secmax2=arr[arr.length-2];
	
	
	System.out.println();
	int max=arr[0];
	int min=0;
	int secMax=0;
	
	for (int a:arr) {
		if (a>max) {
			max=a;
		}else if(a<min) {
			min=a;
		}
	}
	for (int a:arr) {
		if (a<max && a>secMax) {
			secMax=a;
		}
	}
	System.out.println("Max number: "+max);	
	System.out.println("Min number: "+min);	
	System.out.println("Second Max number: "+secMax);	
		
	for (int i=0; i<arr.length; i++) {
		if (arr[i]>max) {
			secMax=max;
			max=arr[i];
		}else if(arr[i]>max) {
			max=arr[i];
		}else if(arr[i]<min) {
			min=arr[i];
		}
	}	
	System.out.println("Max number: "+max);	
	System.out.println("Min number: "+min);	
	System.out.println("Second Max number: "+secMax);	
	
	System.out.println();
	
	String str= "145gjksk*&(^%gdwd54";
	String replace=str.replaceAll("[^a-zA-Z]", "");
	System.out.println(replace);
	System.out.println(replace.length());
	
	String replace2=str.replaceAll("[^0-9]", "");
	System.out.println(replace2);
	System.out.println(replace2.length());
	
	String s="Hello everyone";
	
	String rev="";
	for (int i=s.length()-1; i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
	String rev2="";
	for (int i=s.length(); i>0; i--) {
	   rev2+=s.substring(i-1, i);  
	}
	System.out.println(rev2);
	
	String rev3="";
	char[] array=s.toCharArray();
	for(int i=s.length()-1; i>=0; i--) {
		rev3+=array[i];
	}
	System.out.println(rev3);
	
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());
	
	String mika="I will get a good job soon";
	
	String[] words=mika.split(" ");
	System.out.println(words.length);
	for(String word:words) {
		System.out.println(word);
	}
	
	for(int i=words.length-1; i>=0; i--) {
		System.out.println(words[i]);
	}
	
	
	
	
	
	
	
	
	}
}
