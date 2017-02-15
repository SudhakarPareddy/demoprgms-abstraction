package com.psrdemo.prgms.abstraction.inheritance;

public class MainClassInheritance {
	
	private static final String POLYMORPHISMINPLAY = " Polymorphism in play ";
	private static final String POLYMORPHISMNOTINPLAY = " Polymorphism not in play ";
	
	private static final String UPCASTING = " upcasting to ";
	private static final String NOUPCASTING = " no upcasting ";

	public static void main(String[] args) {
		
		A aClass = new A(); B bClass = new B(); C cClass = new C();
		A abClass = getInstanceB(); 
		A acClass = getInstanceC();
		B bcClass = getInstanceC();

		// run time polymorphism
		aClass.simpleMethod(" Called " + NOUPCASTING + POLYMORPHISMNOTINPLAY); // run time polymorphism not in play
		bClass.simpleMethod("Called "+ NOUPCASTING + POLYMORPHISMNOTINPLAY); // run time polymorphism not in play
		cClass.simpleMethod("Called "+ NOUPCASTING + POLYMORPHISMNOTINPLAY); // run time polymorphism not in play
		
		abClass.simpleMethod("Called "+  "A" + UPCASTING + "B" + POLYMORPHISMINPLAY);
		acClass.simpleMethod("Called "+ "A" + UPCASTING + "C" + POLYMORPHISMINPLAY);
		bcClass.simpleMethod("Called "+ "B" + UPCASTING + "C" + POLYMORPHISMINPLAY);
		
		System.out.println(aClass.abc + NOUPCASTING + POLYMORPHISMNOTINPLAY); // no runtime polymorphism for member variables
		System.out.println(bClass.abc + NOUPCASTING + POLYMORPHISMNOTINPLAY); // no runtime polymorphism for member variables
		System.out.println(cClass.abc + NOUPCASTING + POLYMORPHISMNOTINPLAY); // no runtime polymorphism for member variables
		System.out.println(abClass.abc + "A" + UPCASTING + "B" + POLYMORPHISMNOTINPLAY); // no runtime polymorphism for member variables
		System.out.println(acClass.abc + "A" + UPCASTING + "C" + POLYMORPHISMNOTINPLAY); // no runtime ploymorphism for member variables
		System.out.println(bcClass.abc + "B" + UPCASTING + "C" + POLYMORPHISMNOTINPLAY); // no runtime ploymorphism for member variables
	}
	
	private static A getInstanceA() {
		return new A();
	}
	private static B getInstanceB() {
		return new B();
	}
	private static C getInstanceC() {
		return new C();
	}

}
