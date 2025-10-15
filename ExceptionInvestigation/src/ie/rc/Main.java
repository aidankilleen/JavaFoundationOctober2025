package ie.rc;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {1, 5, 3, 4, 2, 9};
		int x = 10;
		int y = 0;
		
		int r = (int)(Math.random() * 4);
		
		int answer = 0;
		
		try {
			switch (r) {
			
			case 0:
				answer = Integer.parseInt("ten");
				break;
				
			case 1:
				answer = x / y;
				break;
				
			case 2:
				answer = numbers[6];
				break;
				
			default:
				// no error
				
			}
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index out of bounds");
			answer = numbers[0];
			
		} catch(ArithmeticException ex) {
			System.out.println("Arithmetic exception");
			answer = x;
			
		} catch(Exception ex) {
			// anything else that causes and exception will be handled by 
			// this exception (Catch all exception)
			System.out.println("something went wrong");
		}
		
		System.out.println("Answer = " + answer);
		System.out.println("finished");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// exception
		// java
		// glass is half full approach
		// significantly better than the c way
		
//		try {
//			DoSomething();
//			DoSomethingElse();
//		}
//		catch(NetworkError) {
//			// error handling code goes here
//		}
//		catch(FileError) {
//			
//		} 
//		catch(UserError) {
//			
//		}
		
		
		
		
		
		
		// c - programming error handling
		
		// glass is half empty approach
//		int x = 10;
//		int y = 0;
//		if (x > 0 && y > 0) {
//			r = DoSomething(x, y);
//			
//			if (r == -1) {
//				// user error
//			} else if (r == -2) {
//				// network error
//			} else if (r == -3) {
//				// file error
//			} else {
//				// everything ok
//			}
//		}
//		r = DoSomethingElse();
//		
//		if (r == -1) {
//			// user error
//		} else if (r == -2) {
//			// network error
//		} else if (r == -3) {
//			// file error
//		} else {
//			// everything ok
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
