
package learning;


//If we use abstract keyword with a class then we cannot create the object of that class, it can only be extednd by another class.
abstract class Human{

	//once we make a class abstract, we can also declare methods. The method also contains abstract keyword.
	//this method is called abstract method.
	public abstract void run();
	public void eat() {
		
	}
	public void walk() {
		
	}
}
//once it extend abstract class this class is called as concrete class.
class Man extends Human{
	//once we extend a abstract class, it is compulsory to define its abstract method.
	public void run() {
		
	}
}

public class AbstractKeyword {

	public static void main(String[] args) {

		

	}

}
