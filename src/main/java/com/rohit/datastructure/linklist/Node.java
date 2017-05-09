package com.rohit.datastructure.linklist;

public class Node {
	
	private Integer data;
	private Node nextNode;
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node(Integer data, Node nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}
	

}
