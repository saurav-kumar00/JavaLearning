/*ASCII - American standard code for information interchange.
 * 
 * Typecasting rule.
 * byte/char -> short -> int -> long -> float -> double
 * 
 * */
package learning;

public class Variables {
	public static void main(String args[]) {
		// Primitive data types
		int i = 5; // 4 bytes -> 32 bits - -2147483548 - +2147483647
		short s = 1; // 2 bytes -> 16 bits
		float f = 1.5f; // 2bytes - 16 bits - -32768 - +32767
		double d = 1.5; // 4 bytes - 32 bits
		char c = 'a'; // 2 bytes
		char ca = 66;

		double d1 = 5; // implicit typecast - output will be 5.0
		int i1 = (int) 5.6; // explicit typecast - output will be 5
	}
}