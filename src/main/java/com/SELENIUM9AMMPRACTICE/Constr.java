package com.SELENIUM9AMMPRACTICE;

public class Constr {
	
	/*void m1() {
		System.out.println("m1");
	}*/
	
	Constr(){
		System.out.println("0-arg");
	}
	
	Constr(int a){
		System.out.println("parameterized");
	}
	public static void main(String[] args) {
		Constr n = new Constr();
		/*n.m1();*/
		
		Constr nn = new Constr(1000);
		/*nn.m1();*/
	}

}
