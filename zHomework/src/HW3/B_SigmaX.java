package HW3;
import java.util.Scanner;

public class B_SigmaX {
	
	private static int sigma;
	static int factorial(int n) { //n!
		int result = 1;
		for (int i = 1;i <= n; i++) { 
			 result *= i; 
			 System.out.println("階層:" + result);
		}return result;
	}
	
	static int power(int x,int n) {// x的n次方
		double result = 0;
		for(int i = 1; i <= n; i++) {
		result = Math.pow(x, i);
		System.out.println("次方:" + result);
		}
		return (int)result;
	}
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("輸入x值:");
		int x = num.nextInt();
		System.out.println("輸入n值:");
		int n = num.nextInt();
		setSigma(1);
		for(int i = 1;i <= n; i++) {
		double cul = power(x,n)/factorial(n);
		setSigma(getSigma() + cul);
		System.out.println(cul);
		}
		//System.out.println(sigma);
		//System.out.println(power(x, n));
		//System.out.println(factorial(n));
		num.close();
	}

	public static int getSigma() {
		return sigma;
	}

	public static void setSigma(double d) {
		B_SigmaX.sigma = (int) d;
	}

}
