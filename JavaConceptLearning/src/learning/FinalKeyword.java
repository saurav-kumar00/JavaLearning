
package learning;

//Once we make a class final, it means we cannot extend this class.
final class FinalEx{
	
	//Once we make a variable final, we cannot change the value in later stage of execution. It will beocme a constant.
	//for constants we use capital letters.
	final int I=10;
	
	public void show() {
		
	}
	
}
class NewClass{

	//once we make a method final, it means we cannot override this method.
	final public void calc() {
		
	}
}
class Sub extends NewClass{
	
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
