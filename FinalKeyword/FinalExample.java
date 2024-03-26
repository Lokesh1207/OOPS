package FinalKeyword;

class Myself {
	final int a = 10; //final in variables
//	a=30; //we cannot change its value,since it is final
	String name;

	Myself(String name) {
		this.name = name;
	}
}

public class FinalExample {

	public static void main(String[] args) {
		final Myself lokesh = new Myself("Loki");//final in object
		lokesh.name = "S.Lokesh";
		System.out.println(lokesh.name);
//		lokesh=new Myself("other name"); //this we cannot do,when a non primitive is final,we cannot reassign it. 
	}
}



/*Note
final must always be initailized 
final can be used anywhere in variables,objects,class...
*/