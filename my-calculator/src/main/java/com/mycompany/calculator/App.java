package com.mycompany.calculator;
import com.mycompany.operations.CalculatorOperations;
import java.util.Scanner;

/**
 * Implement Calculator Application with Add, Divide, Multiply and Subtract Methods
 * Implement Layered Architecture
 * Implement SOLID, KISS, DRY, YAGNI principles
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	boolean start = true;
    	while(start)
    	{
    		System.out.println(".......................This is my calculator....................");
    		System.out.print("Operations are: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n Enter your operation : ");
    		
			Scanner scan = new Scanner(System.in);
    		int option = scan.nextInt();
    		CalculatorOperations obj = new CalculatorOperations();
    		String result;
    		if(option==1) {
    			result = obj.add();
    			System.out.println(result);	
    		}
    		else if(option==2)
    		{
    			result = obj.sub();
    			System.out.println(result);
    		}
    		else if(option==3)
    		{
    			result = obj.mul();
    			System.out.println(result);
    		}
    		else if(option==4)
    		{
    			result = obj.div();
    			if(!result.equals("-1"))
    				System.out.println(result);
    		}
    		System.out.print("Would you like to start over? (y,n) : ");
            String startOver = scan.next();
            
            if("n".equals(startOver))
            {
                start = false;
                System.out.println("Thanks and Bye");
            }
           
    	}
    }

	
}
