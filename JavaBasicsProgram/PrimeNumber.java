package JavaBasicsProgram;
import java.util.*;
public class PrimeNumber 
{
	public static void main(String[] args)
	{
	int x;
	Scanner sc=new Scanner(System.in);
 x=sc.nextInt();
 for(int i = 2;i<=x/2;++i)
 {
	 if(x%i==0) {
		 System.out.println(" notprime");
		System.exit(i);
	
	 }
	
 }
System.out.println("prime number");
 
}
}