package My.Task;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter the number:- " );
        int num = in.nextInt();
        Boolean value = Number(num);
        System.out.println("The number is ArmstrongNumber " +value);
        in.close();  
	}
 public static Boolean Number(int num) {
	 int nnum = num;
		 int val = String.valueOf(num).length();
	  int sum =0;
	  while(num !=0) {
		  int digit = num % 10;
		  sum += Math.pow( digit, val);
		  num /= 10;  
		  }
	  return sum == nnum;
 }
}
