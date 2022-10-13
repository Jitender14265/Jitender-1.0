package JavaArrayPrograms;

import java.util.Scanner;

public class PrintOddAndEven {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();		
		int arr[]=new int[n];
		int even[]=new int[n];
		int odd[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Even Number ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
			}
		System.out.println("Odd Number");
		for (int i = 0; i < odd.length; i++) {
			if (arr[i]%2!=0) {
				System.out.println(arr[i]);
				
			}
		}
		
	}

}
