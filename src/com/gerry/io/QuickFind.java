package com.gerry.io;

public class QuickFind implements DynamicFind {

	int[] array = new int[10];
	
	QuickFind(){
		for(int i=0;i<10;i++){
			array[i] = (i);
		}
	}
	public boolean isConnected(int i, int j){
		return (array[i] == array[j]);
	}
	public void printArray(){
		for(int i=0;i<10;i++){
			System.out.println(array[i]);
		}
	}
	public void join(int i, int j){
		int firstNum = array[i];
		int secondNum = array[j];
		for(int j1=0;j1<10;j1++){
			if(array[j1] == secondNum){
				array[j1] = firstNum;
			}
		}
	}
	
	public static void main(String[] args) {
		QuickFind test = new QuickFind();
		test.printArray();
		System.out.println("test.isConnected(5, 7) --> " + test.isConnected(5, 7));
		test.join(5, 7);
		System.out.println("test.join(5, 7) --> ");
		test.join(0, 5);
		System.out.println("test.isConnected(5, 7) --> " + test.isConnected(5, 7));
		test.printArray();
	}
}