package javapackage;

public class Overrdng {

	void m1(int a)
	{
		System.out.println("int m1");
	}
	
	void m1(int a, int b)
	{
		System.out.println("int m1");
	}
	
	void m1(char c)
	{
		System.out.println("int m1");
	}
	
	public static void main(String[] args) {
		Overrdng obj = new Overrdng();
		obj.m1(10);
		obj.m1(10, 10);
		obj.m1('a');
	}

}
