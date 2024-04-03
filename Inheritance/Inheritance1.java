package Inheritance;

class Box {
	double l;
	double h;
	double w;
	double weight;

	Box() {
		this.l = 2;
		this.h = 2;
		this.w = 2;
	}

	// for cube
	Box(double a) {
		this.l = a;
		this.h = a;
		this.w = a;
	}

	Box(double l, double h, double w) {
		this.l = l;
		this.h = h;
		this.w = w;
	}

	// copy constructor
	Box(Box old) {
		this.l = old.l;
		this.h = old.h;
		this.w = old.w;
	}
}

//this is a class that has same properties in Boxclass and it additionally includes Boxweight.
class Boxweight extends Box {
	double weight;

	public Boxweight(double l, double h, double w, double weight) {
		// USE CASE 1:- used to initialize values present in parent class,it actually
		// calls the parentclass Constructor.
		super(l, h, w);
		// USE CASE 2:- Asssume a variable weight in Boxclass also.Now here
		// super.weight here will actually takes the weight in parentclass.
		System.out.println(super.weight); 
		this.weight = weight;// We want this class's data ,Hence we use 'this' which is appropriate for this conditon.
	}

	Boxweight() {
		this.weight = weight;
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Box box = new Box();
		System.out.println("Box 1:  " + box.l + " " + box.h + " " + box.w);

		Box box2 = new Box(1, 2, 3);
		System.out.println("Box 2:  " + box2.l + " " + box2.h + " " + box2.w);

		Boxweight box3 = new Boxweight(2, 3, 4, 1);
		System.out.println("Box 3:  " + box3.l + " " + box3.h + " " + box3.w + " " + box3.weight);

		Boxweight box4 = new Boxweight();
		System.out.println(box4.h + " " + box4.weight);

//		Box box5=new Boxweight(1,2,3,4);
//		System.out.println(box5.l + " "+ box5.h+ " "+ box5.w+" "+ box5.weight); //cannot access the weight,since it is in parentclass and the ref is created to point the boxweight class
	}

}
