package javapackage;

public class Method {   //Instance area
	int a  = 100;
	int b = 200;
	
	void m1() {
		System.out.println(a+b);
	}
	
	static void m2() {
		System.out.println("HELLO sai");
	}
	
	public static void main(String[] args) {
		Method m = new Method();
		System.out.println(m.a);
		System.out.println(m.b);
		
		m.m1(); // calling INSTANCE method
		Method.m2(); // calling STATIC method
	}

}
