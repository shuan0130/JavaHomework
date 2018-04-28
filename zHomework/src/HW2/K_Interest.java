package HW2;
//錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。(27年後)
public class K_Interest {	
	
	public static void main(String[] args) {
		int n = 1;
		double mon,count;
		while(n >= 1) {
			mon = 100000*(0.1*n+1);
			count = 100000*Math.pow(1+0.05, n);
			n++;
			if(count > mon){
				System.out.println("錢精打:" + (int)mon + ",好戲算:" + (int)count);
				break;
			}
		}
		System.out.println("test:" + 100000*Math.pow(1+0.05, 3));
	}
}
