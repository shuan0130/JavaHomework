package HW1;
import javax.swing.*;
public class Electricity {

	public static void main(String[] args) {
		int Kwh;
		String Num;
		Num = JOptionPane.showInputDialog("��J�׼�:");
		Kwh = Integer.parseInt(Num);
		double	Industry_D = Kwh*0.45;
		double Home_D;
	//	double d_1 = 240 * 0.15;
	//	double d_2 = (Kwh - 240) * 0.25;
	//	double d_3 = (Kwh - 540) * 0.45;
		if(Kwh > 0 && Kwh <= 240) {
			Home_D = Kwh * 0.15;
		}
		else if(Kwh > 240 && Kwh <= 540) {
			//Home_D = d_1 + d_2;
			  Home_D = 240 * 0.15 + (Kwh - 240) * 0.25;
		}
		else{
			//Home_D = d_1 + d_2 + d_3;
			  Home_D = 240 * 0.15 + (Kwh - 240) * 0.25 + (Kwh - 540) * 0.45;
		}	
		System.out.printf("�w�Ϋ׼�:" + Kwh + "\t�a�ιq�O:" + Home_D );
		System.out.printf("\n�w�Ϋ׼�:" + Kwh + "\t�u�~�q�O:" + Industry_D);
	}
}
