import java.util.ArrayList;
public class  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[4];
		//adding elements into array
		arr[0]=10;
		arr[1]=21;
		arr[2]=153;
		arr[3]=673;
		System.out.println("arr[0]"); //print 10
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//Create an ArrayList object
		ArrayList<String>names = new ArrayList<String>();
		//Add names
		names.add("John");
		names.add("Sally");
		names.add("Noelle");
		names.add("Harry");
		System.out.println(names); //List of names
		System.out.println(names.get(0)); //John
		System.out.println(names.get(2)); //Noelle
		names.set(0,"John");
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		System.out.println(names.size());
		names.clear();
		System.out.println(names);
		
	
	
	}

}
