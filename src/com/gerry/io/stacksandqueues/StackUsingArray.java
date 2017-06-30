package com.gerry.stacksandqueues;

public class StackUsingArray implements Stack {

	String[] stack = new String[12];
	int currentPointer = 0;

	@Override
	public boolean isEmpty() {
		return stack.length == 0;
	}

	@Override
	public void push(String item) {
		stack[++currentPointer] = item;
		
	}

	@Override
	public String pop() {
		String item = stack[currentPointer--];
		stack[currentPointer+1] = null;
		return item;
		
	}
}
