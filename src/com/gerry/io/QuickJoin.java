package com.gerry.io;

public class QuickJoin implements DynamicFind {

	int[] array = new int[10];
	
	QuickJoin(){
		for(int i=0;i<10;i++){
			array[i] = (i);
		}
	}
	
	public int root(int i){
		while(array[i]!=i){
			i = array[i];
		}
		return i;
	}
	
	@Override
	public boolean isConnected(int i, int j) {
		return root(i) == root(j);
	}
	
	public void printArray(){
		for(int i=0;i<10;i++){
			System.out.print(i +  "-->" + array[i] + " ");
		}
	 }
	
	@Override
	public void join(int i, int j) {
		int finalRoot = root(i);
		array[root(j)] = finalRoot;
	}
	public static void main(String[] args) {
		QuickJoin test = new QuickJoin();
		test.printArray();
		System.out.println("test.isConnected(5, 7) --> " + test.isConnected(5, 7));
		test.join(5, 7);
		System.out.println("Joining (5, 7) --> ");
		System.out.println("test.isConnected(5, 7) --> " + test.isConnected(5, 7));
		test.printArray();
		test.join(0, 5);
		System.out.println("Joining (0, 5) --> ");
		System.out.println("test.isConnected(0, 5) --> " + test.isConnected(0, 5));
		test.printArray();
		test.join(1, 7);
		System.out.println("Joining (1, 7) --> ");
		System.out.println("test.isConnected(1, 7) --> " + test.isConnected(1,7));
		test.isConnected(2,0);
		test.printArray();
	}
}
