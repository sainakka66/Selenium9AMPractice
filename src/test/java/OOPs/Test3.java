package OOPs;

// METHOD OVERLOADING

public class Test3 {
	
	void m1(int a)
	{
		System.out.println("The value is: " + a);
	}
	
	void m1(int a, int b)
	{
		System.out.println("The value is: " + a);
		System.out.println("The value is: " + b);
	}
	
	void m1(float a)
	{
		System.out.println("The value is: " + a);
	}

	public static void main(String[] args) 
	{
		
		Test3 ob = new Test3();
		ob.m1(1000);
		ob.m1(2000, 3000);
		ob.m1(22.03f);
		
	}

}
