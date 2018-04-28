package HW1;

public class Salary {

	public static void main(String[] args) {
		int PerHr = 70;
		double PS1 = PerHr * 120;
		double PS2 = 60 * 120 + ((PerHr - 60) * 120 * 1.25);
		double PS3 = 60 * 120 + (20 * 120 * 1.25) + ((PerHr - 80) * 1.5);
			if(PerHr > 0) 
			{
				if(PerHr <= 60) {
					System.out.println("薪資為:" + PS1);
				}else if(PerHr > 60 && PerHr <= 80) {
					System.out.println("薪資為:" + PS2);
				}else {
					System.out.println("薪資為:" + PS3);
				}
		}else {
			System.out.println("沒工作沒錢");
		}
	}

}


