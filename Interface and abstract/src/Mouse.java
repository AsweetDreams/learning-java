
public class Mouse extends Animal implements CanDrink,CanEat{

	@Override
	public void back() {
		 System.out.println("Mouse back ...");	
	}

	@Override
	public int getVelocity() {
		 return 85;
	}

	@Override
	public void eat() {
		 System.out.println("Mouse drink ...");
	}

	@Override
	public void drink() {
		 System.out.println("Mouse eat ...");
	}
}
