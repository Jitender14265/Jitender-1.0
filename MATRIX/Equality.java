package MATRIX;

import java.util.Scanner;

public class Equality {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Matrix 1
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int[][] arr=new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <y; j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();
		}
		// matrix 2
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int[][] arg=new int[a][b];
		boolean w;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <b; j++) {
				arg[i][j]=scanner.nextInt();	
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arg[i][j]+"  ");
			}
			System.out.println();
		}
		if (a==x&&b==y) {
			
		
		for (int i = 0; i <a; i++) {
			for (int j = 0; j < b; j++) {
				if(arr[i][j]==arg[i][j]) {
					w=true;
				}
				else {
					w=false;
				}
			}
		}
		if (w=true) {
			System.out.println("Equals");
			
		}else {
			System.out.println("Not Equals");
		}
		
	}else {
		System.out.println("Invalid Matrix");
	}

}}
