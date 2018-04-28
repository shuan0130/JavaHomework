package HW3;
import java.util.Scanner;
public class B_Sigma2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("請輸入數字:");
		int x = num.nextInt();
		System.out.println("請輸入次方:");
		int n = num.nextInt();
		float result = 1;
		float sigma = 0;
		for (int i = 1;i <= n;i++) { 
			 result *= i; // 階層
			 double ans = Math.pow(x, i);//次方
			 sigma += (ans/result);
		//	 System.out.println("result:" + result);
		//	 System.out.println("ans:" + ans);
		//	 System.out.println("sigma:" + sigma);
		}
		System.out.println("sigma:" + sigma);
		num.close();
	}

}
