import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(number >=10 && number <100)
		System.out.println("It is a two digit number");
		
		else if(number >= 100 && number <=1000)
		System.out.println("It is a three digit number");
		
		else if(number >= 1000 && number <=10000)
			System.out.println("It is a four digit number");
			
		else if(number >= 10000 && number <=100000)
			System.out.println("It is a five digit number");
			
		else
			System.out.println("The number is not between 1 & 99999");
			
		
	}

}
