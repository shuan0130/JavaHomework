package HW4;
import java.util.Scanner; 
public class C_Rain {
	
	static float all(float[][][] rain) {
		int i=0,j=0,k=0;
		float sum = 0, avgall;
		for(i=0;i<5;i++) 
			for(j=0;j<4;j++)
				for(k=0;k<3;k++)
		sum += rain[i][j][k];
		avgall = sum / 60;
		System.out.println("總量:" + sum);
		return avgall;
	}

	public static void main(String[] args) {
		float[][][] rain = new float[5][4][3];
		int i=0,j=0,k=0;
		//float sum = 0, avgall, avgyear, avgmon;
		
		for(i=0;i<5;i++) {
			for(j=0;j<4;j++) {
				for(k=0;k<3;k++) {
				rain[i][j][k] = (float)Math.random()*20;
					System.out.print("["+i+"]["+j+"]["+k+"]="+rain[i][j][k]+"\n");
				
				}
			}
		}
		
		Scanner enter = new Scanner(System.in);
		Scanner enter1 = new Scanner(System.in);
		System.out.println("ENTER:");
		String key = enter.next();
		
		if(key.equals("all"))
			System.out.println("五年全平均降雨量" + all(rain));
		
		/*	if(key.equals("all")) {		//60個月平均降雨量
				for(i=0;i<5;i++) 
					for(j=0;j<4;j++)
						for(k=0;k<3;k++)
				sum += rain[i][j][k];
				avgall = sum / raintotal;
				System.out.println(sum);
				System.out.println(raintotal);
				System.out.println(avgall);
			}
			
			if(key.equals("year")) {	//年平均降雨量
				System.out.println("輸入年份:");
				int keynum = enter1.nextInt();
					switch(keynum) {
					case 1:
						for(j = 0;j < 4; j++)
							for(k = 0;k < 3; k++)
						sum += rain[0][j][k];
						avgyear = sum / 12;
						System.out.println(avgyear);break;
					case 2:
						for(j = 0;j < 4; j++)
							for(k = 0;k < 3; k++)
						sum += rain[1][j][k];
						avgyear = sum / 12;
						System.out.println(avgyear);break;
					case 3:
						for(j = 0;j < 4; j++)
							for(k = 0;k < 3; k++)
						sum += rain[2][j][k];
						avgyear = sum / 12;
						System.out.println(avgyear);break;
					case 4:
						for(j = 0;j < 4; j++)
							for(k = 0;k < 3; k++)
						sum += rain[3][j][k];
						avgyear = sum / 12;
						System.out.println(avgyear);break;
					case 5:
						for(j = 0;j < 4; j++)
							for(k = 0;k < 3; k++)
						sum += rain[4][j][k];
						avgyear = sum / 12;
						System.out.println(avgyear);break;
					default:System.out.println("輸入錯誤");
					}	 
			}*/
		
		enter.close();
		enter1.close();
	}
}


