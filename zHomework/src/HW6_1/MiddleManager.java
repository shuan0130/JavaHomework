package HW6_1;

public class MiddleManager extends ManagerInfo{
	
	MiddleManager(String name, String startWorkDay, String address, String gender, String phoneNumber, double salary,
			double overtimeHour) {
		super(name, startWorkDay, address, gender, phoneNumber, salary, overtimeHour);
		duty();
	}


	public void display() {
		super.display();
	}
	public void duty() {
		setDutyAllowance(3000);
	}


	
}
