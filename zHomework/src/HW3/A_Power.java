package HW3;

import java.util.Scanner;

public class A_Power {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("�п�J�Ʀr:");
		int x = num.nextInt();
		System.out.println("�п�J����:");
		int n = num.nextInt();
		double ans = Math.pow(x, n);
		System.out.printf("%d��%d���謰%d",x,n,(int)ans);
		num.close();

	}

}
