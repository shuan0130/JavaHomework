package HW1;
//import java.util.*;

public class Refund {

	public static void main(String[] args) {
	/*	Scanner input = new Scanner(System.in);
		System.out.println("���I���B:");
		Scanner Payable = new Scanner(System.in);
		int APb = Payable.nextInt();
		System.out.println("��I���B:");
		Scanner Paid = new Scanner(System.in);
		int APd = Paid.nextInt(); */
		int APd = 1451;
		int APb = 140;
		int rest = APd - APb;
		int Thousand = rest / 1000;
		int FiveHun = (rest%1000) / 500;
		int Hun = (rest%500) / 100;
		int FivT = (rest%100) / 50;
		int Ten = (rest%50) / 10;
		int Five = (rest%10) / 5;
		int Dollar = (rest%5) / 1;
			if(APd < APb) {
				System.out.println("���B����");
			}else if(APd == APb) {
				System.out.println("���n");
			}else {
			//	System.out.printf("��^%d�i1000��,%d�i500��,%d�i100��,�M%d50��,%d10��,%d5��,%d1��"
				//		,Thousand,FiveHun,Hun,FivT,Ten,Five,Dollar);
				System.out.println("��^"+Thousand+"�i1000��,"+FiveHun+"�i500��,"+Hun+"�i100��,�M"+FivT+"��50��,"+Ten+"��10��,"+Five+"��5��,"+Dollar+"��1��");
			}
		}
	}


