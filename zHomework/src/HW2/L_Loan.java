package HW2;
//������H100000�����O�V�Ȧ�B��Q�M�a�U�����ɶU�C�Y�Ȧ檺�~�Q�v��20%�A��Q��Q�v��10%�M�a�U������Q�v��1%�C�H�묰���A�p��@�Ӥ��ܤ@�~��C�Ӥ���k�٦h�ֿ��C
public class L_Loan { 
	
	static void interest() {
		int i;		
		for(i = 1;i <= 12; i++) {
		int bankint =(int)Math.round(100000*(1+(0.2/12)*i)-100000);
		int pawnint = (int)Math.round(100000*Math.pow(1.1, i)-100000);
		int underbint = (int)Math.round(100000*(Math.pow(1.3, i)));
		int sum = bankint + pawnint + underbint;
		System.out.printf(" %2d �Ӥ붷��: %,d \t,�Ȧ�: %,d \t,��Q: %,d \t,�a�U�Ȧ�: %,d \n",i ,sum,bankint,pawnint,underbint);
		}		
	}
	
	public static void main(String[] args) {
		
		interest();
		
	}

}
