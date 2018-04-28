package HW6_1;

public abstract class BasicInfo {
	private String name, startWorkDay, address, gender, phoneNumber;
	private double salary, overtimeHour, paySalary;
	

	public double getPaySalary() {
		return paySalary;
	}
	public void setPaySalary(double paySalary) {
		this.paySalary = paySalary;
	}
	BasicInfo(String name,String startWorkDay,String address,String gender,String phoneNumber,double salary,double overtimeHour){
		this.name = name;
		this.startWorkDay = startWorkDay;
		this.address = address;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.overtimeHour = overtimeHour;
	}
	public void display() {
		System.out.println("姓名:" + name);
		System.out.println("到職日:" + startWorkDay);
		System.out.println("地址:" + address);
		System.out.println("住址:" + gender);
		System.out.println("電話:" + phoneNumber);
		System.out.println("薪資:" + (int)salary);
		System.out.println("加班時數:" + overtimeHour);
		System.out.println("===================");
	}
	public double paySalary() {
		paySalary = salary + ((salary/240)*1.5*overtimeHour);
		return paySalary;
	}
	
	
}
