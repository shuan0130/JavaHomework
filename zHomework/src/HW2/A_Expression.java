package HW2;

public class A_Expression {

	public static void main(String[] args) {
		int sum = 0,sum2 = 0;
		for(int i = 0;i <= 50; i++) {
				if(i % 2 != 0)
				sum += i*i;
				}
			for(int j = 0;j<=50;j++) {
				if(j % 2 == 0)
					sum2 += j*j;
			}
		
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum - sum2);
	}
}