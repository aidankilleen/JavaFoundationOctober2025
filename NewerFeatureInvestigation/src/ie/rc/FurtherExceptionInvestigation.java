package ie.rc;

public class FurtherExceptionInvestigation {

	
	public static void doSomething() throws CustomException {
		
		System.out.println("Do Something called");
		
		if (Math.random() > 0.5) {
			
			// generate an exception
			throw new CustomException("something went wrong");
			
		}
	}
	
	public static void main(String[] args) throws CustomException {
		
		doSomething();
		
		/*
		try {
			doSomething();
			
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("something went wrong");
		}
		*/
		
		
	}

}
