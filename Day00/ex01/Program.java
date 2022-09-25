import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		int digit = 0;
		int sqrt = 0;
		boolean result = true;
		int count = 0;
		int exit_code = 0;
		Scanner scan = new Scanner(System.in);
		digit = scan.nextInt();


		if (digit <= 1) {
			System.err.println("Illegal Argument");
			exit_code = -1;
		} else if (digit == 2) {
			System.out.println(result + " " + 1);
		} else {
			sqrt = mySqrt(digit) + 1;
			for (int i = 2; i <= sqrt; i++) {
				count++;
				if (digit % i == 0) {
					result = false;
					break ;
				}
			}
			System.out.println(result + " " + count);
		}
		System.exit(exit_code);
	}
	private static int mySqrt(int input) {
		long start = 1;
		long end = input;
		long ret = 0;
		long mid;

		while (start <= end) {
			mid = (start + end) / 2;
			if (mid * mid == input) {
				return ((int) mid);
			} else if (mid * mid < input) {
				start = mid + 1;
				ret = mid;
			} else {
				end = mid - 1;
			}
		}
		return (int) ret;
	}
}