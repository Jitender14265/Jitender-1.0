package JavaArrayPrograms;


import java.util.Scanner;

 class Elements{
	 Scanner sc=new Scanner(System.in);
	 int first,sec,third;
	 int n=sc.nextInt();
	 
		int arr[]=new int[n];
	
	 void FirstLargestElement() {

		

		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		first=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>first) {
				first=arr[i];
				
			}
		}
		System.out.println("First Largest element In Array  " +first);

		
		
		
}
	void Second_Largest_Element() {
	
		sec=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>sec && arr[i]<first) {
				sec=arr[i];
				
			}
		}
		System.out.println("Second The Largest Element Are  "+sec);
		
	}
	void Third_Largest_Element() {
		third=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>third && arr[i]<sec && arr[i]<first) {
				third=arr[i];
			}
		}
		System.out.println("Third Largest Element is  "+ third);
		
	}
	void display() {
		System.out.println(first+" "+sec+"  " +third+ "  ");
	}
}
public class Three_In_One_First_Second_And_ThirdLargestNumber {
	public static void main(String[] args) {
		
		
		Elements e=new Elements();
		e.FirstLargestElement();
		e.Second_Largest_Element();
		e.Third_Largest_Element();
		e.display();
	}
	
}
