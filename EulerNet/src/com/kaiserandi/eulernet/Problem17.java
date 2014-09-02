package com.kaiserandi.eulernet;

import java.util.HashMap;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) 
 * contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 * 
 * @author andi
 */
public class Problem17 {

	public static void main(String[] args) {
	
//		long letterCounter = 0;
//		
//		for (int i = 1; i <= 1000; i++) {
//			letterCounter = letterCounter + (spellNumber(i)).replace(" ", "").replace("-", "").length();
//			System.out.println(spellNumber(i));
//		}
//		
//		System.out.println("Result = " + letterCounter);
		System.out.println(spellNumber(987654321));
		
	}
	
	public static String spellNumber(int number){
		
		//zerlege die zahl in 1000er, hunderter, zehner, einer
		int million = 0;
		int tausender = 0;
		int hunderter = 0;
		int zehner = 0;
		int einer = 0;
		
		million = Math.round(number / 1000000);
		tausender = Math.round((number-million*1000000) / 1000);
		hunderter = Math.round((number-(million*1000000 + tausender*1000)) / 100) ;
		zehner = Math.round((number-(million*1000000 + tausender*1000 + hunderter*100)) / 10);
		einer = number - (million*1000000 + tausender*1000 + hunderter*100 + zehner*10);
		
		StringBuffer result = new StringBuffer();

		if (million > 0) {
			result.append(spellNumber(million));
			result.append(" billion ");
		}
		if (tausender > 0) {
			result.append(spellNumber(tausender));
			result.append(" thousand ");
//			if(hunderter > 0 || zehner > 0 || einer > 0){
//				result.append(" and ");
//			}
		}
		if(hunderter > 0){
			result.append(spellNumber(hunderter));
			result.append(" hundred");
			if(zehner > 0 || einer > 0){
				result.append(" and ");
			}
		}
		if(zehner > 1){
			result.append(getWordMap().get(zehner*10));
			if(einer > 0){
				result.append("-");
				result.append(getWordMap().get(einer));
			}
		}else if (zehner == 1){
			result.append(getWordMap().get(zehner*10+einer));
		}else if(zehner == 0 && einer > 0){
			result.append(getWordMap().get(einer));
		}
		
		return result.toString();
			
	}
	
	private static HashMap<Integer, String> getWordMap(){
		HashMap<Integer, String> wordMap = new HashMap<Integer, String>();
		wordMap.put(1, "one");
		wordMap.put(2, "two");
		wordMap.put(3, "three");
		wordMap.put(4, "four");
		wordMap.put(5, "five");
		wordMap.put(6, "six");
		wordMap.put(7, "seven");
		wordMap.put(8, "eight");
		wordMap.put(9, "nine");
		wordMap.put(10, "ten");
		wordMap.put(11, "eleven");
		wordMap.put(12, "twelve");
		wordMap.put(13, "thirteen");
		wordMap.put(14, "fourteen");
		wordMap.put(15, "fifteen");
		wordMap.put(16, "sixteen");
		wordMap.put(17, "seventeen");
		wordMap.put(18, "eighteen");
		wordMap.put(19, "nineteen");
		wordMap.put(20, "twenty");
		wordMap.put(30, "thirty");
		wordMap.put(40, "forty");
		wordMap.put(50, "fifty");
		wordMap.put(60, "sixty");
		wordMap.put(70, "seventy");
		wordMap.put(80, "eighty");
		wordMap.put(90, "ninety");
		wordMap.put(100, "hundred");
		wordMap.put(1000, "thousand");
		return wordMap;
	}
	
	 
	
}
