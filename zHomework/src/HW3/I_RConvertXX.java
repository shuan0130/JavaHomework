package HW3;
import java.util.Scanner;
public class I_RConvertXX {
	
	static String toBinary(int n) { //�G�i���j
		int func = (int)(n / 2);
		if(func == 0)
			return Integer.toString(n % 2);
		else
			return toBinary(n / 2)+(n % 2);
	}
	//static String toHexidecimal(int n) {
	//	int func = (int)(n / 16);
	//	if(func == 0) {
			
	//	}
			
	//}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("��J�@�Ʀr:");
		int n = num.nextInt();
	//	System.out.printf("�G�i��:%s%n �Q���i��:%s",toBinary(n),toHexidecimal(n));
		System.out.printf("�G�i��:%s",toBinary(n));
		num.close();
	}

}
