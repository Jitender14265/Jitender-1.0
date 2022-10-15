package MATRIX;

import java.util.Scanner;

public class CountingOddEven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int e=0;
		int o=0;
		int[][] arr=new int[x][y];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j]%2==0) {
					e++;
					}
				else {
					o++;
				}
				
			}
		
		}
		System.out.println("Even Numbers Are  "+e);
		System.out.println("odd Nubers Are  "+o);
	}

}
