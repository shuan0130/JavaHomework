package HW3;
import java.util.Scanner;
public class C_IsPrime {
	
	static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i = 2; i < num; ++i){
			if(num % i == 0) { //�Y num ��㰣 2~num-1 �Ҧ��Ʀr �h��false�ø��X�j��
				isPrime = false;
				break;
			}
		}return isPrime;
	} 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:");
		int num = scanner.nextInt();
		scanner.close();
		System.out.print(isPrime(num) ? "�O���" : "�D���");
	}
}