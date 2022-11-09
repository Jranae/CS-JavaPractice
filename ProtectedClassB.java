package PackageB;

import PackageA.*;

class ProtectedClassB extends Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedClassB myObj = new
				ProtectedClassB();
		System.out.println("Name: " + myObj.fname + "" + myObj.lname);
	}

}
