import java.text.DecimalFormat;
import java.util.Scanner;
public class PraticeDecimalFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Surface area 4* pi* r (square)
		//Volume 4/3* pi* r (cubed)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the surface radius: ");
		double radius= scan.nextDouble();
		double surfacearea= 4 * Math.PI * Math.pow(radius, 2);
		double volume = 4/3 * Math.PI * Math.pow(radius,3);
		System.out.println("The circle surface area is: " + surfacearea);
		System.out.println("The circle volume is: " + volume);
		
		// Formatting the decimal points
		
		DecimalFormat format1 = new DecimalFormat(" 0.##"); // Three decimal places
				
		System.out.println("The formatted circle surfacearea is: " + format1.format(surfacearea));
		System.out.println("The formatted circle volume is: " + format1.format(volume));
				
	}

}
