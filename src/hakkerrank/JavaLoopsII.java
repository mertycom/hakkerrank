package hakkerrank;

import java.util.Scanner;

public class JavaLoopsII {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            doCalc(a,b,n);
            System.out.println();
        }
        in.close();
    }
    
    public static void doCalc(int a,int b,int n){
        int sum = a;
        for (int i=0;i<n;i++){  
            int next = (int) Math.pow(2, i)*b;
            sum = sum + next;
            System.out.printf("%s ",sum);
        }
    }
}
