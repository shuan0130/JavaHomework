package HW2;
import java.util.Scanner;
public class H_Password {
	
	static void pass1() {
		Scanner num = new Scanner(System.in);
		int code = 123;
		for(int i = 0;i < 3;i++){
			System.out.println("�п�J�K�X:");
	 		int n = num.nextInt();
		 		if(n == code){
		 			System.out.println("�K�X���T");
		 			break;
		 		}
		 		if(i == 2)
		 			System.out.println("�K�X���~�T��");
	 		}
		num.close();
	 	}
	
	static void pass2() {
		Scanner num = new Scanner(System.in);
		int code = 123;
		int count = 0;
			do {
				System.out.println("�п�J�K�X:");
				int n = num.nextInt();		
				if(n != code && count < 2) 
					System.out.println("�K�X���~");
				if(count == 2)
					System.out.println("�K�X���T��");
				if(n == code){
					System.out.println("���T");
					break;
					}
				count ++;
				}
			while(count < 3);
		num.close();
	}	

	public static void main(String[] args) {
		/*Scanner num = new Scanner(System.in);
		int code = 123;
			A:for(int i = 0;i < 3;i++) {
				System.out.println("�п�J�K�X:");
				int n = num.nextInt();
				if(n != code && i < 2) {
					System.out.println("�K�X���~");
				}
				else if (n != code && i == 2) {
					System.out.println("�K�X���~�T��");
				}
				else {
					System.out.print("�K�X���T");
					break A;
				}
			}
			num.close();*/
		pass2();
	}
}
