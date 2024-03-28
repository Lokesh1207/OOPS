package StaticKeyword;

public class StaticInMethods {
	public static void greeting() {
		System.out.println("Hello im Lokesh");
	}

//	void fun1() {
//		System.out.println("Function 1");
//	}
//
//	static void fun2() {  //we cannot call a non static method inside a static method.If we want to do the fun1 also need to be static.
//		fun();
//	}    

	public static void main(String[] args) {
		greeting();
	}
}

/*Notes
1.We cant use a non static method inside a static method.The methods inside a static method must be static.
2.Static method -not requires instance 
3.Non static method- requires instance
4.Somethig which is not static ,we need to create an object to access it.
*/
