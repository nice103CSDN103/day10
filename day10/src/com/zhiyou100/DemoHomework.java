package com.zhiyou100;

import java.util.Arrays;
import java.util.Scanner;

public class DemoHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("您想要创建长度为多长的数组？");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("您定义的数组长度是 ：" +a);
		int[] arr = new int[a] ;
		for(int i = 0 ; i < arr.length ; i ++ ) {
			System.out.println("请输入第 "+(i+1)+" 个元素");
			int b = sc.nextInt();
			arr[i] = b ;
		}
		/*String toStr = Arrays.toString[arr];
		System.out.println("您输入的数组是 : "+toStr);
		*/
		
		System.out.println("您输入的数组是 : ");
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.print(arr[i]+"  ");
			System.out.println();
		}
		loop:while(true) {
			System.out.println("请选择要对数组进行的操作 :");
			System.out.println("1:遍历数组 ");
			System.out.println("2:取出数组最大值 ");
			System.out.println("3:取出数组最小值 ");
			System.out.println("4:求数组和 ");
			System.out.println("5:结束程序 ");
			int c = sc.nextInt();
			if(c == 1) {
				System.out.println("您选择遍历数组: ");
				for(int i = 0 ; i < arr.length ; i ++) {
					System.out.println(arr[i]);
				}
				System.out.println();
				System.out.println("=================");
				print(arr);
			}
			if(c == 2) {
				System.out.println("您选择取出数组最大值: ");
				int max = arr[1] ;
				for(int i = 0 ; i < arr.length ; i ++) {
					if(arr[i] > max) {
						max = arr[i] ;
					}
				}
				System.out.println("最大值:"+max);
				System.out.println("=========*******=====");
				returnMax(arr);
			}
			if(c == 3) {
				System.out.println("您选择取出数组最小值: ");
				int min = arr[1] ;
				for(int i = 0 ; i < arr.length ; i ++) {
					if(arr[i] < min) {
						min = arr[i] ;
					}
				}
				System.out.println("最小值:"+min);
				System.out.println("=========*******=====");
				printMin(arr);
			}
			if(c == 4) {
				System.out.println("您选择求数组和: ");
				int sum = 0 ;
				for(int i = 0 ; i <= arr.length ; i ++) {
					sum = sum + i ;
				}
				System.out.println(sum);
				System.out.println("=========*******=====");
				printSum(arr);
			}
			if(c == 5) {
				System.out.print("程序已结束！");
				break loop ;
			}
		}
	}
	//遍历数组
	public static void print(int[] arr) {
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
		
	
	
	//取出数组最大值
	public static void returnMax(int[] arr) {
		int max = arr[1] ;
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] > max) {
				max = arr[i] ;
			}
		}
		System.out.println("最大值:"+max);
			
	}
	//取出数组最小值
	public static void printMin(int[] arr) {
		int min = arr[1] ;
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] < min) {
				min = arr[i] ;
			}
		}
		System.out.println("最小值:"+min);
			
	}
	//求数组和
	public static void printSum(int[] arr) {
		int sum = 0 ;
		for(int i = 0 ; i <= arr.length ; i ++) {
			sum = sum + i ;
		}
		System.out.println(sum);
			
	}
}


