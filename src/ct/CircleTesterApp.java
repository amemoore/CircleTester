package ct;

import java.util.Scanner;

public class CircleTesterApp {
	
	private static double radiusInput = 0.0;
	private static double calcCircumference;
	private static double calcArea;
	private static int count;
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Welcome to the Circle Tester Application\n");
		sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			radiusInput = Validator.getPositiveDouble(sc, "Enter radius: ");
			Circle circle = new Circle(radiusInput);
			calcCircumference = circle.getCircumference();
			calcArea = circle.getArea();
			System.out.println("Circumference: " + circle.getRoundedCircumference(calcCircumference) + "\nArea: " 
								+ circle.getRoundedArea(calcArea));
			System.out.println();
			count = circle.getObjectCount();
			choice = Validator.getYorNo(sc, "Would you like to continue? (y/n): ");
			System.out.println();
			}
		System.out.println("\nBye-Bye! You have created " + count + " circle objects.");
		}
	}
