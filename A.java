package com.psrdemo.prgms.abstraction.inheritance;

public class A {

	String abc=" i am from ClassA ";
	
	public void simpleMethod(String abc) {
		System.out.println("ClassA: methodABC "+abc);
	}
	
	public void methodSuper() {
		System.out.println("ClassA: methodSuper this.referancevar "+ super.toString() + this.abc);
	}
}
