package com.rohit.oops;

class A{
	public static void method1(){
		System.out.println("A.method1");
	}
	public  void method2(){
		System.out.println("A.method2");
	}
}

class B extends A{
	public static void method1(){
		System.out.println("B.method1");
	}
	public  void method2(){
		System.out.println("B.method2");
	}
}

public class StaticEx2 {
	

	public static void main(String arg[]){
		A a = new B();
		a.method1();
		a.method2();
		
		B b = new B();
		b.method1();
		b.method2();
	}
}
