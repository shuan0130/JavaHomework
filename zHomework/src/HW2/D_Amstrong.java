package HW2;

public class D_Amstrong {

	public static void main(String[] args) {
		
		for(int i = 1;i < 1000; i++) {
			int hun = i / 100;
			int ten = (i % 100) / 10;
			int dig = i % 10;
			double sum = Math.pow(hun, 3)+Math.pow(ten, 3)+Math.pow(dig, 3);
			int sum2 = (int)sum;
			if(i == sum2)
				System.out.println(i);
		}
	}

}
