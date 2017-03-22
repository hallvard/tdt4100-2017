package of11;

public class UKEFunk implements Student{

	private String name;
	private String role;
	private UKESjef boss;
	
	public UKEFunk(String name, String role, UKESjef boss) {
		this.name = name;
		this.role = role;
		this.boss = boss;
	}
	
	@Override
	public void work() {
		System.out.println("Jeg er en UKEFunk med rolle: " + role);		
	}
	
	public void setUKESjef(UKESjef sjef) {
		this.boss = sjef;
	}
	
	public String getRole() {
		return role;
	}

}
