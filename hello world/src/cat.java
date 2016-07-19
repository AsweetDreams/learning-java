
public class cat extends Animal {
	protected float height;
	protected int age;
	
	
	public cat(float height, int age) {
		super();
		this.height = height;
		this.age = age;
	}
	
	public cat(String name,float height, int age) {
		super(name);
		this.height = height;
		this.age = age;
	}

	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String getstringName() {
		// TODO Auto-generated method stub
		return "Cat";
	}

}
