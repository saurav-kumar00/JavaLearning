package learning;


//There only can be one public class in a single .java file and only that class whose name is itself with .java file.

public class ConstructorAndObjects {
	public static void main(String args[]) {
		
		//by mentioning new Sample() we are allocating the memory and calling the constructor of that class.
		//even the constructor is not defined in class, java will create a default constructor for us in runtime.
		
		Sample s = new Sample();
		System.out.println(s);

	}

}

class Sample {
	//Constructor is a member method.
	// Constructors has same name as class name.
	//it will never return anything.
	//it is also used to initialize values.
	//we cannot call the constructor directly, java calls the constructor when a object is created.
	//we can overload the constructor.
	public Sample() {

	}
	public Sample(int i) {
		
	}
}