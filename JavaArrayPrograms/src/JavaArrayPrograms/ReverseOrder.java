package JavaArrayPrograms;
import java.util.*;
public class ReverseOrder {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
 int arr[]=new int[n];
 for (int i = 0; i < arr.length; i++) {
	arr[i]=sc.nextInt();
}
 for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+"  ");
}
 System.out.println("Printing The element in Reverse Order");
 	
 	for (int i=arr.length-1; i>=0 ; i--) {
	 System.out.print(arr[i]+"  ");
	
}
 



}}
