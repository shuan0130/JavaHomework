package HW1;

public class Season {

	public static void main(String[] args) {
			int month = 13;
			int mon = (month / 3) % 4;
			if (month > 0 && month <= 12) { 
			switch(mon) {
				case 0:System.out.println(month + "月為冬天");
					break;
				case 1:System.out.println(month + "月為春天");
					break;
				case 2:System.out.println(month + "月為夏天");
					break;
				case 3:System.out.println(month + "月為秋天");
				}
			}else
				System.out.println("fuck you");
		}
	}
