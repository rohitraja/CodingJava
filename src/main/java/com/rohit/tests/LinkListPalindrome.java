package com.rohit.tests;


public class LinkListPalindrome {
	
	public static CharNode reverse(CharNode headNode){
		CharNode newHeadnode = null;
		CharNode tempHead =headNode; 
		while(tempHead!=null){

				CharNode tempNode = new CharNode();
				tempNode.setData(tempHead.getData());;
				tempNode.setNext(newHeadnode);
				newHeadnode = tempNode;
				tempHead=tempHead.getNext();
		}
		return newHeadnode;
	}
	
	public static void printList(CharNode headNode){
		if(headNode==null){
			System.out.println("List is empty");
			return;
		}else{
			CharNode tempNode = new CharNode();
			tempNode =headNode;
			while(tempNode!=null){
				System.out.println(tempNode.getData());
				tempNode= tempNode.getNext();
			}
		}
	}
	
	public static Boolean checkPalendrom(CharNode headNode, CharNode revercedHeadNode){
		
		CharNode headtraversalNode = headNode;
		CharNode reversetraversalNode = revercedHeadNode;

		if(headNode==null || revercedHeadNode==null ){
			return false;
		}

		while(headtraversalNode!=null & reversetraversalNode!=null){
			if(headtraversalNode.getData() != reversetraversalNode.getData())
				return false;
			
			
			headtraversalNode = headtraversalNode.getNext();
			reversetraversalNode = 		reversetraversalNode.getNext();
		}

		return true;
	}
	
	public static void main(String arg[]){
		
		CharNode headNode = new CharNode();
		headNode.setData('A');
		CharNode node2 = new CharNode();
		node2.setData('B');
		headNode.setNext(node2);
		CharNode node3 = new CharNode();
		node3.setData('C');
		node2.setNext(node3);
		CharNode node4 = new CharNode();
		node4.setData('C');
		node3.setNext(node4);
		CharNode node5 = new CharNode();
		node5.setData('B');
		node4.setNext(node5);
		CharNode node6 = new CharNode();
		node6.setData('A');
		node5.setNext(node6);

		printList(headNode);
		System.out.println("After reverse");
		
		printList(reverse(headNode));
		
		System.out.println("Is palendrom");
		System.out.println(checkPalendrom(headNode, reverse(headNode)));

	}

}
