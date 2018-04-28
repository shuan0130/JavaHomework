package HW4;

public class D_PassArray {
	
	static void a(int[][] four) {
		double sum = 0, count = 0;
		for(int i = 0;i < four.length;i++) { 
			for(int j = 0;j < four[i].length;j++) { 
			sum += four[i][j];
			count ++;
			}
		}
		double avg = sum / count;
	//	System.out.print("a總和:" + sum + "\t");
		System.out.println("a.平均:" + avg);
	}
	
	static void b(int[][] four) {
		int max = four[0][0];
		for(int i = 0;i < four.length; i++)
			for(int j = 0;j < four[i].length; j++)
				if(four[i][j] > max)
					max = four[i][j];
		System.out.println("b.Max:" + max);
	}
	
	static void c(int[][] four) {
		int min = four[0][0];
		for(int i = 0;i < four.length; i++)
			for(int j = 0;j < four[i].length; j++)
				if(four[i][j] < min)
					min = four[i][j];
		System.out.println("c.Min:" + min);
	}
	
	static void d(int[][] four) {
		double sum[] = new double[four.length];
		int count = 0;
		double avg = 0;
		for(int i = 0;i < four.length; i++) {
			sum[i] = 0;
			for(int j = 0;j < four[i].length; j++) {
				sum[i] += four[i][j];
				count ++;
			}
				avg = sum[i] / count;
				System.out.println("d.第" + (i+1) + "組加總:" + (int)sum[i]);
				System.out.println("d.平均:" + avg);
			
			
		}
	}

	public static void main(String[] args) {
		int[][] four = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		a(four);
		b(four);
		c(four);
		d(four);
	}

}
