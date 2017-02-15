package com.rohit.datastructure.linklist;

public class LinkedListDS {
	
	public static void PrintLinkedList(Node head){
		
		if(head==null){
			System.out.println("List is empty");
			return;
		}else{
			while(head!=null){
				System.out.println(head.getData());
				head=head.getNextNode();
			}
		}
	}
	
	public static Node insertFront(Node head,Node newNode){

		if(newNode==null){
			System.out.println("newNode null condition");
			return head;
		}
		if(head==null){
			System.out.println("head null condition");
			return newNode;
		}else{
			System.out.println("set as head condition");
			newNode.setNextNode(head);
			return newNode;
		}
	}
	
	public static Node insertEnd(Node head,Node newNode){
		if(newNode==null){
			return head;
		}
		if(head==null){
			return newNode;
		}else{
			Node nodeIterator = head;
			while(nodeIterator.getNextNode()!=null){
				nodeIterator = nodeIterator.getNextNode();
			}
			nodeIterator.setNextNode(newNode);
		}
		return newNode;
	}
	
	public static Node insertAfter(Node head,Node insertAfterNode,Node newNode){
		if(head==null || newNode==null){
			return head;
		}else{
			Node iteratorNode = head;
			while(iteratorNode!=insertAfterNode && iteratorNode!=null){
				iteratorNode = iteratorNode.getNextNode();
			}
			if(iteratorNode==null){
				System.out.println("Node not found");
			}else{
				newNode.setNextNode(iteratorNode.getNextNode());
				iteratorNode.setNextNode(newNode);
			}
		}
		return head;
	}
	public static void main(String arg[]){
		
		Node head = new Node(8, null);
		insertEnd(head, new Node(5, null));
		Node node7 = new Node(7, null);
		insertEnd(head, node7);
		insertEnd(head, new Node(9, null));
		insertEnd(head, new Node(1, null));
		
		PrintLinkedList(head);
		System.out.println("Insertion at head");
		PrintLinkedList(insertFront(head, new Node(2, null)));

		System.out.println("Insert at");
		insertAfter(head, node7, new Node(18, null));
		PrintLinkedList(head);

	}
}
