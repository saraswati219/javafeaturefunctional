package com.app.functionalfeature;

public class Operations {
	public static void main(String[] args) {
		Calculator add = (a,b) ->{
			System.out.println("add()--");
			return a+b;
		};
		float sum = add.calculate(1.5f,2.5f);
		System.out.println("Sum:" +sum);
	
	//subtractions
	Calculator sub = (a,b) ->{
		System.out.println("Sub()--");
		return a-b;
		
	};
	float subs = sub.calculate(2.5f,1.5f);
	System.out.println("Sub:" +subs);
	
	//multiplication
	Calculator mul = (a,b) ->{
		System.out.println("Mul()--");
		return a*b;
	};
	float mult = mul.calculate(1.5f,1.5f);
	System.out.println("Mul:"+mult);
	
	//div
	Calculator div = (a,b) ->{
		System.out.println("div()--");
		return a/b;
	};
    float divs = div.calculate(1.5f,5.0f);
    System.out.println("Div:" +divs);
	

	}

}
