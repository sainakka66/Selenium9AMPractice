package javapackage;

public class Test2 {
	
	static int a = 100;
	static int b = 120;
	
	void m1() {
		System.out.println(Test2.a);
		System.out.println(Test2.b);
	}
	public static void main(String[] args) {
		System.out.println(Test2.a);
		System.out.println(Test2.b);
		
		Test2 m = new Test2();
		m.m1();
	}

}
