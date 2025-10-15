import ie.pt.SampleClass;

import ie.rc.*; // imports everything from the package



public class Main {

	public static void main(String[] args) {


		System.out.println("Package Investigation");

		
		SampleClass sc = new SampleClass();
		
		System.out.println(SampleClass.message);
		
		
		System.out.println(ie.rc.SampleClass.message);
		
		
		
		// you can fully reference the classes 
		// by including the package in their name
		// but import is recommended 
		ie.rc.AnotherClass ac = new ie.rc.AnotherClass();
		
		
	}

}
