package JavaArrayPrograms;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of All Element Present In Array  "+sum);
	}

}
