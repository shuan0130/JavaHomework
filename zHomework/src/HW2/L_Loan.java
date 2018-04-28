package HW2;
//錢不精以100000元分別向銀行、當鋪和地下錢莊借貸。若銀行的年利率為20%，當鋪月利率為10%和地下錢莊日利率為1%。以月為單位，計算一個月後至一年後每個月該歸還多少錢。
public class L_Loan { 
	
	static void interest() {
		int i;		
		for(i = 1;i <= 12; i++) {
		int bankint =(int)Math.round(100000*(1+(0.2/12)*i)-100000);
		int pawnint = (int)Math.round(100000*Math.pow(1.1, i)-100000);
		int underbint = (int)Math.round(100000*(Math.pow(1.3, i)));
		int sum = bankint + pawnint + underbint;
		System.out.printf(" %2d 個月須還: %,d \t,銀行: %,d \t,當鋪: %,d \t,地下銀行: %,d \n",i ,sum,bankint,pawnint,underbint);
		}		
	}
	
	public static void main(String[] args) {
		
		interest();
		
	}

}
