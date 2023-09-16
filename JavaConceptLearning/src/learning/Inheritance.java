//in order to inherit the funtionality of other class we use extends keyword.
//java supports multi level inheritance but it didn't support multiple inheritance.
//There are two relationship in inheritance:-
//	IS-A -> whenever a class extends another class then it is IS-A relationship.
//		VeryAdvCaclulator extends AdvCaclulator.
//	HAS-A -> whenver in a class in which we are creating the object of another class then it is called HAS-A relationship.
//		ex. -> class Inheritance can access the features of VeryAdvCaclulator as it has its object defined whth in it.
package learning;

class Calculator{//level 1
	public int add(int i, int j) {
		int k = i+j;
		return k;
	}
}
class AdvCalculator extends Calculator{//level 2
	public int sub(int i, int j) {
		int k = i-j;
		return k;
	}
}
//the below class has only one method i.e. mult() but it extends AdvCaclulator. so, it can use all the methods of AdvCaclulator and the methods inherited by it.
class VeryAdvCalculator extends AdvCalculator{// level 3. this is example of multi level inheritance.
	public int mult(int i, int j) {
		int k = i*j;
		return k;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		//the object vac can access all the methods which is within it and inherited in it.
		VeryAdvCalculator vac = new VeryAdvCalculator();
		System.out.println(vac.mult(20,540));
		System.out.println(vac.add(3, 3));
		System.out.println(vac.sub(3, 1));
		
		//based on the level of inheritance we can access its own methods and inherited methods.
		AdvCalculator vac1 = new AdvCalculator();
		vac1.add(4, 5);
		vac1.sub(8, 5);

	}

}
