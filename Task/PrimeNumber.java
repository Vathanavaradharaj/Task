package My.Task;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
    System.out.println("Enter the Number to chech its prime(true) or not a prime(false): ");
    int num = in.nextInt();
    boolean prime = Number(num);
    System.out.println(prime);
    in.close();
	}
  public static boolean Number(int num) {
	  if(num <=1) {
		  return false;
	  }
	  for  (int i=2;i<=Math.sqrt(num);i++) {
		  if(num % i ==0) {
			  return false;
		  }
	  }
	  return true;
  }
}
