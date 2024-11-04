package My.Task;
import java.util.Scanner;
public class Reverse_Number {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the number:-");
		String num = in.nextLine();
		System.out.println("The Reversed Number is " +Number(num));
		in.close();

	}
public static String Number(String num) {
	String[] rev = num.split("");
	  StringBuilder obj = new StringBuilder();
	  for(int i= rev.length - 1;i>=0;i--) {
		  obj.append(rev[i]);
	  }
	     return obj.toString();
}
}
