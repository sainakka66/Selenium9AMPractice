package OOPs;

class parent
{
	int a = 1000;
	int b = 10000;    //Instance variables
}


public class Test2 extends parent {
	
	int a = 2000;
	int b = 20000;   
	
	void add(int a, int b)
	{
		System.out.println(super.a+super.b);  // super class variables;
		System.out.println(this.a+this.b);  // current class variables
		System.out.println(a+b);  // local variables;
	}

	public static void main(String[] args) 
	{
		
		Test2 ob = new Test2();
		ob.add(3000, 30000);
		
	}

}
