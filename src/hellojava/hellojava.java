package hellojava;

import java.util.Scanner;

class hellojava{
	public static void main(String []avgs) {
		System.out.println("请输入一个[0~100]之间的分数：");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		if(a/10.0>=9)	System.out.println("A");
		else if(a/10.0>=8)	System.out.println("B");
		else if(a/10.0>=7)	System.out.println("C");
		else if(a/10.0>=6)	System.out.println("D");
		else 	System.out.println("E");
	}
	
}