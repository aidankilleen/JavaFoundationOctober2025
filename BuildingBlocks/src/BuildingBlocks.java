
// BuildingBlocks.java
// By: Aidan
// Date: 12/10/2025

public class BuildingBlocks {

	public static void main(String[] args) {
		
		System.out.println("Building Blocks");
		
		// Building Block #1 - Comment

		/*
		  Multi line comment 
		  
		 */
		
		// Building Block #2 - variables
		int i = 10;
		String name = "Aidan";
		float f = 1.2345f;
		double d = 1.23;
		boolean b = false;
		
		// java is strongly typed - you can't change the type after creation
		// i = "ten";
		
		System.out.println(i);
		System.out.println(name);
		
		System.out.println("My name is " + name);
		System.out.println("The value is " + i);
		
		//print (z);			// you cannot access a variable before it is declared
		
		int z;				// declaring a variable - creates it
		z = 99;
		System.out.println (z); // you can't reference a variable that hasn't been assigned
		
		
		
		// Building Block #3 - expression
		int aaa = 11111;
		int bbb = 20000;   // declaring
		
		double answer = aaa + bbb;
		answer = (10 * 200) / (15 - 2 + aaa / bbb);
		System.out.println ("The answer is " + answer);
		
		// Building Block #4 - while loop ( do things repeatedly )
		int count = 1;
		
		while (count <= 10) {	// building block 4a - curly brackets are blocks of code
			
			System.out.println(count);
			count = count + 1;
		}
		
		// the value of count here will be 11
		System.out.println("is count == 11? " + count);
		
			
		// Building Block #4c - for loop
		System.out.println("For Loop Example");
		
		for (int ff = 0; ff < 10; ff = ff + 1) {
			System.out.println(ff);
		}
		
		// Building Block # 5 - Condition / if
		for (int value = 1; value <=10; value = value + 1) {
			
			System.out.println("value=" + value);
			
			if (value <= 3) {
				System.out.println("small");
			} else if (value <= 8) {
				System.out.println("medium");
			} else {
				System.out.println("large");
			}
	
		}
		
		
		// Building Block #5a - Condition / switch
		for (int value = 1; value <=10; value = value + 1) {
			
			switch(value) {
			
			case 1:
			case 2:
			case 3:
				System.out.println(value + " is small" + ".");
				break;
			case 4:
			case 5:
			case 6:
			case 7:
				System.out.println(value + " is medium");
				break;
				
			case 10:
				System.out.println(value + " is large");
				break;
			default:
				System.out.println("if no other condition is hit this will be run " + value);
				break;
				
			}
		}
		System.out.println("===========================");
		// Building Block #6 - array (list)
		
		int[] numbers = {5, 3, 2, 7, 9, 1};
		
		System.out.println(numbers[1]);
		
		// array index starts at 0
		System.out.println(numbers[0]); // [0] is the first item
		
		//System.out.println(numbers[6]); // out of bounds
		
		// length of list / array
		System.out.println("length of list:" + numbers.length);
		
		// loop through my list
		for (int index = 0; index < numbers.length; index = index + 1) {
			System.out.println(numbers[index]);
		}
		System.out.println("===========================");
		numbers[0] = 999;
		
		for (int index = 0; index < numbers.length; index = index + 1) {
			System.out.println(numbers[index]);
		}
		
		// Aside - (post)increment 
		
		int v = 1;

		System.out.println(name);
		
		v = v + 1;
		
		System.out.println(name);

		v++; // same as v = v + 1;  increment operator
		
		
		count = 1;
		
		while (count < 10) {
			System.out.println(count++);
		}
		
		System.out.println(count--); // (post) decrement operator
		System.out.println(--count);  // pre decrement operators
		System.out.println(++count); // pre increment operator

		// Building Block #7 objects
		// an object 
		// is a programming data structure
		// that groups the information or data or properties
		// and the functions
		// for a particular entity
		// together
		
		String message = "Object Oriented Programming";
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		System.out.println(message.length());
		
		
		// Building Block #8 - functions
		
		String firstName = "Aidan";
		System.out.println("Welcome " + firstName);
		
		
		firstName = "Alice";
		System.out.println("Wilkommen " + firstName);

		// D.R.Y. - Don't Repeat Yourself
		// functions allow us to put some operation into a reusable unit (function)
		
		greet("Aidan");
		greet("Alice");
		
		String[] names = {"Alice", "Bob", "Carol", "Dan" };
		
		for (int index=0; index < names.length; index++) {
			greet(names[index]);
		}
	}
	
	public static void greet(String name) {
		System.out.println("Failte " + name);
	}
	
	
} 
