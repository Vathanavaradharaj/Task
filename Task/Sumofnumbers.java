package My.Task;
import java.util.Scanner;

public class Sumofnumbers {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number:- ");
	int num = in.nextInt();
	int val = Number(num);
	System.out.println("The Sum of the Number is " +val);
	}
  public static int Number(int num) {
	  int no = num *((num + 1) / 2);
	  return no;
  }
}
