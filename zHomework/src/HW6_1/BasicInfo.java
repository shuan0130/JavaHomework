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
		System.out.println("�m�W:" + name);
		System.out.println("��¾��:" + startWorkDay);
		System.out.println("�a�}:" + address);
		System.out.println("��}:" + gender);
		System.out.println("�q��:" + phoneNumber);
		System.out.println("�~��:" + (int)salary);
		System.out.println("�[�Z�ɼ�:" + overtimeHour);
		System.out.println("===================");
	}
	public double paySalary() {
		paySalary = salary + ((salary/240)*1.5*overtimeHour);
		return paySalary;
	}
	
	
}
