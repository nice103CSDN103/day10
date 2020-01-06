package com.zhiyou100;

public class Demo2_Arrymaopao {
	// 数组排序 ：冒泡排序

	public static void main(String[] args) {
		// 数组排序 ：从小到大
		int[] arr = { 6, 5, 4, 3, 2, 1  }; // 1 2 3 4 5 6
		// 取最大值
		// int max = arr[0] ;
		System.out.println("--------888888888888-----");
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				// 判断 前一个数 和后一个数的大小
				if (arr[i] < arr[i + 1]) {
					// 前一个数 比 后一个数 大
					// 二者交换位置
					// max = arr[i] ;
					// 定义临时变量存储 前一个数
					int temp = arr[i];
					arr[i] = arr[i + 1];
					// 后一个数被临时变量中赋值
					arr[i + 1] = temp;

				}
				//System.out.println(arr[j]);
			}
		}
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
		}

		/*
		 * int a = 1 ; int b = 2 ; 
		 * // 先把 a 赋值给临时变量 int temp = a ; 
		 * // temp = 1 a = b ; 
		 * //
		 * a = 2 b = temp ; // b = 1
		 */

	}
}
