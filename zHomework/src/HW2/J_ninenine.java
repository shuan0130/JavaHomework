package HW2;

public class J_ninenine {

	public static void main(String[] args) {
		System.out.print("  | ");
		for(int k = 1;k <= 9;k++)
		System.out.printf("%-3d", k);
		System.out.print("\n-------------------------------");
		for(int i = 9; i >= 1; i--) {
			System.out.printf("\n%d | ", i);
			for(int j = 1;j <= i; j++) {
				System.out.printf("%-3d", i*j);
			}
			System.out.print("\n");
		}
	}
}
