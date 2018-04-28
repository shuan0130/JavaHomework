package HW6_2;

public interface Shape {
	public void computeArea();
	public void computeCircumference();


	public static void main(String[] args) {
		Shape c = new Circle();
		Shape r = new Rectangle();
		c.computeCircumference();
		c.computeArea();
		r.computeCircumference();
		r.computeArea();
	}
}