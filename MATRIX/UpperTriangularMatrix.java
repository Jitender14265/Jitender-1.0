package MATRIX;

import java.util.Scanner;

public class UpperTriangularMatrix {
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
	System.out.println();
	if(x!=y) {
		System.out.println("Given Matrix Is Not Square Matrix  ");
		
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(i>j) {
				arr[i][j]=0;
			}
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
