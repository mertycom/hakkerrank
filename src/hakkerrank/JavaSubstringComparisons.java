package hakkerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		int length = s.length();
		List<String> sub = new ArrayList<>();
		for (int i = 0; i < length - k + 1; i++) {
			sub.add(s.substring(i, k + i));
		}
		Collections.sort(sub);
		smallest = sub.get(0);
		largest = sub.get(sub.size() - 1);

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
