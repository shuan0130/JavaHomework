package HW4;
public class A_MaxMin {
	
	static void all(int[] num) {		//ㄓ睹计
		for(int i = 0;i < num.length; i++) {
			
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		int[] num = new int[10];			// 玻ネ10皚丁
		for(int j = 0;j < num.length; j++) { // 睹计眖50计柑10
			num[j] = (int)(Math.random()*50+1);
		}
		int max = num[0];	//砞﹚材程
		int min = num[0];	//砞﹚材程
		
		for(int i = 0;i < num.length; i++) { //程程			
			if(num[i] > max)
				max = num[i];
			if(num[i] < min)
				min = num[i];
		}
		System.out.println("MAX:"+ max);
		System.out.println("MIN:"+ min);
		all(num);
	}
}

