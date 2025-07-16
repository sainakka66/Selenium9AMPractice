package OOPs;

class Parent
{
	void m1()
	{
		System.out.println(" HELLO! Sai Nakka");
	}
}


public class Test extends Parent {
	
	void m2()
	{
		System.out.println(" HEY! HII, Namaste");
	}

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.m1();
		obj.m2();
	}

}
