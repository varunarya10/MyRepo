/* Program to find the first unique character in a string
 * There are many ways of doing this.
 * 
 * Assumptions
 * 1. All lower case
 * 2. Only a-z
 * */

import java.util.HashMap;

public class UniqueCharacter {
	
	public static char usingArray(String str) {
		int aux[] = new int[26];
		for(int i=0;i<26;i++) {
			// Initialize to 0
			aux[i] = 0;
		}
		
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			aux[(arr[i] - 'a')]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(aux[(arr[i] - 'a')] == 1) {
				return arr[i];
			}
		}
		
		return ' ';
	}
	
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

		System.out.println(UniqueCharacter.findFirstUniqueChar("teetotal"));
		System.out.println(UniqueCharacter.usingArray("teetotal"));
		
		System.out.println(UniqueCharacter.findFirstUniqueChar("abcabcd"));
		System.out.println(UniqueCharacter.usingArray("abcabcd"));
		
		System.out.println(UniqueCharacter.findFirstUniqueChar("aaaaaa"));
		System.out.println(UniqueCharacter.usingArray("aaaaaa"));
	}

}
