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
			System.out.println("輸入錯誤!(身分證第一個須為英文字母)");
		else if(idL != 10)
			System.out.println("輸入錯誤!(身分證須為10個字元");
		else if(id.charAt(1) != '1' && id.charAt(1) != '2')
			System.out.println("性別碼輸入錯誤!");
		String TotalNum = EngtoNum[id.charAt(0)-'A']/*ASCII碼*/ + id.substring(1); 
		System.out.println(TotalNum);
		int checksum = 0;
		for(int i = 0; i < TotalNum.length();i++) {
			checksum += (TotalNum.charAt(i)-48) * checkSumMultiplier[i];//將String TotalNum轉為十進位數字
			//System.out.println(TotalNum.charAt(i)+"*"+checkSumMultiplier[i]+"="+checksum);
		}
		if(checksum % 10 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("輸入身分證字號(true/false):");
		String id = in.nextLine();
		System.out.println(isID(id));
		in.close();
	}

}
