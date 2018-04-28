package HW6_2;

public class Circle implements Shape{
	
	private final double pi = Math.PI;
	private int radius = (int)(Math.random()*10);
	private double ans;
	
	public void computeCircumference() {
		ans = radius * pi;
		System.out.println("¥b®|:" + radius);
		System.out.printf("¶ê©Pªø:%1.2f%n", ans); 
	}

	public void computeArea() {
		ans = Math.pow(radius, 2)*pi; 
		System.out.printf("¶ê­±¿n:%1.2f%n", ans); 
	}
	
}
