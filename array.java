
/*
 *功能：数组的·基本使用
 *
 */
package su;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		// TODO Auto-generate method stub
		//定义数组
//		float arr_A[];
//		int[] arr_B;
//		//数组的初始化
//		int [] arr_C= {1,2,3,5};
//		System.out.println("数组C的长度="+arr_C.length);
//		//
//		arr_A=new float[5];
//		for(int i=0;i<arr_A.length;i++) {
//			System.out.println(arr_A[i]);
//			
//		}
		//系统提供的默认值时，整形（int，long,byte）：0；浮点型（float,double）：0.0;字符（char,）： （空）；
		//布尔(boolean)：false;数组元素访问
		//定义一个数组D，利用new关键字给数组D分配10个存整数的空间，每一个数组元素为0.
		/*int[] arr_D=new int[10];
		System.out.println("数组中D的元素值：");
		for(int i=0;i<arr_D.length;i++) {
			System.out.println(arr_D[i]);
		}*/
//		boolean[] arr_D=new boolean[10];
//		System.out.println("数组中D的元素值：");
//		for(int i=0;i<arr_D.length;i++) {
//			System.out.println(arr_D[i]);
//		}
//		char[] arr_D=new char[10];
//		System.out.println("数组中D的元素值：");
//		for(int i=0;i<arr_D.length;i++) {
//			System.out.println(arr_D[i]);
//		}
//		float[] arr_D=new float[10];
//		System.out.println("数组中D的元素值：");
//		for(int i=0;i<arr_D.length;i++) {
//			System.out.println(arr_D[i]);
//		}
	
//		int[] arr_D=new int[10];int a=0;
//		System.out.println("给数组输入"+arr_D.length+"个整形数据");
//		Scanner x=new Scanner(System.in);
//		for(int i=0;i<arr_D.length;i++) {
//			arr_D[i]=x.nextInt();
//		}
//		System.out.println("数组中D的元素值：");
//		for(int i=0;i<arr_D.length;i++) {
//			System.out.println(arr_D[i]);
//		}
		//JDK1.5以上支持的增量for
		//for(类型 变量：数组名){}
//		System.out.println("1345sbaf6");
//		for (int value:arr_D) {
//			System.out.println(value+" hSDB");
//		}
//		//将数组逆置
//		int z=0;
//		for(int j=arr_D.length-1,i=0;i<j;i++,j--) {
//			z=arr_D[i];
//			arr_D[i]=arr_D[j];
//			arr_D[j]=z;
//		}
//		for(int i=0;i<=arr_D.length;i++) {
//			System.out.println(arr_D[i]);
//		}
		//课外作业：利用数组实现斐波拉数列：1,1,2,3,5,8,13....
		int n=0;
		System.out.println("请输入元素个数：");
		Scanner fbs=new Scanner(System.in);
		n=fbs.nextInt();
		int f=0;int[] arr_F=new int[n];
		Scanner fb=new Scanner(System.in);
		System.out.println("请输入初始值：");
		f=fb.nextInt();
		arr_F[0]=f;
		if(n>0) {
		for(int i=1;i<=n-1;i++) {
			if(i>=2) {
				arr_F[i]=arr_F[i-2]+arr_F[i-1];
			}
			else if(i<2) {
				arr_F[i]=arr_F[i-1];
			}
		}
		for(int i=0;i<=arr_F.length-1;i++) {
			System.out.println(arr_F[i]);
		}
		}
		else {
			System.out.println("元素个数输入错误，程序退出！");
		}
		
	}

}
//这是增加的内容！
//add master test.txt
