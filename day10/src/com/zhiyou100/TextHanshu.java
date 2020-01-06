package com.zhiyou100;

public class TextHanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法:
		//设计方法：将给定的数组排序
		/*
		 * 方法的结构：
		 *  访问修饰符  static 返回值  方法名(数据类型  参数名){
		 *  	执行的语句......；
		 *  
		 *  
		 *  }
		 */
		//调用方法
		Print1();//无参调用
		Print2(5,6);//有参调用
		Print4_max(5);
		
		Print3_mi(8,2);
		
		testReturn();
		
		double d = Print5(5);
		System.out.println("将给定的数字放大10倍，并返回    "+d);
	}
	public static void Print1() {
		System.out.println("Hello World !");
		//加法
		/*int sum = a + b ;
		System.out.println(sum);
		System.out.println(a + b);*/
	}
	public static void Print2(int a , int b ) {
		//System.out.println("Hello World !");
		//加法
		int sum = a + b ;
		System.out.println(sum);
		System.out.println(a + b);
	}
	//设计方法：求某个数的某次幂
	/*
	 * 参数a ：整数的底数
	 * 参数吧 ： 整型的次幂
	 */
	
	public static void Print3_mi(int a , int m ) {
		int result = a ;
		if(m == 1) {
			result = a ;
		}
		for(int i = 1 ; i < m ; i ++) {
			
			result = result*a ;
		}
		
		
		System.out.println("求某个数的某次幂"+result);
		
	}
	//设计方法：将给定的数字放大10倍，并返回
	public static double Print4_max(double num) {
		num = num * 10 ;
		return num ;
		
		//System.out.println("Hello World !");
		
	}
	/*
	 * 有返回值的方法调用
	 * 数据类型 变量 = 方法名(实参);
	 */
	public static double Print5(double i ) {
		i = i * 10 ;
		return i ;
		//System.out.println("Hello World !");
		
	}
	public static void testReturn( ) {
		
		System.out.println("Hello World ! 前 ");
		return ;
		//System.out.println("Hello Worl后");
	}
}
