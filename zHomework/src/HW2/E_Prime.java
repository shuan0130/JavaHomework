package HW2;
import java.util.Scanner;
public class E_Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:");
		int num = scanner.nextInt();
		scanner.close();
		for(int i = 2; i <= num; i++){ //�� 2~num �������Ҧ��Ʀr
			boolean isPrime = true;
			for(int j = 2;j < i; j++) { 
				if(i % j == 0) { //�Y i �Q 2~i-1 �������ƾ㰣�h�D���
				isPrime = false;
				break;
				}
			}
			if (isPrime)
			System.out.print(i + " ");
		}
	}
}
