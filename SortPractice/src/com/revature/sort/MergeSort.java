package com.revature.sort;

public class MergeSort {
	
	public static void sort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int middle = (arr.length/2);
		int [] leftSide = new int[middle];
		int [] rightSide = new int [arr.length - middle];
		
		for (int i = 0; i<middle; i++) {
			leftSide[i] = arr[i];
		}
		for (int i = middle; i<arr.length; i++) {
			rightSide[i-middle] = arr[i];
		}
		
		sort(leftSide);
		sort(rightSide);
		
		merge(arr, leftSide, rightSide);
	}
	
	private static void merge(int[] arr, int[] left, int[] right) {
		int x = 0;
		int y = 0;
		
		
		while(x < right.length && y < left.length) {
			if(left[y] < right[x]) {
				arr[y+x] = left[y];
				y++;
			}
			else
			{
				arr[y+x] = right[x];
				x++;
			}
			
		}
		
		for(; y < left.length; y++) {
			arr[y+x] = left[y];
		}
		
		for(; x < right.length; x++) {
			arr[y+x] = right[x];
		}
		
	}
}