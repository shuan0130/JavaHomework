package HW2;

public class C_PerfactNumber {

	public static void main(String[] args) {

		int i, j;
		for(i = 1; i <= 100; i++) {
			int sum = 0;
			for(j = 1; j < i; j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			if(i == sum)
				System.out.println(i);
		}
	}
}