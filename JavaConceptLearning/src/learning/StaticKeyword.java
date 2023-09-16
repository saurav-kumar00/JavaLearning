package learning;

/* we can have static variable, static methods and static inner class.
 * 
 */

//The object created is stored in head memory.
//before creating object the class has to be loaded, there is a memory in JVM which is called class loader memory.
class Emp {
	int id;
	String name;
	// if we make any variable static, the value will be same for all the objects.
	// whenever we make any variable static instead of storing in heap memory it
	// gets stored to class loader memory.
	static String manager;

	// instead of initializing static variable with object/class, we can also initialize with static block.
	// we can place static block within class.
	// this static block will be called only once as the class loads.
	//static block will be executed before constructor.
	//if we have multiple static block then it will follow the sequence.(top -> bottom)
	//we cannot access non static variable in static method or static block.
	static {
		manager = "s3";
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", manager=" + manager + "]";
	}

}

public class StaticKeyword {
	// if we make a method static, we don't need an object to call the method. due
	// to this main method has static keyword because it is called directly by the JVM.
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.name = "s1";
		e1.id = 1;
		e1.manager = "man1";

		Emp e2 = new Emp();
		e2.id = 2;
		e2.name = "s2";
		// as the manager variable is static, the later assigned value to the variable will be taken.
		// instead of mentioning the object we can directly use class name.variable in case of static.
		// we even don't need a object to declare/access a static variable.
		// e2.manager = "man2";
		Emp.manager = "man3";

		System.out.println(e1);
		System.out.println(e2);

	}

}
