package ie.rc;

public class ConversionInvestigation {

	public static void main(String[] args) {
		System.out.println("Conversion Investigation");
		
		int i = 10;
		
		//i = "10";
		
		// some conversions are ok - if the types are compatible
		// and there is no loss of data
		double d = i;
				
		System.out.println(d);
		
		d = 99.98765;
		
		// if there is data loss then you need to use a cast
		i = (int)d;
		System.out.println(i);

		// for strings to convert to other type look for a parse static method in the 
		// appropriate wrapper class
		String value = "10.98765";
		double v = Double.parseDouble(value);
		
		System.out.println(v);
		
		value = "10.9";
		//int vi = Integer.parseInt(value);
		
		d = Double.parseDouble(value);
		int vi = (int)d;
		
		
		//int vi = (int)Double.parseDouble(value);
		
	
		
		System.out.println(vi);
	}
}
