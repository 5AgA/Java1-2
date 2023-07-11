
public class Dog {
	private String name, type;
	public void setName(String n) { this.name = n; }
	public void setType(String t) { this.type = t; }
	public String getName() { return name; }
	public String getType() { return type; }
	
	public Dog(String name, String type) {
		setName(name);
		setType(type);
	}
	public String toString() {
		return getName() + ", " + getType();
	}
}
