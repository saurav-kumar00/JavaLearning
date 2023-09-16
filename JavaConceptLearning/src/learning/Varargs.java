
//Varargs stands for variable length argument.
package learning;

class Calc{
	
	//with parameter (int ... i) -> the value is passed here as array.
	public void calc(int ... i) {
		int sum = 0;
		for(int j: i)
			sum+=j;
		System.out.println(sum);
	}
}

public class Varargs {
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		//we can pass any number of values to the method as this method is equipped with variable length argument.
		calc.calc(1,2,3,4,5,6);
	}
}
