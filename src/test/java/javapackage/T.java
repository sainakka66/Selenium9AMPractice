package javapackage;

public class T {
	
	int a = 100;
	int b = 200;
	
	static int c = 1000;
	static int d = 2000;
	
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(T.c);
		System.out.println(T.d);
	}
	public static void main(String[] args) {
		T m = new T();
		System.out.println(m.a);
		System.out.println(m.b);
		
		System.out.println(T.c);
		System.out.println(T.d);
		
		m.m1(); 
	}

}
