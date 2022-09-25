import java.util.Scanner;
public class Program
{
	public static void main(String[] args) {
		String week;
		int grade;
		int min = 9;
		int count = 1;
		long result = 0;
		long tmp = 0;
		Scanner scan = new Scanner(System.in);
		while (count < 18) {
			week = scan.nextLine();
			if (week.equals("42")) {
				break ;
			}
			if (!week.equals("Week " + count)) {
				System.err.println("Illegal Argument");
				System.exit(-1);
			}
			for (int i = 0; i < 5; i++){
				grade = scan.nextInt();
				if (grade < 1 || grade > 9) {
					System.err.println("Illegal Argument");
					System.exit(-1);
				}
				if (grade < min) {
					min = grade;
				}
			}
			result = (result + min) * 10;
			min = 9;
			count++;
			week = scan.nextLine();
			if (!week.equals("")){
				System.err.println("Illegal Argument");
				System.exit(-1);
			}
		}
		int count2 = 1;
		while (count2 < count){
			tmp = result / pow(10, count - count2);
			System.out.print("Week " + count2 + " ");
			for(int i = 0; i < tmp; i++){
				System.out.print("=");
			}
			System.out.println(">");
			result = result - (pow(10, count - count2) * tmp);
			count2++;
		}
	}
	public static int pow(int value, int powValue) {
		int result = 1;
		for (int i = 1; i <= powValue; i++) {
			result = result * value;
		}
		return result;
	}
}