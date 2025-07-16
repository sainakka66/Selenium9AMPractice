package OOPs;
//MULTI-LEVEL INHERITANCE:

class A
{
	void m1()
	{
		System.out.println(" HELLO! Sai Nakka");
	}
}

class B extends A
{
	 void m2()
	{
		System.out.println(" HEY! There");
	}
}



public class Test1 extends B{
	
		void m3()
		{
			System.out.println(" HEY!! ALL OF YOU");
		}

	public static void main(String[] args) 
	{
		
		A obj = new A();
		obj.m1();
		
		B ob = new B();
		ob.m2();
		ob.m1();
		
		Test1 obj1 = new Test1();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		
		
	}

}
