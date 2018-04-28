package HW6_1;

public class TopManager extends ManagerInfo{
	TopManager(String name, String startWorkDay, String address, String gender, String phoneNumber, double salary,
			double overtimeHour) {
		super(name, startWorkDay, address, gender, phoneNumber, salary, overtimeHour);
		duty();
	}
	public void duty() {
		setDutyAllowance(5000);
	}

}

