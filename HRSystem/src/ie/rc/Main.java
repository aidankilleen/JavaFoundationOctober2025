package ie.rc;

public class Main {

	public static void main(String[] args) {

		System.out.println("HR System");
		
		
		// Features of an OO Programming language
		
		// Abstraction
		// the ability to create an object 
		// an object has data and functions grouped in a reusable unit
		// class
		
		
		// Encapsulation
		// the ability to control access of the elements (data & functions) of an object
		// public and private 

		
		// Inheritance
		// the ability to create an object that is based on another object
		// extends
		
		
		// Polymorphism
		// TODO - look at this when we have some objects created
		
		
		// Goals of OO Programming
		// 1. promote code reuse
		// 2. model real world objects in code
		// 3. modularise a project - one class per file
		// 4. facilitate D.R.Y. applications
		
		
		Box b1 = new Box(10, 20);
		System.out.println(b1.area());
		
		
		ColouredBoxOriginal cbo = new ColouredBoxOriginal(10, 20, "red");
		System.out.println(cbo.area());
		
		
		ColouredBox cb = new ColouredBox();
		
		cb.setWidth(200);
		cb.setHeight(30);
		System.out.println(cb.area());
		
		cb.setColour("red");
		
		System.out.println(cb.getColour());
		
		ColouredBox cb2 = new ColouredBox(10, 10, "yellow");
		
		System.out.println(cb2.area());
		
		
		//System.out.println("\\u001B[31m");
		//System.out.println("is this red");
		
		
		
		

	}

}
