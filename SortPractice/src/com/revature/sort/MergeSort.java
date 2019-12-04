package com.revature.sort;

public class MergeSort {
	
	public static void sort(int[] arr) {
		int middle = (arr.length/2);
		int [] leftSide = new int [middle];
		int [] rightSide = new int [arr.length - middle];
		
		if(arr.length < 2) {
			return;
		}
		
		for(int i = 0; i < middle; i++) {
			leftSide[i] = arr[i];
		}
		
		for(int j = middle; j < arr.length - 1; j++) {
			rightSide[j] = arr[j];
		}
		
		sort(leftSide);
		sort(rightSide);
		
		merge(arr, leftSide, rightSide);
	}
	
	private static void merge(int[] arr, int[] left, int[] right) {
		int x = 0;
		int y = 0;
		
		while(x < left.length && y < right.length) {
			if(left[x] < right[y]) {
				//Left off here
			}
			
		}
	}
}
