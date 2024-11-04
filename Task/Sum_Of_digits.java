package My.Task;
import java.util.Scanner;
public class Sum_Of_digits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter thr Number:- ");
		int num = in.nextInt();
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;  
		}
		System.out.println("Sum of the Digits is " +sum);
		in.close();
	}
}
