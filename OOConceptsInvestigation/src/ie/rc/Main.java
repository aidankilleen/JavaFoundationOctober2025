package ie.rc;

public class Main {

	public static void main(String[] args) {
		System.out.println("OO Concepts");

		// common base class for everything!
		SampleObject so = new SampleObject("Alice");
		
		SampleObject so2 = new SampleObject("Fred");
		
		System.out.println(so.getClass().getName());
		
	
		System.out.println(so.toString());
		
		// java will implictly call .toString()
		// if it needs an object to be a string
		System.out.println(so);
		
		
		String a = new String("hello");
		String b = new String("hello");
		
		
		System.out.println(a);
		System.out.println(b);
		
		// NB: do not use == to compare Strings or any 
		// object
		if (a == b) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		// use .equals() method instead
		if (a.equals(b)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		System.out.println("=================");
		SampleObject soa = new SampleObject("alice");
		SampleObject sob = new SampleObject("alice");
		
		
		if (soa == sob) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}		
		
		if (soa.equals(sob)) {			
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		System.out.println(soa.hashCode());
		System.out.println(sob.hashCode());
		
		SampleObject soc = new SampleObject("Alice");
		System.out.println(soc.hashCode());
		
		if (soa.hashCode() == sob.hashCode()) {			
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		
		
	}

}
