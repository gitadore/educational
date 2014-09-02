package com.kaiserandi.eulernet;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest number that is evenly
 * divisible by all of the numbers from 1 to 20?
 * 
 * @author andi
 */
public class Problem05 {
	
	public static void main(String[] args) {
		boolean search = true;
		long testNumber = 20*19L;
		while (search){
			if(isEvenlyDivisible(testNumber)){
				System.out.println("Smallest number is: " + testNumber);
				search = false;
			}else
				testNumber++;
		}
	}
	
	private static boolean isEvenlyDivisible(long l){
		for (int i = 1; i <= 20; i++) {
			if(l % i != 0){
				return false;
			}
		}
		return true;
	}
}
