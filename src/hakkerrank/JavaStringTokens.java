package hakkerrank;
import java.util.Scanner;

public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		String[] tokens = s.split("['? _.@,]");
		int numTokens = 0;
        
        for (int i=0; i<tokens.length; ++i) 
            if (tokens[i].length() > 0) 
                numTokens++;
            
        System.out.println(numTokens);
       
        for (int i=0; i<tokens.length;++i)
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
		
		scan.close();
	}
}
