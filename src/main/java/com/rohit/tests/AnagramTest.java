package com.rohit.tests;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
	
	@Test
	public void Test(){
		Assert.assertEquals(false, Anagram.compareHashMap(Anagram.hashMapOfString("bat"), Anagram.hashMapOfString("cat")));

	}
	
	@Test
	public void Testequals(){
		Assert.assertEquals(true, Anagram.compareHashMap(Anagram.hashMapOfString("tac"), Anagram.hashMapOfString("cat")));

	}

}
