package com.app.jdk8;

public class A {
	public static void main(String[] args) {
		I i = ()-> {
			System.out.println("Bonjour");
		};
		i.m1();
		
	
	
	I i2 = ()-> {
		System.out.println("Crois en toi");
	};
	i2.m1();
	}

}
