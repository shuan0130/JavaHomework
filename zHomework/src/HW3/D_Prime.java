package HW3;
import java.util.Scanner;
public class D_Prime {
	
	//static int prime(int count) {
		
	//}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:");
		int num = scanner.nextInt();
		scanner.close();
		int count = 0;
		while(count < num) {
			int i;
			for(i = 2; i <= i; i++){ //�� 2~�Ҧ��Ʀr
				boolean isPrime = true;
				for(int j = 2;j < i; j++) { 
					if(i % j == 0) { //�Y i �Q 2~i-1 �������ƾ㰣�h�D���
					isPrime = false;
					break;
					}
					
				}
				if(isPrime)
					count++;
				if(count == num)
					break;
			}System.out.printf("��%d�ӽ�Ƭ�%d",num, i);	
			
		}
	}
}
