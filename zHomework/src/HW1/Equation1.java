package HW1;

public class Equation1 {

	public static void main(String[] args) {
		int a=2, b=5, c=3;
		double Equat = b*b - 4*a*c;
		double ans_1 = (-b + Math.sqrt(Equat)) / 2*a;
		double ans_2 = (-b - Math.sqrt(Equat)) / 2*a;
		if (Equat > 0) {
			System.out.printf("x = %4.2f, %4.2f", ans_1, ans_2);
		}else if (Equat == 0) {
			System.out.printf("x = %4.2f, %4.2f",ans_1, ans_2);
		}else {
			System.out.println("¨S¦³¹ê®Ú");
		}
	}
}
