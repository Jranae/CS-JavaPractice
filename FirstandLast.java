import java.util.Scanner;
public class FirstandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		int lastDigit = 0;
		if(number>=10)
		{
			lastDigit = number % 10;
			
			while(number>9)
			{
				number = number / 10;
			}
			System.out.println(" First Number " + number + " Last Number " + lastDigit + " Total = " + (number + lastDigit));
		}
		else 
			lastDigit = 0;
		System.out.println("First Number " + number + " Last Number " + lastDigit + " Total = " + (number + lastDigit));
	}

}
