package com.rohit.tests;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * Write a function to determine whether two strings passed to the function are anagrams(In O(N) time complexity or less)
 * Example 1: "act" and "cat" are anagram of each other 
 */
public class Anagram {
	
	
	public static HashMap<Character, Integer> hashMapOfString(String str){
		HashMap<Character, Integer> stringMap = new HashMap<>();
		int i=0;
		while(i<str.length()){
			
			if(stringMap.containsKey(str.charAt(i))){
				stringMap.put(str.charAt(i), stringMap.get(str.charAt(i))+1);
				System.out.println(stringMap.get(str.charAt(i)));
			}else{
				stringMap.put(str.charAt(i), 1);
			}
			i++;
		}
		return stringMap;
	}
	
	public static boolean compareHashMap(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
		
		if(map1.size()!=map2.size()){
			return false;
		}else{
			for(Entry<Character, Integer> entry : map1.entrySet()){
				if(entry.getValue()!=map2.get(entry.getKey())){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String arg[]){
		
		System.out.println(compareHashMap(hashMapOfString("bat"),hashMapOfString("tac")));
		
	}

}
