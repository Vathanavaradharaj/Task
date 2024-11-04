package My.Task;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int num = in.nextInt();
		long fact = Number(num); 
		System.out.println("The Factorial value is " +fact);
		in.close();
	}
	public static long Number(int num) {
		long result = 1;
		 for (int i = 1; i <= num; i++) {
	            result *= i;
	        }
		return result;
	}
}
