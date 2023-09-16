package learning;

//Inner class can be of 3 types.
//	member class
//	static inner class.
//	Anonymous class.

class Outer{
	int i=0;
	public void show() {
		System.out.println("in outer show");
	}
	//we can define class inside a class, this is called inner class.
	//this inner class file will be created with name Outer$Inner.class.
	//we can also make inner class static.
	static class Inner{
		public void show() {
			System.out.println("in inner show");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.show();
		
		//in order to create a object of inner class we have to do it in this way as the inner class is not in our scope.
		//Outer.Inner inner = outer.new Inner();
		//inner.show();
		
		//in order to create the object of static inner class we don't need object of outer class.
		Outer.Inner inner = new Outer.Inner();
		inner.show();

	}

}
