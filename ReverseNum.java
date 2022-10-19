import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, lastDigit, reverse=0;
		Scanner scan = new Scanner(System.in);
		number = 3456;
	
	while(number>0)
	{
		lastDigit = number % 10;
		reverse = (reverse*10) + lastDigit;
		number = number/10;
	System.out.println("That number reversed is "+ reverse);
	
	}
	}

}
