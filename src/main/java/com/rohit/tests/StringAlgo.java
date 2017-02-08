package com.rohit.tests;

public class StringAlgo {
	
	public static String reverseWordsOfSentence(String sentence){
		String resultString ="";
		int start,end;
		
		start= end = sentence.length()-1;
		for(int i=sentence.length()-1;i>=0;i--){
			if(' '==sentence.charAt(i) || i==0){
				resultString = resultString+sentence.substring(i, end+1)+" ";
				end = i;
			}
		}
		
		return resultString;
	}
	
	public static void main(String arg[]){
		
		System.out.println(reverseWordsOfSentence("I have a great day ahead"));
		
	}

}
