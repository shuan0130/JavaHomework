package HW2;

public class F_Rope {

	public static void main(String[] args) {
		int day = 0,rope = 3000;
		while(rope >= 5){
			rope /= 2;
			day += 1;
		}if (rope < 5)
			System.out.println(day);
	}
}
