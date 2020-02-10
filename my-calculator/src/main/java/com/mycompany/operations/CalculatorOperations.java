package com.mycompany.operations;

import java.util.Scanner;

public class CalculatorOperations {
	static Scanner scan = new Scanner(System.in);
	private int num1;
	private int num2;
	
	public CalculatorOperations()
	{
		System.out.println("Enter first number : ");
		num1 = scan.nextInt();
		
		System.out.println("Enter second number : ");
		num2 = scan.nextInt();
	}
	
	public String add(){
		return "Addition of "+num1+" and "+num2+" is : "+(num1+num2);
	}

	public String sub() {
		return "Subtraction of "+num1+" and "+num2+" is : "+(num1-num2);
	}

	public String mul() {
		return "Multiplication of "+num1+" and "+num2+" is : "+(num1*num2);
	}

	public String div(){
		try 
		{
			if(num2==0)
				throw new Exception("Division by Zero Error");
			
			return "Division of "+num1+" and "+num2+" is : "+((float)num1/(float)num2);	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		return "-1";
		
	}

	
	
}
