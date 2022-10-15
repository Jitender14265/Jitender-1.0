package MATRIX;

import java.util.Scanner;

public class SparseMatrix {
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			int c=0;
			int[][] arr=new int[x][y];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j]=scanner.nextInt();
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][j]==0) {
						c++;
						
					}
				}
				
	}
			if (c>(x*y)/2) {
				System.out.println("Given Matrix Is Sparse Matrix");
			}
			else {
				System.out.println("Not A Sparse Matrix");
			}
				
			}

}
