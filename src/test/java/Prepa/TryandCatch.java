package Prepa;

public class TryandCatch {

	public static void main(String[] args) 
	{
		
		System.out.println(" I WILL BECOME ");
		
		try {
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		
		System.out.println(" HOKAGE ");
		
	}

}
