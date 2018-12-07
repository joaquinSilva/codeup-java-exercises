package shapes;
import util.Input;
import java.util.Scanner;


public class CircleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Input in = new Input(sc);
		System.out.println("Please enter the length of a radius.");
		double radius = in.getDouble();

		Circle c = new Circle(radius);
		System.out.println(c.getCircumference());
		System.out.println(c.getArea());
	}

}
