package JavaArrayPrograms;
import java.util.*;
public class LeftRotateTheElements {
	public static void main(String[] args) {
		int n,temp;
		Scanner sc=new Scanner(System.in);
		//n= sc.nextInt();
		int[] a=  {2,56,48,69,43,54};
		
		int e=a.length;
		for(int i=0;i<3;i++) {
		temp=a[e-1];
		a[e-1]=a[i];
		a[i]=temp;
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
