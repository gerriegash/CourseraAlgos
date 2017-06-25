package com.gerry.io;

public class WeightedQuickJoin implements DynamicFind {

	int[] array = new int[10];
	int[] sizeArray = new int[]{1,1,1,1,1,1,1,1,1,1};

	public WeightedQuickJoin() {
		for(int i=0;i<10;i++){
			array[i] = (i);
		}
	}
	
	public int root(int i){
		while(array[i]!=i){
			//Flatting out even more
			array[i] = array[array[i]];
			i = array[i];
		}
//		if(sizeArray[i]!=1)
//		sizeArray[i]+= noOfElements;
	return i;
	}
	
	@Override
	public boolean isConnected(int i, int j) {
		return root(i) == root(j);
	}
	
	public void printArray(){
		for(int i=0;i<10;i++){
			System.out.print("Values -->"+i +  "-->" + array[i] + " ");
		}
			System.out.println("");
		for(int i=0;i<10;i++){
			System.out.print("Size -->" + i +  "-->" + sizeArray[i] + " ");
		}
		System.out.println("");
	 }
	
	@Override
	public void join(int i, int j) {
		if(isConnected(i,j)){
			return;
		}
		int rootOfI = root(i);
		int rootOfJ = root(j);
		int sizeOfI = sizeArray[rootOfI];
		int sizeOfJ = sizeArray[rootOfJ];
		if(sizeOfI < sizeOfJ){
			System.out.println("since size "+ sizeOfI + " of " + i + " is less than size " + sizeOfJ +" of "  + j + " , so changing the root of " + i);
			int finalRoot = rootOfJ;
			array[rootOfI] = finalRoot;
			sizeArray[rootOfJ]+=sizeArray[rootOfI];
		} else{
			System.out.println("since size "+ sizeOfJ + " of " + j + " is less than size " + sizeOfI +" of " + i + " , so changing the root of " + j);
			int finalRoot = rootOfI;
			array[rootOfJ] = finalRoot;
			sizeArray[rootOfI]+=sizeArray[rootOfJ];
		}
		
	}
	public static void main(String[] args) {
		WeightedQuickJoin test = new WeightedQuickJoin();
		test.printArray();
		test.join(4,3);
		System.out.println("Joining (4,3) --> ");
//		System.out.println("test.isConnected(5, 7) --> " + test.isConnected(5, 7));
		test.printArray();
		test.join(3,8);
		System.out.println("Joining (3,8) --> ");
//		System.out.println("test.isConnected(0, 5) --> " + test.isConnected(0, 5));
//		test.printArray(
		test.printArray();
		test.join(6,5);
		System.out.println("Joining (6,5) --> ");
//		System.out.println("test.isConnected(9, 7) --> " + test.isConnected(9,7));
		test.printArray();
		test.join(9,4);
		System.out.println("Joining (9,4) --> ");
//		System.out.println("test.isConnected(6,8) --> " + test.isConnected(6,8));
		test.printArray();
		test.join(2,1);
		System.out.println("Joining (2,1) --> ");
//		System.out.println("test.isConnected(2,8) --> " + test.isConnected(2,8));
		test.printArray();
		test.join(5,0);
		System.out.println("Joining (5,0) --> ");
		test.printArray();
		test.join(7,2);
		System.out.println("Joining (7,2) --> ");
//		System.out.println("test.isConnected(5,0) --> " + test.isConnected(2,8));
		test.printArray();
		test.join(6,1);
		System.out.println("Joining (6,1) --> ");
//		System.out.println("test.isConnected(6,1) --> " + test.isConnected(2,8));
		test.printArray();
		test.join(7,3);
		System.out.println("Joining (7,3) --> ");
//		System.out.println("test.isConnected(2,8) --> " + test.isConnected(2,8));
		test.printArray();
	}
}
