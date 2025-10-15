package ie.rc;

public class Main {

	public static void main(String[] args) {
		System.out.println("Console Output Investigation");
		
		System.out.println("output text with a new line at the end");
		
		for (int i=1; i<=9; i++) {
			System.out.print(i);
			
		}

		// escape sequences
		
		System.out.print("\n"); // \n is a newline character
		
		System.out.println("hello\n\n\n");
		
		for (int i=1; i<=5; i++) {
			System.out.print(i + "\t");
		}
		
		System.out.println("\n");
		
		String[] names = {"Alice", "Bob", "Xavier", "Johannes"};
		
		for (String name : names) {
			System.out.print("\t" + name);
		}
		System.out.println();
		
		
		String s = "=";
		
		System.out.println(s.repeat(25));
		
		
		System.out.println("=".repeat(25));
		
		
		System.out.println("Press the \"red\" button");
		
		String fileName = "C:\\Program Files\\java\\bin\\java.exe";
		
		System.out.println(fileName);
		
		
		int answer = 22;
		
		String message = "The answer is " + answer;
		
		message = String.format("The answer is %d", answer);
		
		System.out.println(message);
		
		
		int a = 1;
		int b = 20;
		answer = a + b;
		
		System.out.println(String.format("%d + %d = %d", a, b, answer));
		
		System.out.printf("%d + %d = %d\n", a, b, answer);
		
		
		System.out.printf("pi = %f\n", Math.PI);
		
		String name = "Alice";
		
		System.out.printf("Welcome, %10s to Java\n", name);
		
		
		System.out.printf("pi = %.2f\n", Math.PI);
		
		System.out.printf("answer = %04d\n",  answer);
		
		// you can left justify the string using -
		System.out.printf("Welcome, %-10s to Java\n", name);
		
		
		System.out.println("\u001B[31m");	// set console colour to red
		System.out.println("is this red??");
		System.out.println("\u001B[0m");	// reset console colour to black
		
		
		System.out.println("\n");
		System.out.println("finished");

	}

}
