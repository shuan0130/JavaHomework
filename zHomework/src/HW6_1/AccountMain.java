package HW6_1;

public class AccountMain {

	private static final int i = 6;

	public static void main(String[] args) {
		
		BasicInfo[] s = new BasicInfo[i];
		s[0] = new Staff("A", "2016-02-08", "������121��", "�k", "0911111111", 22000, 0);
		s[1] = new Staff("B", "2016-02-08", "������121��", "�k", "0911111111", 22000, 50);
		s[2] = new MiddleManager("C","2012-01-02","������123��","�k","0933333333", 55000, 0);
		s[3] = new MiddleManager("D","2012-01-02","������123��","�k","0933333333", 55000, 30);
		s[4] = new TopManager("E","2000-10-02","������125��","�k","095555555", 80000, 0);
		s[5] = new TopManager("F","2000-10-02","������125��","�k","095555555", 80000, 20);
		for(int i = 0;i < s.length; i++) {
			s[i].display();
			s[i].paySalary();
		}
		
	}

}
