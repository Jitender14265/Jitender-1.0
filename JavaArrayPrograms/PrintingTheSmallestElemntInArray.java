package JavaArrayPrograms;
import java.util.*;
public class PrintingTheSmallestElemntInArray {
public static void main(String[] args) {
	int n,max;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int arr[]=new int[n];
	max=arr[0];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
		
	}
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]<max) {
			max=arr[i];
		
}
		
}
	System.out.println(arr[max]);
}}