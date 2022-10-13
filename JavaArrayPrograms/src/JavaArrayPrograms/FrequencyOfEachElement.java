package JavaArrayPrograms;
import java.util.*;
public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int n;
	Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		 boolean visited[] = new boolean[n];
	     
		    Arrays.fill(visited, false);
		 
		    for (int i = 0; i < n; i++) {
		 
		       
		        if (visited[i] == true)
		            continue;
		 
		           int count = 1;
		        for (int j = i + 1; j < n; j++) {
		            if (arr[i] == arr[j]) {
		                visited[j] = true;
		                count++;
		            }
		        }
		        System.out.println(arr[i] + " " + count);
		    }
		}
		 
			}
