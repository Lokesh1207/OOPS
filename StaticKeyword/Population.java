package StaticKeyword;

//static example in variables
class Human {
	int age;
	String name;
	int salary;
	static long population;

	public Human(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		Human.population += 1; // since it is static
	}
}

public class Population {

	public static void main(String[] args) {
		Human h1 = new Human(22, "Sanjay", 12000);
		Human h2 = new Human(22, "Shiva", 12000);
		Human h3 = new Human(22, "Badri", 12000);
		System.out.println("Overall population: " + Human.population);// we dont need an object to access a static
																		// variable,since it is static.
//		System.out.println(h1.population);
//		System.out.println(h2.population);
//		System.out.println(h3.population);

	}
}
