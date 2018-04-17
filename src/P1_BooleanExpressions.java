/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/16/2018
*/

/*
 Your expression predictions:
 1. T
 2. T
 3. F
 4.T
 
 5. T
 6.F
 7.T
 8.T
   
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 I was correct, through careful examination it is easy to understand the conditions.

 */
public class P1_BooleanExpressions {

	public static void main(String[] args) {
		int x = 27; 
		int y = -1; 
		int z = 32; 
		boolean b = false; 
		
		System.out.println(!b);
		System.out.println(b || true );
		System.out.println((x > y) && (y > z) );
		System.out.println((x == y) || (x <= z) );
		System.out.println(!(x % 2 == 0) );
		System.out.println(b && !b );
		System.out.println(b || !b);
		System.out.println((x < y) == b);

	}

}
