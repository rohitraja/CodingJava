package com.rohit.datastructure.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rohit.datastructure.linklist.LinkedListDS2;
import com.rohit.datastructure.linklist.Node;

public class LinkedListDS2Test {
	
	@Test
	public void testLengthByRecuration(){
		LinkedListDS2 list = new LinkedListDS2();
		assertEquals(0,list.lengthByRecuration());
		list.insertAtEnd(new Node(1,null));
		assertEquals(1,list.lengthByRecuration());
		list.insertAtEnd(new Node(2,null));
		list.insertAtEnd(new Node(3,null));
		list.insertAtEnd(new Node(4,null));
		list.insertAtEnd(new Node(5,null));
		list.insertAtEnd(new Node(6,null));
		list.insertAtEnd(new Node(7,null));
		list.insertAtEnd(new Node(8,null));
		assertEquals(8,list.lengthByRecuration());

	}
	
	@Test
	public void testDeleteKeyAtPosition(){
		LinkedListDS2 list = new LinkedListDS2();
		list.insertAtEnd(new Node(1,null));
		list.insertAtEnd(new Node(2,null));
		list.insertAtEnd(new Node(3,null));
		list.insertAtEnd(new Node(4,null));
		assertEquals(true, list.deleteKeyAtPosition(1));
		assertEquals(3,list.lengthByRecuration());
		assertEquals(false, list.deleteKeyAtPosition(4));
		assertEquals(3,list.lengthByRecuration());
		assertEquals(true, list.deleteKeyAtPosition(3));
		assertEquals(2,list.lengthByRecuration());
		assertEquals(true, list.deleteKeyAtPosition(1));
		assertEquals(1,list.lengthByRecuration());
		assertEquals(true, list.deleteKeyAtPosition(1));
		assertEquals(0,list.lengthByRecuration());
		assertEquals(false, list.deleteKeyAtPosition(10));


		

		
	}

}
