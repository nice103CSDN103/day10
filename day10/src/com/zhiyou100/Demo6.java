package com.zhiyou100;

import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自定义工具方法，
		int[] arr = {11,2,3,4} ;
		//利用数组工具类Arrays 打印数组
		
		/*Demo5_ArryUtil.arryPaixu(arr);
		Demo5_ArryUtil.printArry(arr);
		
		int sum = Demo5_ArryUtil.arrySum(arr);// 声明，并赋值
		System.out.println("数组中最大的数是 ："+sum);*/
		
		/*for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
		}*/
		
		//利用数组工具类Arrays  打印数组
		String toStr = Arrays.toString(arr);
		System.out.println(toStr);
		
		//排序
		Arrays.sort(arr) ;
		
		//重写打印数组，查看排序效果
		System.out.println(Arrays.toString(arr));
	}

}
