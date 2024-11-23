// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		/** this method gets two integers and returns the addition result of them */
		int result = x1;
		for (int i = 0; i < x2; i++) {
			result++;
		}
		return result;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		/** this method gets two integers and returns the substracution of the second argument from the first */
		int result = x1;
		for (int i =0; i < x2; i++) {
			result--;
		}
		return result;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		/** this method get two integers and returns the multiplication result */
		int result = 0;
		for (int i = 0; i < x2; i++) {
			result += x1;
		}
		return result;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		/** this method get two integers x and n and returns the result of x in the power of n*/
		int result = x;
		for (int i = 0; i < n - 1; i++) {
			result *= x;
		}
		return result;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		/** this func gets two intergers x1, x2 and returns the integer part of x1 / x2 */
		int counter = 0;
		int sum = 0;
		while (sum + x2 <= x1) {
			sum += x2;
			counter ++;
		}
		return counter;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		/** this func gets two intergers x1, x2 and returns x1 % x2 */
		return x1 - times(div(x1, x2), x2);
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		return 0;
	}	  	  
}