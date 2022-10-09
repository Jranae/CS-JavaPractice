import java.util.Scanner;

public class MaxofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, max = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three integers:");
		
		num1= scan.nextInt();
		num2= scan.nextInt();
		num3= scan.nextInt();
		
		if (num1>num2 && num1>num3)
				max=num1;
		else if (num2>num3)
			max = num2;
			else 
				max= num3;
		System.out.println(max);
	}

}
