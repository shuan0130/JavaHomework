package HW3;
import java.util.Scanner;
public class B_Sigma2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("�п�J�Ʀr:");
		int x = num.nextInt();
		System.out.println("�п�J����:");
		int n = num.nextInt();
		float result = 1;
		float sigma = 0;
		for (int i = 1;i <= n;i++) { 
			 result *= i; // ���h
			 double ans = Math.pow(x, i);//����
			 sigma += (ans/result);
		//	 System.out.println("result:" + result);
		//	 System.out.println("ans:" + ans);
		//	 System.out.println("sigma:" + sigma);
		}
		System.out.println("sigma:" + sigma);
		num.close();
	}

}
