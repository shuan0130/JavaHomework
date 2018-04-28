package HW6_1;

public class AccountMain {

	private static final int i = 6;

	public static void main(String[] args) {
		
		BasicInfo[] s = new BasicInfo[i];
		s[0] = new Staff("A", "2016-02-08", "中央路121號", "男", "0911111111", 22000, 0);
		s[1] = new Staff("B", "2016-02-08", "中央路121號", "男", "0911111111", 22000, 50);
		s[2] = new MiddleManager("C","2012-01-02","中央路123號","女","0933333333", 55000, 0);
		s[3] = new MiddleManager("D","2012-01-02","中央路123號","女","0933333333", 55000, 30);
		s[4] = new TopManager("E","2000-10-02","中央路125號","男","095555555", 80000, 0);
		s[5] = new TopManager("F","2000-10-02","中央路125號","男","095555555", 80000, 20);
		for(int i = 0;i < s.length; i++) {
			s[i].display();
			s[i].paySalary();
		}
		
	}

}
