package ie.rc;

public class TernaryOperatorInvestigation {

	public static void main(String[] args) {
		
		int n = (int)(Math.random() * 10);
		
		
		String message;
		
		if (n < 5) {
			message = n + " is small";
		} else {
			message = n + " is large";
		}
		System.out.println(message);
		
		
		// ? : is called the "ternary operator"
		message = n + (n < 5 ? " is small" : " is large"); 
		
		System.out.println(message);
		
		
		n = (int)(Math.random() * 1000);
		
		System.out.print(n + "    ");
		
		// ensure value is 500 or less
		n = n > 500 ? 500 : n;
		
		System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
