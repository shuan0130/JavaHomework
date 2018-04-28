package HW2;
import java.util.Scanner;
public class E_Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:");
		int num = scanner.nextInt();
		scanner.close();
		for(int i = 2; i <= num; i++){ //取 2~num 之間的所有數字
			boolean isPrime = true;
			for(int j = 2;j < i; j++) { 
				if(i % j == 0) { //若 i 被 2~i-1 之間的數整除則非質數
				isPrime = false;
				break;
				}
			}
			if (isPrime)
			System.out.print(i + " ");
		}
	}
}
