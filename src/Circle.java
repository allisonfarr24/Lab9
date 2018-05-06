import java.text.NumberFormat;

//Alli Farr 05-06-2018 Lab 9

public class Circle {

	private double radius;
	private double circumference;
	private double area;
	private static int count = 0;

	public Circle(double radius) { 
		this.radius = radius;
		count++;

	}

	public double getCircumference() {
		this.circumference = 2 * Math.PI * radius;

		return circumference;

	}

	public String getFormattedCircumference() {

		return formatNumber(getCircumference());
	}

	public double getArea() {
		this.area = Math.PI * Math.pow(radius, 2);
		return area;

	}

	public String getFormattedArea() {
		return formatNumber(getArea());

	}

	private String formatNumber(double x) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String format = number.format(x);
		return format;

	}

	public static int getCount() {
		return count;
	}

}
