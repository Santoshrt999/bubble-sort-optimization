package com.graphs;

public class BubbleSort {
	
	void sort(int[] arr) {
		
    for(int i=0; i<arr.length; i++) {
    	
    	boolean swapped=false;
    	
    	//Assume the length to sort is n-1 and inside the bubble. and break out if not swapped/
    	for(int j=0; j<arr.length-1; j++) {
    		if(arr[j] > arr[j+1]) {
    			
    			int temp =arr[j+1];
    			arr[j+1]=arr[j];
    			arr[j]=temp;
    			swapped=true;
    		}
    	}
    	
    	
    	
    	if(!swapped)
    		break;
    	
    }
    
}
	
	
	void printArray(int[] arr){
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		
		int[] arr= { 7, 6, 2, 4, 1, 9, 3};
		
		bs.sort(arr);
		bs.printArray(arr);
	}

}
