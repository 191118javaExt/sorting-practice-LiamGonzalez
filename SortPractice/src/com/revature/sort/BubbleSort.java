package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		
		
		int n = arr.length; 
		for(int i = 0; i < n - 1; i++) {
			for(int j=1; j < n-i-1; j++ ) {
				int a = arr[j];
				if(arr[j] > arr[j-1]) {
					
					arr[j] = arr[j-1];
					arr[j-1] = a;
				}
			}
			}
		}
	}

