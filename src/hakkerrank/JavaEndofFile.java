package hakkerrank;

import java.util.Scanner;

public class JavaEndofFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(sc.hasNext()){
            i++;
            String s = sc.nextLine();
            System.out.println(i+" "+s);
        }
        sc.close();
        
    }
}
