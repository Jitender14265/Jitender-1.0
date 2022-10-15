package MATRIX;

import java.util.Scanner;

public class Identity {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int x=scanner.nextInt();
	int y=scanner.nextInt();
	boolean w=true;
	int[][] arr=new int[x][y];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			arr[i][j]=scanner.nextInt();
		}
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j]+"  ");
			
		}
		System.out.println();
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			
			if (i==j&&arr[i][j]!=1) {
				w=false;
				break;
				}
			else if(i!=j&&arr[i][j]!=0)
				{w=false;
			break;
			}}
		} 
	
	if (w) {
		System.out.println("Identity");
		
		
	}else {
		System.out.println("Not Identity");
	}
}
}
