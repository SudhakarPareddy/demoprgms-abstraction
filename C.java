package com.psrdemo.prgms.abstraction.inheritance;

public class C extends B {
	
	String abc=" i am from ClassC ";
	
	public void simpleMethod(String x) {
		System.out.println("ClassC: methodABC "+x);
	}
	
	public void methodSuper() {
		System.out.print("ClassC: methodSuper super.referancevar : "+super.abc);
		System.out.print("ClassC: methodSuper super.super.referancevar : "); super.methodSuper();
	}
}
