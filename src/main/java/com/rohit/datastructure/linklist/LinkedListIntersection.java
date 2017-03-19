package com.rohit.datastructure.linklist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListIntersection {
	
	public static Node  insert(Node node, Node newNode){
		if(node==null){
			return newNode;
		}else{
			Node nodeIterator = node;
			while(nodeIterator.getNextNode()!=null){
				nodeIterator = nodeIterator.getNextNode();
			}
			nodeIterator.setNextNode(newNode);
		}
		return node;
	}
	
	public static Node findIntersection(Node firstHead,Node secondHead){
		
		Set<Node> nodeSet = new HashSet<Node>();
		if(firstHead==null || secondHead==null){
			return null;
		}else{
			while(firstHead!=null || secondHead!=null){
				if(nodeSet.contains(firstHead) ){
					return firstHead;
				}else{
					nodeSet.add(firstHead);
				}
				if(nodeSet.contains(secondHead)){
					return  secondHead;
				}else{
					nodeSet.add(secondHead);
				}
				firstHead = firstHead.getNextNode();
				secondHead = secondHead.getNextNode();
			}
		}
		return null;
	}
	
	public static void printList(Node head){
		if(head==null){
			System.out.println("List is empty");
		}
		while(head!=null){
			System.out.println(head.getData());
			head= head.getNextNode();
		}
	}
	public static void main(String arg[]){
		
		
		System.out.println("First Linked List");
		Node firsthead = new Node(3, null);
		insert(firsthead, new Node(5, null));
		insert(firsthead, new Node(8, null));
		Node instersectionNode = new Node(9, null);
		insert(firsthead, instersectionNode);
		insert(firsthead, new Node(10, null));
		insert(firsthead, new Node(14, null));
		insert(firsthead, new Node(20, null));
		insert(firsthead, new Node(30, null));
		insert(firsthead, new Node(35, null));
		insert(firsthead, new Node(60, null));
		printList(firsthead);
		
		System.out.println("First Linked List");
		Node secondHead = new Node(1, null);
		insert(secondHead, new Node(4, null));
		insert(secondHead, new Node(6, null));
		insert(secondHead, instersectionNode);
		insert(secondHead, new Node(12, null));
		insert(secondHead, new Node(15, null));
		insert(secondHead, new Node(21, null));
		insert(secondHead, new Node(32, null));
		insert(secondHead, new Node(36, null));
		insert(secondHead, new Node(50, null));
		printList(secondHead);

		System.out.println("");
		System.out.println("Intersection Point: "+findIntersection(firsthead,secondHead).getData());
		
	}

}
