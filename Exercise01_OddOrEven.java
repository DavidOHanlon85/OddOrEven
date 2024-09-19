/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise01_OddOrEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Method Invocation

		oddOrEven(0);
		oddOrEven(193);
		oddOrEven(-23);
		oddOrEven(97);
		oddOrEven(102);
	}

	/**
	 * This method prints if a number is odd or even
	 * 
	 * @param number - desired check inputed as an argument
	 */

	public static void oddOrEven(int number) {

		if (number % 2 == 0) {
			System.out.println(number + " is Even.");
		} else {
			System.out.println(number + " is Odd.");
		}
	}

}
