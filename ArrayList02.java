import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>Number = new ArrayList<Integer>();
		Random Generator = new Random();
		Number.add(10);
		Number.add(20);
		Number.add(8);
		Number.add(45);
		Number.add(25);
		Number.add(12);
		Iterator<Integer> Iter = Number.iterator();
		//System.out.println("Printing the first item of the arraylist:"+Iter.next());
		//Print all the elements of the elements of the array list using hadNext()
		while(Iter.hasNext())
		{
			
			Integer newNumber = Iter.next();
			if (newNumber>20)
				Iter.remove();
		}
		System.out.println("Printing the first item of the arraylist: "+Number);
	}

}
