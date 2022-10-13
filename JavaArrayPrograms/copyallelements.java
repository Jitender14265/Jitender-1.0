package JavaArrayPrograms;
import java.util.*;
public class copyallelements {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of element in array");
	int n=0;
	n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	System.out.println("enter the ELement of first array");
	
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
     for(Integer k:a) {
    	 System.out.print(k+" ");
     }
	for(int i=0;i<n;i++) {
		b[i]=a[i];
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		System.out.print(b[i]+" ");
	}
}
}
