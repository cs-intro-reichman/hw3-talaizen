// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    // System.out.println(plus(2,-3));  
		// System.out.println(plus(-2,3)); 
		// System.out.println(plus(2,3));  
		// System.out.println(plus(-2,-3));  
	    // System.out.println(minus(7,2));
   		// System.out.println(minus(-7,-2));  
		// System.out.println(minus(-2,7));
		// System.out.println(minus(2,-7));    
 		// System.out.println(times(4,5)); 
		// System.out.println(times(-4,-5));
		// System.out.println(times(-4,5));
		// System.out.println(times(4,-5));
   		// System.out.println(pow(5,3));
   		// System.out.println(pow(3,5));
		// System.out.println(pow(-5,3));
   		// System.out.println(pow(3,-5));
   		// System.out.println(div(12,3));   // 12 / 3    
   		// System.out.println(div(5,2)); 
		// System.out.println(div(2,5)); 
		// System.out.println(div(-2,-5));
		// System.out.println(div(5,-2)); 
   		// System.out.println(div(25,7));   // 25 / 7
   		// System.out.println(mod(25,7));   
   		// System.out.println(mod(120,6)); 
		// System.out.println(mod(-25,7));   
   		// System.out.println(mod(-120,-6));  
   		// System.out.println(sqrt(36));
		// System.out.println(sqrt(263169));
   		// System.out.println(sqrt(76123));
		// System.out.println(sqrt(16));
		// System.out.println(sqrt(10));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		/** this method gets two integers and returns the addition result of them */
		if (x2 > 0) {
			while (x2 != 0) {
				x1++;
				x2--;
			}
		} else {
			while (x2 != 0) {
				x1--;
				x2++;
			}
		}
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		/** this method gets two integers and returns the substracution of the second argument from the first */
		int opposite = 0;
		if (x2 > 0) {
			while (x2 != 0) {
				opposite--;
				x2--;
			}
		} else {
			while (x2 != 0) {
				opposite++;
				x2++;
			}
		}
		return plus(x1, opposite);
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		/** this method get two integers and returns the multiplication result */
		int result = 0;
		int base = x1;
		if (x2 < 0) {
			base = minus(0, x1);
			x2 = minus(0, x2);
		}
		while (x2 != 0) {
			result = plus(result, base);
			x2--;
		}
		return result;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		/** this method get two integers x and n and returns the result of x in the power of n*/
		if (n == 0) return 1;
		else if (n < 0) return 0;

		int result = 1;
		while (n > 0) {
			result = times(result, x);
			n--;
		}
		return result;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		/** this func gets two intergers x1, x2 and returns the integer part of x1 / x2 */
		int result = 0;
		int absX1 = (x1 < 0) ? minus(0, x1) : x1;
		int absX2 = (x2 < 0) ? minus(0, x2) : x2;

		while (absX1 >= absX2) {
			absX1 -= absX2;
			result++;
		}

		if ((x1 < 0 && x2 > 0) || (x1 > 0 && x2 < 0)) {
			result = minus(0, result);
		}

		return result;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		/** this func gets two intergers x1, x2 and returns x1 % x2 */
		int remainder = minus(x1, times(div(x1, x2), x2));

		if (remainder != 0 && ((x1 < 0 && x2 > 0) || (x1 > 0 && x2 < 0))) remainder = plus(remainder, x2);

		return remainder;
	}

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		/** this func gets a number and returns its squre */
		if (x == 0 || x == 1) return x;

		int result = 1;
    	int square = 1;
		while (true) {
			if (square == x) return result;
			else if (square > x) return minus(result, 1);

			result ++;
			square = times(result, result);
		}
	}	  	  
}