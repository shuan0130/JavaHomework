package HW1;

public class Season {

	public static void main(String[] args) {
			int month = 13;
			int mon = (month / 3) % 4;
			if (month > 0 && month <= 12) { 
			switch(mon) {
				case 0:System.out.println(month + "�묰�V��");
					break;
				case 1:System.out.println(month + "�묰�K��");
					break;
				case 2:System.out.println(month + "�묰�L��");
					break;
				case 3:System.out.println(month + "�묰���");
				}
			}else
				System.out.println("fuck you");
		}
	}
