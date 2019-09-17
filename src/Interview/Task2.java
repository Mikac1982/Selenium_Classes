package Interview;

public class Task2 {

	public static void main(String[] args) {
		
	int[] array= {-84,64,-6,143,33,0,75};
	
	int max=array[0];
	int min=0;
	int secMax=0;
	
	for (int i=0; i<array.length; i++) {
		if(array[i]>max) {
			secMax=max;
			max=array[i];
		}else if(array[i]>secMax & array[i]!=max) {
			secMax=array[i];
		}else if(array[i]<min){
			min=array[i];
		}
	}
	System.out.println("Max number: "+max);	
	System.out.println("Min number: "+min);	
	System.out.println("Second Max number: "+secMax);	
		
	for (int a:array) {
		if(a>max) {
			max=a;
		}else if(a<min) {
			min=a;
		}
	}	
	for (int a:array) {
		if(a<max && a>secMax) {
			secMax=a;
		}
	}	
	System.out.println("Max number: "+max);	
	System.out.println("Min number: "+min);	
	System.out.println("Second Max number: "+secMax);	
	
	}
}
