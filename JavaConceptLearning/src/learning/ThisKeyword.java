package learning;

public class ThisKeyword {

	public static void main(String[] args) {
		
		ThisConcept tc = new ThisConcept(3,1);
		System.out.println(tc.i);
		System.out.println(tc.j);
	}

}

class ThisConcept {
	int i;
	int j;
	//this keyword refers to the current object.
	//if we don't specify this keyword and the parameter name is same with variable name then parameter will overshadow the variable.
	public ThisConcept(int i, int j) {
		this.i = i;
		this.j = j;
	}
}
