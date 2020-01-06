package com.zhiyou100;

public class Demo1_Arry {
	// 测试dev分支上传文件

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//静态初始化
		int[] a = {2,4,5,7,1,3,6,10,9,8};
		//求数组中所有元素的和
		//把数组中元素一个一个加起来
		//得到每一个元素======> 遍历
		int sum = 0 ; //声明 和变量 ， 并赋初始值0//  必须赋初始值，否则不能使用
		for(int i = 0 ; i < a.length ; i ++) {
			sum = sum + a[i] ;
		}
		System.out.println("数组的和是 ："+sum);
		System.out.println("======================");
		//求最大值
		for(int i = 0 ; i < a.length - 1  ; i ++) {
			if(a[i] < a[i+1]) {
				int num = 0 ;
				num = a[i+1];
				a[i] = a[i+1];
				a[i+1] = num ;
			}
		}
		/*int max = a[0];
		for(int i = 0 ; i < a.length ; i ++) {
			if(a[i] > max) {
				max = a[i] ;
			}
		}
		System.out.println("最大值是"+max);*/
		//System.out.println("数组的和是 ："+a[a.length - 1]);
	}

}
