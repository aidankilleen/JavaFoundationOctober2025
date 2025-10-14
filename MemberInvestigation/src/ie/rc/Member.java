package ie.rc;

public class Member {

	// member variables
	private int id;
	private String name;
	private String email;
	private boolean active;

	// member functions
	// constructor(s)
	public Member() {

	}
	
	public Member(int id, String name, String email, boolean active) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.active = active;
	}

	// getters & setters
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
	
	// other methods / functions
	public void display() {
		System.out.println("Member:" + id);
		System.out.println(name);
		System.out.println(email);
		if (active) {
			System.out.println("Active");
		} else {
			System.out.println("Inactive");
		}
	}
}
