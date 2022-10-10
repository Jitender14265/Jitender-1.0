package JavaBasicsProgram;
import java.util.*;

public class CompareTwoObjects {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	Integer x,y;
	Double a,b;
	String s1,s2;
	x=sc.nextInt();
	y=sc.nextInt();
	a=sc.nextDouble();
	b=sc.nextDouble();
	s1=sc.next();
	s2=sc.next();
	System.out.println(x.equals(y));
	System.out.println(a.compareTo(b));
	System.out.println(s1.equals(s2));
	
	
	
}
}
