
public abstract class Animal {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal() {
		super();
		this.name = this.getstringName();
	}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public abstract String getstringName();
}


