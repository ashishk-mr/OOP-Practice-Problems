import static java.lang.System.out;
import static java.lang.System.in;
import java.math.BigInteger;
import java.util.Scanner;

public class Ass_1_Rec_18 {

	public static void main(String[] args) {
		BigInteger num;
		Scanner scan= new Scanner(in);
		
		out.println("Enter no. of test cases: ");
		String test = scan.nextLine();
		int tc = Integer.parseInt(test);
		
		while(tc > 0) {
			out.println("Enter number to be checked: ");
			String n = scan.nextLine();
			
			num = new BigInteger(n);
			
			boolean ans = palin(num);
			
			if(ans == true) {
				out.println("Number is palindrome");
			}
			else {
				out.println("Number is not palindrome");
			}
			
			tc--;
		}
			
		scan.close();
	}
	
	public static boolean palin(BigInteger num) {
		if(num.compareTo(BigInteger.valueOf(10)) < 0) { //BigInteger can't be compared for their value by '==' operator
			out.println("B");
			return true;
		}
		else {
			BigInteger rev = BigInteger.valueOf(0);
			rev = revNum(num,rev);
			
			if(rev.compareTo(num) == 0) {
				out.println("A");
				return true;
			}
			
			else {
				return false;
			}
		}
	}
	
	public static BigInteger revNum(BigInteger num, BigInteger rev) {
		if(num.compareTo(BigInteger.valueOf(0)) <= 0) { 
			return rev;
		}
		
		else {
			BigInteger r = num.mod(BigInteger.valueOf(10));
			rev = rev.multiply(BigInteger.valueOf(10));
			rev = rev.add(r);
			
			rev = revNum(num.divide(BigInteger.valueOf(10)), rev);
		}
		
		return rev;
	}
}