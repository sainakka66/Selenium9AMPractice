package OOPs;

//Abstract class && Method

abstract class Abc 
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("This is M4");
	}
}

public class Test5 extends Abc{
	
	void m1()
	{
		System.out.println("This is M1");
	}
	
	void m2()
	{
		System.out.println("This is M2");
	}
	
	void m3()
	{
		System.out.println("This is M3");
	}

	public static void main(String[] args) 
	{
		
		Test5 ob = new Test5();
		ob.m4();
		ob.m3();
		ob.m2();
		ob.m1();
		
	}

}
