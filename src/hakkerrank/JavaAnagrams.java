package hakkerrank;


import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
	
	static boolean isAnagram(String a, String b) {
		if (a.length()==b.length()) {
			char[] firstStr = a.toLowerCase().toCharArray();
			char[] secondStr = b.toLowerCase().toCharArray();
			Arrays.sort(firstStr);
			Arrays.sort(secondStr);
			return Arrays.equals(firstStr, secondStr);
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
