package com.psrdemo.prgms.abstraction.inheritance;

public class B extends A {

	String abc=" i am from ClassB ";
	
	public void simpleMethod(String abc) {
		System.out.println("ClassB: methodABC "+abc);
	}
	
	public void methodSuper() {
		System.out.println("ClassB: methodSuper super.referancevar "+ super.abc);
	}
}
