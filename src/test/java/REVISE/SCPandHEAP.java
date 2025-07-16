package REVISE;

public class SCPandHEAP {

	public static void main(String[] args) 
	{
		
		String s1 = "SAI";
		String s2 = "N SAI";
		String s3 = "SAI";
		System.out.println(s1 == s2); //f
		System.out.println(s1 == s3); //t
		System.out.println(s3 == s2); //f
		
		String str1 = new String("SAM"); 
		String str2 = new String("JAM"); 
		String str3 = new String("SAM"); 
		System.out.println(str1 == str2); //f 
		System.out.println(str1 == str3); //f
		System.out.println(str3 == str2); //f
		 
		StringBuffer sb1 = new StringBuffer("ALLU"); 
		StringBuffer sb2 = new StringBuffer("ARJUN"); 
		StringBuffer sb3 = new StringBuffer("ALLU"); 
		System.out.println(sb1 == sb2); //f
		System.out.println(sb1 == sb3); //f
		System.out.println(sb3 == sb2); //f
		
	}

}
