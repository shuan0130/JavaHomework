package HW3;
import java.util.Scanner;

public class H_Covert {
	
	static void toB(int n) {
		int z;
		String ans = ""; 
		while(n / 2 >= 1) {
			z = n % 2;
			n = n / 2;
			ans = z + ans;
			if(n / 2 < 1)
				ans = n + ans;
		}
		System.out.println("二進制:" + ans);
	}
	
	static void toH(int n) {
		int z;
		String ans = "";
		String transEng = "ABCDEF";
		while(n / 16 >= 1) {
			z = n % 16;
			n = n / 16;
			if(z >= 10 && z < 16)
				ans = transEng.charAt(z%10) + ans;
			else if(z < 10)
				ans = z + ans;
			if(n >= 10 && n < 16)
				ans = transEng.charAt(n%10) + ans;
			else if(n < 10)
				ans = n + ans;
		}
		System.out.println("十六進制:" + ans);
	}
 
	public static void main(String[] args) {
		Scanner keynum =new Scanner (System.in); 
		System.out.println("輸入:");
		int n = keynum.nextInt(); 
		toB(n);
		toH(n);
		keynum.close();
	}
}
