package REVISE;

public class Strr {

	public static void main(String[] args) 
	{
		
		String s1 = "SAI NAKKA";
		System.out.println(s1);
		
		String s2 = new String("SAI NAKKA 5532");
		System.out.println(s2);
		
		char[] ch = {'a','b','c','d','e'};
		String s3 = new String(ch);
		System.out.println(s3);
		
		String s4 = new String(ch,1,4);
		System.out.println(s4);
		
		byte[] b = {65,66,67,68,70};
		String s5 = new String(b);
		System.out.println(s5);
		
		String s6 = new String(b,3,2);
		System.out.println(s6);
		
	}

}
