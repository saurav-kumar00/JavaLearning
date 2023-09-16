package learning;

public class LambdaExpression {

	public static void main(String[] args) {
		//Lambda expression only works with functional interfaces.
		//Through this we can remove some boiler plate code.
		InterfaceDemo in = () -> System.out.println("this is lambda expression");
		in.show();

	}

}
