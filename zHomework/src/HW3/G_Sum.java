package HW3; //�g�@���j���int sum (int n)�Ψӭp��2+4+6�K+2n���ȡC
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
		System.out.println("��J����:");
		int n = num.nextInt();
		sum(n);
		num.close();
		System.out.println("�`�M:"+ sum(n));
	}
	
}
