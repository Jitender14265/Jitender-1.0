package JavaArrayPrograms;

import java.util.Scanner;

public class NumberOfElementPresentInarray {
	public static void main(String[] args) {
		int n,max;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("length of an array is " + arr.length);
	}

}
