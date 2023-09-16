//every constructor in sub class has super() by default even if we don't mention it.
//we use super keyword to represent parent class object.

package learning;

class A{
	public A() {
		System.out.println("in A");
	}
	public A(int i) {
		System.out.println("in int A");
	}
}
class B extends A{
	public B() {
		System.out.println("in B");
	}
	public B(int i) {
		//even there is no super mentioned here java considers there is a super() here at this place. this is why the default constructor of super class is called.
		//if we pass a parameter in super(), it will call the parameterized constructor of super class.
		super(i);
		System.out.println("in int B");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		//we created the object of class A. so, its constructor is called.
		A a = new A();
		
		//we created the object of B the constructor of A and B both will be called in order(A->B). in order of super class to its sub class.
		B b = new B();
		
		//if we call the parameterized constructor of B, it will call the default constructor of its super class A and parameterized construtor of B.
		B b1 = new B(1);
		

	}

}
