public class Program {
	public static void main(String[] args) {
		int digit = 479598;
		int sum = 0;

		sum += digit%10;
		digit = digit/10;
		sum += digit%10;
		digit = digit/10;
		sum += digit%10;
		digit = digit/10;
		sum += digit%10;
		digit = digit/10;
		sum += digit%10;
		digit = digit/10;
		sum += digit%10;
		digit = digit/10;

		System.out.println(sum);
	}
}
