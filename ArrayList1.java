import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>animals = new ArrayList<String>();
		//add animals
		animals.add("cat");
		animals.add("dog");
		animals.add("cow");
		animals.add("horse");
		animals.add("leopard");
		System.out.println(animals); //List of animals
		System.out.println(animals.get(3));
		System.out.println(animals.get(4));
		System.out.println(animals.size());
		animals.set(2,"buffalo");
		animals.set(4,"tiger");
		animals.remove(0);
		animals.remove(0);
		for (String i: animals)
		System.out.println(i);
	}

}
