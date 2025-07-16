package OOPs;

class A
{
	void fatherLogic()
	{
		System.out.println("Marrying a Beautiful Girl");
	}
}

public class Test4 extends A{
	
	void childLogic()
	{
		System.out.println("Marry a Red Girl");
	}

	public static void main(String[] args) 
	{
		
		Test4 ob = new Test4();
		ob.childLogic();
		
	}

}
