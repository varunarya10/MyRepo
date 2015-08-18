/* Program to find the first unique character in a string
 * There are many ways of doing this.
 * 
 * Assumptions
 * 1. All lower case
 * 2. Only a-z
 * */

import java.util.HashMap;

public class UniqueCharacter {
	
	public static char usingHash(String str) {
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();
		int count;
		
		// Construct the hash map first
		for(int i=0; i<arr.length; i++) {
			if(h.get(arr[i]) == null) {
				h.put(arr[i], 1);
			} else {
				count = h.get(arr[i]);
				h.put(arr[i], count+1);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(h.get(arr[i]) == 1) {
				// This is our first unique character
				return arr[i];
			}
		}
		return ' ';
	}
	
	public static char findFirstUniqueChar(String str) {
		return usingHash(str);
	}

	public static void main(String[] args) {
		String str = new String("teetotal");
		char c = UniqueCharacter.findFirstUniqueChar(str);
		System.out.println(c);
		
		String str1 = new String("abcabcd");
		char c1 = UniqueCharacter.findFirstUniqueChar(str1);
		System.out.println(c1);
		
		String str2 = new String("aaaaaa");
		char c2 = UniqueCharacter.findFirstUniqueChar(str2);
		System.out.println(c2); // Space will be printed
	}

}
