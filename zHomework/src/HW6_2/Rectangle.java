package HW6_2;

public class Rectangle implements Shape {
	private int length = (int) (Math.random()*10) + 10;
	private int width = (int) (Math.random()*10) + 1;
	private double ans;
	
	public void computeCircumference() {
		ans = (length + width) * 2;
		System.out.println("長:" + length + "寬:" + width);
		System.out.println("長方形周長:" + ans);
	}

	@Override
	public void computeArea() {
		ans = length * width;
		System.out.println("長方形面積:" + ans);
		
	}
	
	
	
}
