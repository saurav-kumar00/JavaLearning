/*Arithmetic operator +,-,*,/,%
 * Bitwise operator <<, >>, &, |,
 * Relational operator
 * 
 * */
package learning;

public class Operators {
	public static void main(String args[]) {
		int m = 4;
		int n = 5;

		n += m; // n = n+m, short hand operator.
		n += 1; // n=n+1
		n++; // post increment operator, it will increment by 1 after the execution of line.
		++n; // pre increment operator, it will increment by 1 before the execution of line.

		int j = m > n ? m : n; // Ternary operator, if m>n returns true then m will be assigned to j else n
								// will be assigned.
		System.out.println(j);
	}
}
