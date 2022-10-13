package JavaArrayPrograms;

import java.util.Scanner;

 class Element{
	 Scanner sc=new Scanner(System.in);
	int x,y;
	
	int n=sc.nextInt();
	int[] arr=new int[n];
	
	void ArrayInzialization() {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	void FirstSmallernumber(){
		x=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=x) {
				x=arr[i];
			}
			
		}
		System.out.println("First SmallerNumber Element is  "+x);
		}
		
	void SecondSmallerNumber() { 
		y=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<y&&arr[i]>x) {
				
				y=arr[i];
			}
		}
			System.out.println("Second Smaller Number is  "+y);
		}
		
		
		
}
	

public class TwoInOneSmallerNumber {
	public static void main(String[] args) {
		Element e =new Element();
		
	
		e.ArrayInzialization();
		e.FirstSmallernumber();
		e.SecondSmallerNumber();
		
		
	}
}
