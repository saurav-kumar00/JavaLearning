package learning;

class SuperClass{
	public void show() {
		System.out.println("in Super");
	}
}

class SubClass extends SuperClass{
	//if the name of method mismatch from sub and super we can use @override annotation, now it will give compile time error.
	@Override
	public void show() {
		//if we want to call the method of super class anyway then we can use super keyword. now it will call the method of super class as well as sub class.
		super.show();
		System.out.println("in Sub");
	}
}

class AnotherSubClass extends SuperClass{
	public void show() {
		System.out.println("in another sub class");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		//if the method is present in sub class then it will call the method of sub class else it will call the mehtod of super class.
		sub.show();
		
		//we can also create the reference of super class and object of sub class.
		//with this it will call the method of sub class.
		//we can call only those methods which are there in super class.
		//This is called runtime polymorphism.
		SuperClass sup = new SubClass();
		sup.show();
		
		sup = new AnotherSubClass();
		//since we are calling same object but of different class, this is called dynamic method dispatch.
		sup.show();

	}

}
