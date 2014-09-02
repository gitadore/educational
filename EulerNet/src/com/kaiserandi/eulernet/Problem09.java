package com.kaiserandi.eulernet;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^(2) + b^(2) = c^(2)
 * 
 * For example, 3^(2) + 4^(2) = 9 + 16 = 25 = 5^(2).
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 * 
 * @author andi
 * 
 */
public class Problem09 {

	/**
	 * start with a = 1, b = 2, c = 997 then 
	 * iterate over c decreasing b inc. and so on...
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int initB = 2;
		int initC = 997;
		int a = 1;
		int b = initB;
		int c = initC;
		int result = 0;

		while (a < b && ( a + b + c == 1000)){
			while ( b < c && ( a + b + c == 1000)){
				if(a*a + b*b == c*c){
					result = a * b * c;
					System.out.println(a + " * " + b + " * " + c + " = " + result);
					break;
				}else{
					c--;
					b++;
				}
			}
			if(a>c)
				break;
			a++;
			initB++;
			initC = initC - 2;
			b = initB;
			c = initC;
		}
		
			
	}

}
