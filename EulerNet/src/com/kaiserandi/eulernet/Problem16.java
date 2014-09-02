package com.kaiserandi.eulernet;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 * 
 * @author andi
 */
public class Problem16 {
	public static void main(String[] args) {
		//init vars
		BigInteger powNumber = new BigInteger("2");
		BigInteger result = new BigInteger("0");
		
		//calc 2^1000
		powNumber = powNumber.pow(1000);
		
		//get the digits of powNumber
		ArrayList<Integer> digits = new ArrayList<Integer>();
		for (int i = 0; i < powNumber.toString().length(); i++) {
			digits.add(new Integer(String.valueOf((powNumber.toString().charAt(i)))));
		}
		
		//build sum of digits
		for (Integer integer : digits) {
			result = result.add(new BigInteger(String.valueOf(integer)));
		}
		
		//print result
		System.out.println(result);
	}
}
