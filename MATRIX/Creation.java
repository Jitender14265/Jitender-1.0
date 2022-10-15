package MATRIX;

import java.util.Scanner;

public class Creation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
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
	}
	

}
