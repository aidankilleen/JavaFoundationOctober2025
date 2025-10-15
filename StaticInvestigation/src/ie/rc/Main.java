package ie.rc;

public class Main {

	public static void main(String[] args) {
		System.out.println("Static investigation");
		
		
		// garbage collection
		//int x = 10;		// in c this variable would be on the stack
		
		//int x = new int; // in c this variable would be in the heap
		
		// you can use "new" to allocate memory at run time
		
		// in C you (the programmer) are responsible for freeing up
		// all dynamically allocated memory
		// or else you program may run out of memory (memory leak)
		
		// trusting the programmer to free the memory is a bad idea
		

		// Java uses Garbage Collection instead
		
		String[] names = new String[1000];
		
		// no need to do any freeing
		Message m1 = new Message("Message 1", "this is message 1");

		System.out.println(m1.title);
		System.out.println(m1.text);
		System.out.println(Message.count);
		
		Message m2 = new Message("Message 2", "this is message 2");

		System.out.println(m2.title);
		System.out.println(m2.text);
		System.out.println(Message.count);
		
		// class variables are often used for constants
		System.out.println(Math.PI);
		
		Message m3 = new Message("Message3", "this is message 3");
		System.out.println(Message.getCount());
		
		// class / static functions are useful when you just want
		// to call a function and don't have an object
		
		System.out.println(Math.sin(90));
		
		System.out.println(Integer.MAX_VALUE);
	}	// the dynamically allocated variables are marked for gc here
}
