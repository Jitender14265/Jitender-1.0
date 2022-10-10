package JavaBasicsProgram;
import java.util.Scanner;
public class fibnocciSeries {
public static void main(String [] args ) {
	Scanner sc=new Scanner(System.in);
	
	int x;
x=sc.nextInt();
int previous =0;
int next=1;
int sum=0;
for(int i=0;i<x;i++) {
	sum=previous+next;
	previous=next;
	next=sum;
	System.out.print(sum+" ");
}
	
	
}}
