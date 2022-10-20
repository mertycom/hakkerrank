package hakkerrank;

import java.util.Scanner;

public class JavaStringReverse {
	public static void main(String[] args) {
		String reverseA = "";
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();

		int length = A.length();

		for (int i = length - 1; i >= 0; i--)
			reverseA = reverseA + A.charAt(i);
		if (A.equals(reverseA)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
