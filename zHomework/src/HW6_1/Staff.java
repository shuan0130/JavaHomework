package HW6_1;

public class Staff extends BasicInfo{

	Staff(String name, String startWorkDay, String address, String gender, String phoneNumber, double salary,
			double overtimeHour) {
		super(name, startWorkDay, address, gender, phoneNumber, salary, overtimeHour);
	}
	
	public double paySalary() {
		double monthPay = super.paySalary();
		System.out.println("∑Ì§Î¡~∏Í:" + Math.round(monthPay));
		System.out.println("===================");
		return getPaySalary();
	}

}
