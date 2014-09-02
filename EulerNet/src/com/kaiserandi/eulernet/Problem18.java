
package com.kaiserandi.eulernet;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below,
 * the maximum total from top to bottom is 23.
 * 
 *    3
 *   7 4
 *  2 4 6
 * 8 5 9 3
 * 
 * That is, 3 + 7 + 4 + 9 = 23.
 * 
 * Find the maximum total from top to bottom of the triangle below:
 * 
 * 				 75
 * 				95 64
 * 			   17 47 82
 * 			  18 35 87 10
 * 			 20 04 82 47 65
 * 			19 01 23 75 03 34
 *         88 02 77 73 07 63 67
 *        99 65 04 28 06 16 70 92
 *       41 41 26 56 83 40 80 70 33
 *      41 48 72 33 47 32 37 16 94 29
 *     53 71 44 65 25 43 91 52 97 51 14
 *    70 11 33 28 77 73 17 78 39 68 17 57
 *   91 71 52 38 17 14 91 43 58 50 27 29 48
 *  63 66 04 68 89 53 67 30 73 16 69 87 40 31
 * 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 * 
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. 
 * However, Problem 67, is the same challenge with a triangle containing one-hundred rows; 
 * it cannot be solved by brute force, and requires a clever method! ;o)
 * 
 * Idea: start from bottom. after every iteration test for the way with max total?
 * @author andi
 */
public class Problem18 {
	
	private static HashMap<Integer, int[]> nodesLines = new HashMap<Integer, int[]>() ;
	
	public static void main(String[] args) {
		fillNodes();
		long result = addSum(nodesLines);
		System.out.println("Result = "+ result);
	}
	
	private static long addSum(HashMap<Integer, int[]> nodelines){
		long result = 75l; //TODO: replace this with code that retrieves the first value 
		int nextIndex = 0;
		for (int i = 0; i < nodelines.size()-1; i++) {
			int[] compareline = nodelines.get(i+1);
			if(compareline[nextIndex] > compareline[nextIndex+1]){
				result = result + compareline[nextIndex];
				System.out.println(result + " + " + compareline[nextIndex]);
			}else{
				result = result + compareline[nextIndex+1];
				System.out.println(result + " + " + compareline[nextIndex+1]);
				nextIndex++;
			}
		}
		return result;
	}
	
	private static void fillNodes(){
		nodesLines.put(0, stringToIntArray("75"));
		nodesLines.put(1, stringToIntArray("95 64"));
		nodesLines.put(2, stringToIntArray("17 47 82"));
		nodesLines.put(3, stringToIntArray("18 35 87 10"));
		nodesLines.put(4, stringToIntArray("20 04 82 47 65"));
		nodesLines.put(5, stringToIntArray("19 01 23 75 03 34"));
		nodesLines.put(6, stringToIntArray("88 02 77 73 07 63 67"));
		nodesLines.put(7, stringToIntArray("99 65 04 28 06 16 70 92"));
		nodesLines.put(8, stringToIntArray("41 41 26 56 83 40 80 70 33"));
		nodesLines.put(9, stringToIntArray("41 48 72 33 47 32 37 16 94 29"));
		nodesLines.put(10, stringToIntArray("53 71 44 65 25 43 91 52 97 51 14"));
		nodesLines.put(11, stringToIntArray("70 11 33 28 77 73 17 78 39 68 17 57"));
		nodesLines.put(12, stringToIntArray("91 71 52 38 17 14 91 43 58 50 27 29 48"));
		nodesLines.put(13, stringToIntArray("63 66 04 68 89 53 67 30 73 16 69 87 40 31"));
		nodesLines.put(14, stringToIntArray("04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"));
		
	}
	
	private static int[] stringToIntArray(String data){
		
		StringTokenizer tokenIzer = new StringTokenizer(data);
		int[] result = new int[tokenIzer.countTokens()];
		int i = 0;
		while (tokenIzer.hasMoreTokens()) {
	         result[i] = Integer.valueOf((String)tokenIzer.nextElement());
	         i++;
		}
		return result;
	}

//	public static class Node {
//		
//		private int index;
//		private int nextLeftIndex;
//		private int nextRightIndex;
//		private int valueLeft;
//		private int valueRight;
//		
//		public Node(int index, int nextLeftIndex, int nextRightIndex, int valueLeft, int valueRight){
//			this.index = index;
//			this.nextLeftIndex = nextLeftIndex;
//			this.nextRightIndex = nextRightIndex;
//			this.valueLeft = valueLeft;
//			this.valueRight = valueRight;
//		}
//
//		public int getIndex() {
//			return index;
//		}
//
//		public int getNextLeftIndex() {
//			return nextLeftIndex;
//		}
//
//		public int getNextRightIndex() {
//			return nextRightIndex;
//		}
//
//		public int getValueLeft() {
//			return valueLeft;
//		}
//
//		public int getValueRight() {
//			return valueRight;
//		}
//		
//		@Override
//		public String toString() {
//			return "Left: {" + valueLeft + "},Right: {" + valueRight +"}";
//		}
//		
//	}

}
