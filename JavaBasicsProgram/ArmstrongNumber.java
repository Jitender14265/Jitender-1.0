package JavaBasicsProgram;
import java.util.*;

public class ArmstrongNumber {
	public static void main(String[]args) {
	int x,sum=0,b;
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	String y=Integer.toString(x);
	int z=y.length();
	b=x;
	
	for(int i=0;i<z;i++) {
		int a=x%10;
		 sum=sum+(int)Math.pow(a,z);
		   x=x/10;
		  System.out.println(sum);
	}
	if (sum==b) {
		System.out.println(b+"  Number is Armstrong Number");
	}
	else
		System.out.println("Number is not Armstrong Number");
	}

}
