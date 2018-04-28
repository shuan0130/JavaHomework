package HW2;
import java.util.Scanner;
public class B_Factor {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:");
		int num = scanner.nextInt();
		for(int i = 1; i <= num; i++) {
			if(num % i == 0)
				System.out.print(i+ " ");
			else continue;
		}
		scanner.close();
	}
}