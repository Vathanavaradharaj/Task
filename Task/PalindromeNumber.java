package My.Task;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = in.nextInt();
		boolean p = Number(num);
		System.out.println("is the number is plaindrome " +p);
		in.close();
		}
	public static boolean Number(int num){
		int Vnum = num;
		int rnum = 0;
		while(num !=0) {
			int digit = num % 10;
		rnum = rnum * 10 + digit;
		num /= 10;
		}
		return  Vnum ==  rnum;
	}

}
