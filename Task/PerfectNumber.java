package My.Task;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int num = in.nextInt();
		boolean pnum = Number(num);
		System.out.println("is this perfect number? " +pnum);
		in.close();

	}
public static boolean Number(int num) {
	//int vnum = num;
	int sum = 0;
	for (int i =1;i<=num/2;i++ ) {
	if(num % i == 0) {
		sum += i;
	}
	}
	return sum == num;
}
}
