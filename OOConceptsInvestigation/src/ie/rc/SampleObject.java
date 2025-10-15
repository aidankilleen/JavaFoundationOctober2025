package ie.rc;

import java.util.Objects;

// every single object implicitly extends
// the Object class.

//public class SampleObject extends Object {
	
public class SampleObject {
	
	private String name;

	public SampleObject(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "SampleObject:"+ name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleObject other = (SampleObject) obj;
		return Objects.equals(name, other.name);
	}




	

}
