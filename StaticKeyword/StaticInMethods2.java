package StaticKeyword;

public class StaticInMethods2 {
	static int staticVariable = 10; // static variable

	// static method
	public static void staticMethod() {
		System.out.println("Inside static method");
	}

	// non-static method
	public void nonStaticMethod() {
		System.out.println("Inside non-static method");
	}

	public static void main(String[] args) {
		staticMethod(); // Static method can be called without an instance
		System.out.println("Static variable: " + staticVariable); // Accessing static variable directly

		// nonStaticMethod(); // This would cause a compilation error
		// You can't call non-static methods directly within a static method

		StaticInMethods2 obj = new StaticInMethods2(); // Creating an instance of StaticInMethods2 class.
		obj.nonStaticMethod(); // Calling non-static method using object reference

	}
}

/*Notes
 *Cannot make a static reference to the non-static field staticVariable-->If the staticVariable is not static.
 */
