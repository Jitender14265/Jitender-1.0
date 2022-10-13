package JavaArrayPrograms;

import java.util.Scanner;

public class AtOddPOistion {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int[] arr=new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("number at odd poisition");
	for (int i = 0; i < arr.length; i=i+2) {
		System.out.println(arr[i]);
		
	}
	
}

}
