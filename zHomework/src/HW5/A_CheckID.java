package HW5;
import java.util.Scanner;

public class A_CheckID {
	
	static boolean isID(String id){
		String[] EngtoNum = {"10", "11", "12", "13", "14", "15", "16", "17", "34", "18", 
				"19", "20", "21", "22", "35", "23", "24", "25", "26", "27", 
				"28", "29", "32", "31", "32", "33"};
		int[] checkSumMultiplier = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
		id=id.toUpperCase();
		int idL = id.length();
		if(!Character.isLetter(id.charAt(0))) 
			System.out.println("��J���~!(�����ҲĤ@�Ӷ����^��r��)");
		else if(idL != 10)
			System.out.println("��J���~!(�����Ҷ���10�Ӧr��");
		else if(id.charAt(1) != '1' && id.charAt(1) != '2')
			System.out.println("�ʧO�X��J���~!");
		String TotalNum = EngtoNum[id.charAt(0)-'A']/*ASCII�X*/ + id.substring(1); 
		System.out.println(TotalNum);
		int checksum = 0;
		for(int i = 0; i < TotalNum.length();i++) {
			checksum += (TotalNum.charAt(i)-48) * checkSumMultiplier[i];//�NString TotalNum�ର�Q�i��Ʀr
			//System.out.println(TotalNum.charAt(i)+"*"+checkSumMultiplier[i]+"="+checksum);
		}
		if(checksum % 10 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��J�����Ҧr��(true/false):");
		String id = in.nextLine();
		System.out.println(isID(id));
		in.close();
	}

}
