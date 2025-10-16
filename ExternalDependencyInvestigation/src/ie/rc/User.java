package ie.rc;

import java.util.Objects;

public class User {

	// member variables / fields / properties
	private int id;
	private String name;
	private String email;
	private boolean active;
	
	// member functions
	
	// contructor(s)
	public User() {
		super();
	}
	public User(int id, String name, String email, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.active = active;
	}	
	
	// get & set methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", active=" + active + "]";
	}
	
	// equals / hashcode
	@Override
	public int hashCode() {
		return Objects.hash(active, email, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return active == other.active && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}	
	// other methods
	
	
	public static void main(String[] args) {
		
		User u1 = new User(1, "Alice", "alice@gmail.com", true);
		System.out.println(u1);
		
		User u2 = new User(1, "Alice", "alice@gmail.com", true);
		System.out.println(u2);
		
		if (u1.equals(u2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}

		u2.setName("Alicia");
		
		System.out.println(u2);
		
		if (u1.hashCode() == u2.hashCode()) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
	}
}
