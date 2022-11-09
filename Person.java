package PracticeConstructor;

public class Person {
	
	private String name = "Jaleah Beason";
	private int age = 20;
	//We're working on a constructor
	public Person(String initialName) {
		this.name = initialName;
		this.age = 0;
	}
	public void printPerson() {
		System.out.println(this.name + " , age " + this.age + " years");
	}
	
	public String getName() {
		return name;
	}

	}
