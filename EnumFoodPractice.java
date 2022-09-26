enum Food
{ Chicken, Mac, Steak, Potatoes; 
}

public class EnumFoodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food f1 = Food.Chicken;
		System.out.println(f1);
		System.out.println(f1.ordinal());
		
		Food f2 = Food.Mac;
		System.out.println(f2);
		System.out.println(f2.ordinal());
		
		Food f3 = Food.Steak;
		System.out.println(f3);
		System.out.println(f3.ordinal());
		
		Food f4 = Food.Potatoes;
		System.out.println(f4);
		System.out.println(f4.ordinal());
	}

}
