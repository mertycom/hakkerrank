package hakkerrank;

import java.util.Scanner;

public class JavaOutputFormatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			int space = 15 - s1.length();
			System.out.print(s1);
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			if (x < 10) {
				System.out.print("00" + x);
			} else if (x < 100) {
				System.out.print("0" + x);
			} else {
				System.out.print(x);
			}
			System.out.println();

		}
		System.out.println("================================");
		sc.close();

	}
}
