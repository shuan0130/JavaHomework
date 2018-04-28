package HW1;
//import java.util.*;

public class Refund {

	public static void main(String[] args) {
	/*	Scanner input = new Scanner(System.in);
		System.out.println("應付金額:");
		Scanner Payable = new Scanner(System.in);
		int APb = Payable.nextInt();
		System.out.println("實付金額:");
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
				System.out.println("金額不足");
			}else if(APd == APb) {
				System.out.println("剛剛好");
			}else {
			//	System.out.printf("找回%d張1000元,%d張500元,%d張100元,和%d50元,%d10元,%d5元,%d1元"
				//		,Thousand,FiveHun,Hun,FivT,Ten,Five,Dollar);
				System.out.println("找回"+Thousand+"張1000元,"+FiveHun+"張500元,"+Hun+"張100元,和"+FivT+"個50元,"+Ten+"個10元,"+Five+"個5元,"+Dollar+"個1元");
			}
		}
	}


