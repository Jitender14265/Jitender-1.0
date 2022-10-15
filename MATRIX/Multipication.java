package MATRIX;

import java.util.Scanner;

public class Multipication {
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
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int[][] arg=new int[a][b];
		for (int i = 0; i < arg.length; i++) {
			for (int j = 0; j < arg.length; j++) {
				arg[i][j]=scanner.nextInt();	
			}
		}
		for (int i = 0; i < arg.length; i++) {
			for (int j = 0; j < arg.length; j++) {
				System.out.print(arg[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		int[][] aa=new int[a][b];
		for (int i = 0; i < arg.length; i++) {
			for (int j = 0; j < arg.length; j++) {
				aa[i][j]=0;
						for (int j2 = 0; j2 < aa.length; j2++) {
							aa[i][j]+=arr[i][j2]*arg[j2][i];
						};
			}
			
		}
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa.length; j++) {
				System.out.print(aa[i][j]+" ");
			}
			System.out.println();
		}
	}


}
