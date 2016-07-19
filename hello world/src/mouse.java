
public class mouse extends Animal {
	protected float weight;
	
	public mouse(float weight) {
		super();
		this.weight = weight;
	}

	public mouse(float weight,String name) {
		super(name);
		this.weight = weight;
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String getstringName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
