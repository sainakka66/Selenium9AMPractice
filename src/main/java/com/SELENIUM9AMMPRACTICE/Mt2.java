package com.SELENIUM9AMMPRACTICE;

public class Mt2 {
	
	int m1() {
		System.out.println("m1");
		return 10;
	}
	
	float m2() {
		System.out.println("m2");
		return 10.5f;
	}
	
	static char m3() {
		System.out.println("m3");
		return 'x';
	}

	public static void main(String[] args) {
		Mt2 nn = new Mt2();
		System.out.println(nn.m1());
		System.out.println(nn.m2());
		Mt2.m3();
	}

}
