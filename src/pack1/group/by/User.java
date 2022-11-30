package pack1.group.by;

public class User 
{
	private String name;
	private Integer sal;
	private String country;
	public User(String name, Integer sal, String country) {
		super();
		this.name = name;
		this.sal = sal;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public String getCountry() {
		return country;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", sal=" + sal + ", country=" + country + "]";
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
