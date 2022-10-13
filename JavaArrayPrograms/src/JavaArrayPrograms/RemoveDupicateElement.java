package JavaArrayPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupicateElement {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
		
		
		
	}}
	

