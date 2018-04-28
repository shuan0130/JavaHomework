package HW4;
import java.util.Scanner; 
public class C_Rain2 {
	
	static float all(float[][][] rain) {
		float sum = 0, avgall;
		for(float [][]i : rain)
			for(float []j : i)
				for(float k : j)
		sum += k;
		avgall = sum / 60;
		return avgall;
	}

	public static void main(String[] args) {
		float[][][] rain = new float[5][4][3];
		int i=0,j=0,k=0;
		float sum = 0;
		for(i=0;i<5;i++) {
			for(j=0;j<4;j++) {
				for(k=0;k<3;k++) {
				rain[i][j][k] = (float)Math.random()*20;
					System.out.print("["+i+"]["+j+"]["+k+"]="+rain[i][j][k]+"\n");
				}
			}
		}
		
		Scanner enter = new Scanner(System.in);
		System.out.println("ENTER:");
		String key = enter.next();
		
		if(key.equals("all"))
			System.out.println("五年全平均降雨量" + all(rain));
		if(key.equals("year")) {
			System.out.println("輸入年份:");
			int keynum = enter.nextInt();
			enter.close();
			if(keynum > 0 && keynum <= 5) {
				for(j = 0;j < 4; j++) {
					for(k = 0;k < 3; k++) {
						sum += rain[keynum-1][j][k];
						System.out.println(sum);
					}
				}
			}
		}
		
		if(key.equals("season")) {
			System.out.println("輸入年份:");
			int keynum = enter.nextInt();
			System.out.println("第幾季(1~4):");
			int keynum1 = enter.nextInt();
			enter.close();
			if(keynum > 0 && keynum <= 5) {
				if(keynum1 > 0 && keynum1 <= 4) {
					for(k = 0;k < 3; k++) {
			sum += rain[keynum-1][keynum1-1][k];
			System.out.println(sum);
					}
				}
			}	
		}
		
		if(key.equals("month")) {
			System.out.println("輸入年份:");
			int keynum = enter.nextInt();
			System.out.println("第幾月:");
			int keynum2 = enter.nextInt();
			enter.close();
			if(keynum > 0 && keynum <= 5) {
					if(keynum2 > 0 && keynum2 <= 12) {
						int x = keynum2 / 4;
						int y = keynum2 % 3;
						System.out.println(rain[keynum-1][x][y-1]);
					}else System.out.println("輸入錯誤");
				
			}else System.out.println("輸入錯誤");	
		}
		enter.close();
	}
}


