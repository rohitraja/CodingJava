package com.rohit.tests;

import java.util.ArrayList;
import java.util.Hashtable;

public class TestClass {
	
	final ArrayList<Integer> finalList = new ArrayList<>() ;
	
	
	public void addElementToList(ArrayList<Integer> list){
		list.add(32);
	}

	public static void main(String arg[]){
		
		
/*		TestClass list =new TestClass();
		list.finalList.add(23);
		System.out.println(list.finalList);
		
		list.addElementToList(list.finalList);
		
		System.out.println(list.finalList);*/
		
		Hashtable<String, String> testhash = new Hashtable<>();
		testhash.put("1", "1");
		testhash.put("1", "2");
		System.out.println("completed");
		
	}
}
