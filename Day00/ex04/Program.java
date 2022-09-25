import java.util.*;

public class Program {

	public static int[] arrNum = new int[10];
	public static char[] arrChar = new char[10];

	public static void printNum(int num, String sp1, String sp2) {
		if (num != 0) {
			String sp = (num < 10) ? sp1 : sp2;
			System.out.print(sp + num);
		}
		else {
			System.out.print("");
		}
	}

	public static void printDiagram() {
		int j;
		int[] persArr = new int[10];
		for (int i = 0; i < 10; i++)
			persArr[i] = arrNum[i] * 10 / arrNum[0];
		printNum(arrNum[0], " ", "");
		for (int l = 0; l < 10; l++) {
			if ((l + 1) < persArr.length && persArr[l] == persArr[l + 1]) {
				printNum(arrNum[l + 1], "   ", "  ");
			}
			else {
				System.out.println();
				for (int i = persArr[l]; (l + 1) < persArr.length &&
						i > persArr[l + 1] || i == persArr.length; i--) {
					j = l;
					if (i > persArr[l + 1] || i == persArr.length) {
						for (j = l; j >= 0; j--) {
							System.out.print(" #  ");
						}
					}
					if ((l + 1) < persArr.length && i - 1 == persArr[l + 1]) {
						printNum(arrNum[l + 1], " ", "");
					}
					else {
						System.out.println();
					}
				}
			}
		}
		for (int i = 0; i < arrChar.length; i++)
			System.out.print(" " + arrChar[i] + "  ");
		System.out.println();
	}

	public static void getArray(short[] uniqArr, char[] str) {
		int     i, j;
		short   tmpSh;
		char    tmpCh;
		for (i = 0; i < uniqArr.length; i++) {
			j = 0;
			for (j = 0; j < uniqArr.length; j++) {
				if ((j + 1) != uniqArr.length && uniqArr[j] < uniqArr[j + 1]) {
					tmpSh = uniqArr[j];
					uniqArr[j] = uniqArr[j + 1];
					uniqArr[j + 1] = tmpSh;
					tmpCh = str[j];
					str[j] = str[j + 1];
					str[j + 1] = tmpCh;
				}
			}
		}
		i = 0;
		while (i < arrNum.length && i < uniqArr.length) {
			arrNum[i] = uniqArr[i];
			arrChar[i] = str[i];
			i++;
		}
	}

	public static void getTop(short[] uniqChar, int len) {
		short[] uniqArr = new short[len];
		char[]  str = new char[len];
		int     j = 0;
		for (int i = 0; i < uniqChar.length; i++) {
			if (uniqChar[i] > 0) {
				uniqArr[j] = uniqChar[i];
				str[j] = (char)i;
				j++;
			}
		}
		getArray(uniqArr, str);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[]  str = scanner.nextLine().toCharArray();
		if (str.length > 0) {
			short[] uniqChar = new short[65535];
			for (int i = 0; i < str.length; i++) {
				uniqChar[str[i]]++;
			}
			getTop(uniqChar, str.length);
			printDiagram();
		}
	}
}
