package com.zhiyou100;

public class Demo5_ArryUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//设计一个方法，求数组的和
		int[] arr1 = {1,2,5,4,8};
		
		int sum = arrySum(arr1);// 声明，并赋值
		System.out.println("数组中最大的数是 ："+sum);
		
		System.out.println("排序前  ：");
		printArry(arr1);
		//调用方法，求数组的和
	
		int[] arr2 = arryPaixu(arr1); 
		
		/*System.out.println("排序前  ：");
		printArry(arr1);*/
		// ----
		
		
		//设计遍历方法
		System.out.println("排序后  ：");
		printArry(arr2);
		
		
	}
	/*public static int arrySum(int[] arr) {
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i ++) {
			sum = sum + arr[i] ;
		}
		return sum ;
	}*/
	public static int arrySum(int[] arr) {
		int max = arr[1] ;
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] > max) {
				max = arr[i] ;
			}
		}
		return max ;
	}
	public static int[] arryPaixu(int[] arr) {
		for(int i = 0 ; i < arr.length - 1 ; i ++) {
			for(int j = 0 ; j < arr.length-1-i ; j ++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr ;
		
		
	}
	public static void printArry(int[] arr) {
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	
	}

}
