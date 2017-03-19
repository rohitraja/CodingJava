package com.rohit.datastructure.linklist;


/**
 * @author Rohit Raja
 * Linklist implementation
 *
 */
public class LinkedListDS2 {
	
	private Node head;
	
	
	
	public LinkedListDS2() {
		super();
		this.head = null;
	}

	/*
	 * Insert at end.
	 */
	public void insertAtEnd(Node newElement){
		
		if(this.head==null){
			this.head =newElement;
			return;
		}else{
			Node iterator = new Node();
			iterator=this.head;
			while(iterator.getNextNode()!=null){
				iterator = iterator.getNextNode();
			}
			iterator.setNextNode(newElement);
		}
	}
	
	/*
	 * Insert the done at head
	 */
	public void insertAtHead(Node newElement){
		
		if(this.head==null){
			this.head =newElement;
			return;
		}else{
			newElement.setNextNode(this.head);
			this.head = newElement;
		}
	}

	/*
	 * Delete the node at the end
	 */
	public void deleteAtEnd(){
		
		if(this.head==null){
			return;
		}else if(this.head.getNextNode()==null){
			this.head =null;
		}else{
			Node iterator = new Node();
			iterator = this.head;
			while(iterator.getNextNode().getNextNode()!=null){
				iterator = iterator.getNextNode();
			}
			iterator.setNextNode(null);
		}
	}
	
	/*
	 * Delete the Head Node
	 */
	public void delteAtHead(){
		if(this.head==null){
			return;
		}else if(this.head.getNextNode()==null){
			this.head = null;
		}else{
			
			Node iterator = new Node();
			iterator = this.head;
			this.head = this.head.getNextNode();
			iterator = null;
		}
	}
	
	/*
	 * Find the data and delete
	 */
	public void delete(Integer data){
		
		if(this.head==null){
			return;
		}else if(this.head.getData()== data){
			this.head =null;
		}else{
			Node iterator = new Node();
			iterator = this.head;
			while(iterator.getNextNode().getData()!=data && iterator!=null){
				iterator = iterator.getNextNode();
			}
			if(iterator==null){
				return;
			} if(iterator.getNextNode().getNextNode()==null){
				iterator.setNextNode(null);
			}else{
				iterator.setNextNode(iterator.getNextNode().getNextNode()); 
			}
		}
	}
	
	/*
	 * Find the node of given data
	 */
	public Node find(Integer data){
		Node iterator =null;
		if(this.head==null){
			return null;
		}else{
			iterator = new Node();
			while(iterator.getData()!=data || iterator.getNextNode()!=null ){
				iterator = iterator.getNextNode();
			}
		}
		return iterator;
	}
	
	/*
	 * Print the list
	 */
	public void printList(){
		
		System.out.print("[ ");
		Node iterator = this.head;
		while(iterator!=null){
			System.out.print(iterator.getData()+" ");
			iterator = iterator.getNextNode();
		}
		System.out.print("]");
	}
	
	/*
	 * @author: Rohit Raja 
	 * raper over lenghtByRecurtion()
	 */
	public int lengthByRecuration(){
		return lengthByRecuration(this.head);
	}
	private int lengthByRecuration(Node head){
		if(head==null){
			return 0;
		}
		else{
			return 1+lengthByRecuration(head.getNextNode());
		}
		
	}
	
	
	
	/*
	 * @auther Rohit Raja 
	 * Find the length of the list by recurstion method
	 */
	
	public Boolean deleteKeyAtPosition(Integer n){
		if(this.head==null){
			return false;
		}else if(n==1){
			this.head = this.head.getNextNode();
			return true;
		}else{
			Node iterator = new Node();
			iterator = this.head;
			if(this.lengthByRecuration()>=n){
				while(n>2){
					iterator= iterator.getNextNode();
					n--;
				}
				iterator.setNextNode(iterator.getNextNode().getNextNode());
				return true;
			}else{
				return false;
			}
		}
	}
	
	public static void main(String arg[]){
		
/*		LinkedListDS2 list = new LinkedListDS2();
		list.insertAtEnd(new Node(1, null));
		list.insertAtEnd(new Node(2, null));
		list.insertAtEnd(new Node(3, null));
		list.insertAtEnd(new Node(4, null));
		list.insertAtEnd(new Node(5, null));
		list.insertAtEnd(new Node(6, null));
		list.printList();
		list.insertAtHead(new Node(333, null));
		list.printList();
		list.deleteAtEnd();
		list.printList();
		list.delteAtHead();
		list.printList();
		list.delete(6);
		list.printList();*/
		
		LinkedListDS2 list = new LinkedListDS2();
		list.insertAtEnd(new Node(1,null));
		list.insertAtEnd(new Node(2,null));
		list.insertAtEnd(new Node(3,null));

		System.out.println(list.deleteKeyAtPosition(3));
		
		System.out.println(list.lengthByRecuration());

		
		
	}
	
	
}
