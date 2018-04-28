package HW3;//寫一遞迴函數int factorial (int n)用來計算1*2*3*…*n的值。
import java.util.Scanner;

public class F_Factorial {

	static int factorial(int n) {
		if(n==1)
			return 1;
		 else {
			 return n*factorial(n-1);
			}
			
		 }
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("請輸入數字:");
		int n = num.nextInt();
		num.close();
		System.out.println("ans:" + factorial(n));
	}
}
