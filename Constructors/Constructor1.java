package Constructors;

class Student {
	int age;
	String name;
	int rollno;

	// constructor1
	Student(int age, String name, int rollno) {
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}

	// constructor2
	Student(String name) { // constructor overloading with different arguments.
		this.name = name;
	}

	// constructor3
	Student(int age) {
		this.age = age;
	}

	Student() {

	}
//
//	@Override
//	public String toString() {
//		return age +" "+ name +" "+ rollno;
//	}
}

public class Constructor1 {

	public static void main(String[] args) {
		Student s1 = new Student(14, "Loki", 44);
		Student s2 = new Student(18, "Shiva", 49);
		Student s3 = new Student(16, "Ram", 40);

		Student s4 = new Student("Mohan");
		System.out.println("Name: " + s4.name);
		System.out.println(s4.name + " " + s4.age);// it will give default value.

		Student s5 = new Student(18);
		System.out.println("Age: " + s5.age);

		System.out.println("------------------------------------------");
		System.out.println(s1.name + " " + s1.age + " " + s1.rollno);
		System.out.println(s2.name + " " + s2.age + " " + s2.rollno);
		System.out.println(s3.name + " " + s3.age + " " + s3.rollno);

		System.out.println("------------------------------------------");
		Student one = new Student(); // Here, 'one' is a reference variable pointing to a new instance of the Student class created in the heap memory.
		Student two = one; // Here, 'two' is another reference variable and both the ref variable (one,two) is pointing to the same data in the heapMemory 
		one.name = "Loki"; // Setting the name attribute of the Student object referred to by 'one'.
		one.age = 19; // Setting the age attribute of the Student object referred to by 'one'.
		one.rollno = 44; // Setting the rollno attribute of the Student object referred to by 'one'.
		System.out.println("Name: "+two.name);
		System.out.println("Age: "+two.age); 
		System.out.println("RollNo: "+two.rollno); 

	}
}


/*Note
Constructor overloading can be done by creating different constructors with different parameters
Constructors are used to initialize objects
This is the best way of initializing objects
Check instance variable vs ref variable(Screenshot) for better understanding
*/