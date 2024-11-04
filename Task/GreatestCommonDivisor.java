package My.Task;
import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the first value :");
		int num1 = in.nextInt();
		System.out.println("Enter the second value: ");
		int num2 = in.nextInt();
		int value =  Gcd(num1,num2);
		System.out.println("The Greatest Common Divisor is " +num1+ " and " + num2+ " is " +value);
	    in.close();
	}
	public static int Gcd(int a, int b) {
		while( b != 0) {
			int val = b;
			 b = a % b;
	            a = val;
		}
		return a;
	}

}
