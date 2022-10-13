package JavaArrayPrograms;

import java.util.Scanner;

public class SortArrayInAcendingOrder {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
										}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
