package com.kaiserandi.eulernet;

import java.math.BigInteger;

/**
 * Starting in the top left corner of a 2x2 grid, there are 6 routes (without backtracking) to the bottom right corner.
 * How many routes are there through a 20x20 grid?
 *  
 * @author andi
 */
public class Problem15 {
	
	public static void main(String[] args) {
		//das problem lässt sich auf k aus n-menge zurückführen
		//n!/k!*(n-k)!
		BigInteger result = new BigInteger("0");
		result = fac(40).divide(fac(20).multiply(fac(20)));
		System.out.println(result);
	}
	
	public static BigInteger fac(int n) {
		BigInteger result = new BigInteger("1");
		  for (int i = 1; i <= n; i++) {
		     result = result.multiply(new BigInteger("" + i));
		  } 
		  return result;
		}
	
}
