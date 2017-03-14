package com.rohit.datastructure.linklist;

public class LinkedListDS2 {
	
	private Node head;
	
	
	
	public LinkedListDS2() {
		super();
		this.head = null;
	}

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
	
	public void insertAtHead(Node newElement){
		
		if(this.head==null){
			this.head =newElement;
			return;
		}else{
			newElement.setNextNode(this.head);
			this.head = newElement;
		}
	}

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
	
	public void printList(){
		
		System.out.print("[ ");
		Node iterator = this.head;
		while(iterator!=null){
			System.out.print(iterator.getData()+" ");
			iterator = iterator.getNextNode();
		}
		System.out.print("]");
	}
	
	public static void main(String arg[]){
		
		LinkedListDS2 list = new LinkedListDS2();
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
		list.printList();

		
		
	}
	
	
}
