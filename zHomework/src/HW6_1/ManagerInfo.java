package HW6_1;

public abstract class ManagerInfo extends BasicInfo {
	private double lunchAllowance;
	private double dutyAllowance;
	private double trafficAllowance;
	private double managerPay;
	private double totalAllowance;
	ManagerInfo(String name, String startWorkDay, String address, String gender, String phoneNumber, double salary,
			double overtimeHour) {
		super(name, startWorkDay, address, gender, phoneNumber, salary, overtimeHour);
	}
	
	public double paySalary() {
		managerPay = super.paySalary() + welFare() + getDutyAllowance();
		System.out.println("∑Ì§Î¡~∏Í:" + Math.round(managerPay));
		System.out.println("===================");
		return managerPay;
	}
	
	public double welFare() {
		lunchAllowance = 1800;
		trafficAllowance = 2000;
		totalAllowance = lunchAllowance + trafficAllowance;
		return totalAllowance;
	}
	
	public double getDutyAllowance() {
		return dutyAllowance;
	}
	public void setDutyAllowance(double dutyAllowance) {
		this.dutyAllowance = dutyAllowance;
	}
}
