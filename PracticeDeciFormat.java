import java.util.Scanner;
import java.text.DecimalFormat;
public class PracticeDeciFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Area pi* r (square)
		// Circumference: 2* pi * r
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius= scan.nextDouble();
		double area= Math.PI * Math.pow(radius, 2);
		double circumference = 2 * Math.PI * radius;
		System.out.println("The circle area is: " + area);
		System.out.println("The circle circumference is: " + circumference);
		
		// Formatting the decimal points
		
		DecimalFormat format1 = new DecimalFormat(" 0.###"); // Three decimal places
		
		System.out.println("The formatted circle area is: " + format1.format(area));
		System.out.println("The formatted circle circumference is " + format1.format(circumference));
		
	}

}
