package JavaBasicsProgram;
import java.util.*;
 class object{
	int x,y;
	Scanner sc=new Scanner(System.in);
	void Set() {
		x=sc.nextInt();
		y=sc.nextInt();
		}
	void sum() {
		
		int sum=x+y;
		System.out.println(sum);
	}

}
public class CreateObject{
	public static void main(String[]args) {
		object aa=new object();
		aa.Set();
		aa.sum();
	}
	
}
