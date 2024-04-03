//logic first tamil video
package oopspackage;

class Employee { // super class

	private String name;
	private double salary;
	protected int joinDate;

	Employee(String name, double salary, int joinDate) { // constructor is created.
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(int joinDate) {
		this.joinDate = joinDate;
	}

	public void raiseSalary(double percent) {
		salary = salary + (salary * (percent / 100));// this method is used to boost the salary.(For eg:- if we say
														// boost by 10% ,it will boost 10% from the current salary.
	}

	void display() {
		System.out.println("\nName:" + getName());
		System.out.println("Salary: " + getSalary());
		System.out.println("JoinDate: " + getJoinDate());
	}
}

class Manager extends Employee { // sub class
	double bonus;

	Manager(String name, double salary, double bonus, int joinDate) {
		super(name, salary, joinDate);// Calls the parameterized constructor of the superclass (Employee)
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	// METHOD OVERRIDING
	// Override the getSalary method to include the bonus
	public double getSalary() {
		return super.getSalary() + bonus; // Call the getSalary method of the superclass (Employee) to get the base
											// salary
	}

	void display() {
		super.display();// display method is overrided from the superClass
		System.out.println("Salary with Bonus: " + getSalary());
	}
}

public class Inheritancdemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Loki", 20000, 120704);
		e1.raiseSalary(20);
		e1.display();

		Manager m1 = new Manager("Shiva", 40000, 1000.0, 291001);
		m1.display();
		// 40,000+1000=41,000 will get printed here.
	}

}
