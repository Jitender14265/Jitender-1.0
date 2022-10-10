package JavaBasicsProgram;
import java.util.*;
public class ToGenerateRandomNumber {
	public static void main(String[]args) {
		for (int i = 1; i <= 10; i++) {
		    int x = 1 + (int) (Math.random() * 100);
		    System.out.println(x);
		}
	}

}
