package HW3;//�g�@���j���int factorial (int n)�Ψӭp��1*2*3*�K*n���ȡC
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
		System.out.println("�п�J�Ʀr:");
		int n = num.nextInt();
		num.close();
		System.out.println("ans:" + factorial(n));
	}
}
