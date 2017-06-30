package com.gerry.stacksandqueues;

public class MyStack implements Stack{

	public static class Node{
		Node next;
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		String item;
	}
	
	private Node first = null;
	@Override
	public void push(String item){
		Node oldNode = first;
		first = new Node();
		first.setItem(item);
		first.next = oldNode;
	}
	@Override
	public String pop(){
		String item = first.item;
		first = first.getNext();
		return item;
	}
	@Override
	public boolean isEmpty(){
		return first == null;
		
	}
	
	
}
