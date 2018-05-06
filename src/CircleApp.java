import java.util.Scanner;

// Alli Farr 05-06-2018 Lab 9

public class CircleApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cont = "y";
		double radius;

		System.out.println("Welcome to the circle tester!");

		while (cont.equalsIgnoreCase("y")) {

			radius = Validator.getDouble(scan, "Please enter radius: ");

			Circle circle = new Circle(radius);

			System.out.println("Circumference: " + circle.getFormattedCircumference());

			System.out.println("Area: " + circle.getFormattedArea());

			System.out.println("Would you like to continue?");
			cont = scan.nextLine();

		}

		if (Circle.getCount() == 1) {
			System.out.println("Goodbye!\nYou've built " + Circle.getCount() + " circle!");

		} else {

			System.out.println("Goodbye!\nYou've built " + Circle.getCount() + " circles!");
		}
	}

}
