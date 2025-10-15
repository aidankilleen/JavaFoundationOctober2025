 // imports everything from the package

import ie.pt.SampleClass;

public class Main {

	public static void main(String[] args) {

		
		SampleClass c = new SampleClass();
		
		
		
		

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
