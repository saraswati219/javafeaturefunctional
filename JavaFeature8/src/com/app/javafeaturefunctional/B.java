package com.app.javafeaturefunctional;

public class B {
	public static void main(String[] args) {
		I i = () ->{
			System.out.println("hey john");
		};
		i.calling();
		
		I i2 = () ->{
			System.out.println("how are you?");
		};
			i2.calling();
		}
	}


