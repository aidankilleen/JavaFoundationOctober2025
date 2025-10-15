package ie.rc;

public class Main {

	public static void main(String[] args) {
		System.out.println("Static investigation");
		
		Message m1 = new Message("Message 1", "this is message 1");

		System.out.println(Message.count);
		
		Message m2 = new Message("Message 2", "this is message 2");

		System.out.println(Message.count);
		
		// class variables are often used for constants
		System.out.println(Math.PI);
		
		Message m3 = new Message("Message3", "this is message 3");
		System.out.println(Message.getCount());
		
		// class / static functions are useful when you just want
		// to call a function and don't have an object
		
		
		System.out.println(Math.sin(90));
		
		
		System.out.println(Integer.MAX_VALUE);
		
		
		
	}

}
