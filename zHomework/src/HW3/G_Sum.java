package HW3; //寫一遞迴函數int sum (int n)用來計算2+4+6…+2n的值。
import java.util.Scanner;
public class G_Sum {

	static int sum(int n) {
		if(n == 0)
			return 0;
		else {
			return n+sum(n-2);
			}
		}
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("輸入雙數:");
		int n = num.nextInt();
		sum(n);
		num.close();
		System.out.println("總和:"+ sum(n));
	}
	
}
