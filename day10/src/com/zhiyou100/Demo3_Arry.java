package com.zhiyou100;

public class Demo3_Arry {
	public static void main(String[] args) {
		int[] arr = { 6, 5, 4, 3, 2, 1  };
		/*
		for(int i = 0 ; i < arr.length- 1 ; i ++) {
			for(int j = 0 ; j < arr.length-1-i ; j ++) {
				if(arr[i]<arr[i+1]) {
				int temp = 0 ;
				temp = arr[i+1];
				arr[i] = arr[i+1];
				arr[i+1] = temp ;
					
				}
				
			}
			
		}
		*/
		for(int i = 0 ; i < arr.length-1 ; i ++) {
			for(int j = 0 ; j < arr.length-1-i ; j ++) {
				if(arr[i]<arr[i+1]) {
				int temp = 0 ;
				temp = arr[i+1];
				arr[i] = arr[i+1];
				arr[i+1] = temp ;
					
				}
				
			}
			
		}
		
		
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
			
		}
	}
}
