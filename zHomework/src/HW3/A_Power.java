package HW3;

import java.util.Scanner;

public class A_Power {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("請輸入數字:");
		int x = num.nextInt();
		System.out.println("請輸入次方:");
		int n = num.nextInt();
		double ans = Math.pow(x, n);
		System.out.printf("%d的%d次方為%d",x,n,(int)ans);
		num.close();

	}

}
