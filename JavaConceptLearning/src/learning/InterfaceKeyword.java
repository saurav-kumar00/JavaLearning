//Interface is introduced to resolve the issue of multiple inheitance. As in java we cannot extends two classes.
//with Interface we can implements multiple interfaces.
//Types of Interfaces:-
//	Normal interface - contains several methods.
//	Single abstract method - functional interface. - we can use Lambda expression - this is coming from Scala language - Java adapted Scala.
//	Marker Interface - without any method.

package learning;
//if we want to make a interface a functional interface then we can use @FunctionalInterface annotation. in this way it will be restricted to declare only one abstract method in interface.
@FunctionalInterface
interface Writer{
	//by default the variable created in interface are constants.
	int i=10;
	//by default all the methods in a interface is public abstract.
	//We can only declare methods in interfaces, we cannot define it. this is the main differene between abstract class and interface.
	void write();
	//with default keyword we can define a method inside a interface. introduced in java 1.8.
	//we can also override this method.
	default public void show() {
		System.out.println("inside Writer interface");
	}
	//we can create static methods inside interface.
	static void display() {
		System.out.println("static display method in interface");
	}
}

class Pen implements Writer{
	public void write() {
		System.out.println("in Pen class");
	}
}

class Pencil implements Writer{
	public void write() {
		System.out.println("in Pencil class");
	}
}

class Kit{
	public void doSomething(Writer p) {
		p.write();
	}
}

public class InterfaceKeyword {

	public static void main(String[] args) {
		
		Kit k = new Kit();
		
		//we can create the reference of interface but we cannot create the object of it.
		//we have create the object of implementation class where the interface method is implemented.
		Writer p = new Pen();
		Writer pc = new Pencil();
		k.doSomething(pc);

	}

}
