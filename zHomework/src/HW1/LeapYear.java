package HW1;

public class LeapYear {

	public static void main(String[] args) {
		java.util.Scanner type = new java.util.Scanner(System.in); 
		System.out.println("��J�~��:");
		int Year = type.nextInt();
		type.close();
		if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
		System.out.println("�|�~");
		}else {
			System.out.println("���~");
		}
	}
}
