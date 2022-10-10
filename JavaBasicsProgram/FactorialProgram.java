package JavaBasicsProgram;
import java.util.Scanner;
public class FactorialProgram {
	static int factorial(int x) {
		return x*factorial(x-1);
		
	}
	public static void main(String[]args) {
		
		System.out.println();
		int x,fact=1;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		if(x==0) {
			System.out.println("1");
		}
		else {
		for(int i=1;i<=x;i++) {
			fact=fact*i;
		}
		}
		System.out.println(fact);
	
	
	
	}
	private static void factorial() {
		// TODO Auto-generated method stub
		
	}

}
