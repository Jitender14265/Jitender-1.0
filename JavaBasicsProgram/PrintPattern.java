package JavaBasicsProgram;
import java.util.*;
public class PrintPattern {
	public static void main(String[]args) {
Scanner sc= new Scanner(System.in);
String s;
for(int i=0;i<5;i++) {
	for(int j=5;j>i;j--) {
		System.out.print("*");
		
	}
	System.out.println();
}
}
}