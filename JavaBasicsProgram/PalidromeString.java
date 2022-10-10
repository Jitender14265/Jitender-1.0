package JavaBasicsProgram;
import java.util.*;
public class PalidromeString {
	
	public static void main(String[] args) {
String s,a;
Scanner sc=new Scanner (System.in);
s=sc.next();


StringBuffer sb = new StringBuffer(s);
sb.reverse();
String s2= sb.toString();


if(s2.equalsIgnoreCase(s)) {
	
	System.out.println("Palindrome");
}
else
	System.out.println("not Palidrome");
	
}
}