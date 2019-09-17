package Interview;

import java.util.Scanner;

import org.openqa.selenium.interactions.Actions;

public class Task4 {

	public static void main(String[] args) {
	//is number is a prime	
		
	int num;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please neter a number");	
	num=scan.nextInt();
	
	boolean isPrime=true;
	
	for(int i=2; i<num; i++) {
		if(num%i==0) {
			isPrime=false;
			break;
		}
	}
	if (isPrime) {
		System.out.println(num+" is a prime number");
	}else {
		System.out.println(num+" is NOT a prime number");
	}	
		
	
	
		
	}
}
