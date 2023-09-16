//Anonymous class does not have a name.
//If the purpose of a class is only to extend a particular class and override its method then we can use this.
//We can also implement anonymous class with interfaces.

package learning;

interface InterfaceDemo{
	public void show();
}

class NewA{
	public void show() {
		System.out.println("in NewA");
	}
}
//the purpose of NewB class is only to extend the NewA class and override show() 
//class NewB extends NewA{
//	public void show() {
//		System.out.println("in NewB");
//	}
//}
public class AnonymousClass {
	public static void main(String[] args) {
	
		//just after the constructor we can put curly braces and define the method.
		//this is only a one time use object.
		//this will override the method defined in NewA class.
		NewA obj = new NewA() {
			public void show() {
				System.out.println("This is anonymous class");
			}
		};
		obj.show();
		
		//With Anonymous class we can create the object of interface and provide the implementation of its methods.
		InterfaceDemo ni = new InterfaceDemo() {
			public void show() {
				System.out.println("Anonymous class using interface");
			}
		};
		ni.show();
	}

}

