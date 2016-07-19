
public class hello {
	public static void main(String[] args) {
		Animal cat = new cat("Tom",3,100);
		System.out.println("cat name = " +cat.name);
		System.out.println("animal name = " +cat.getstringName());
		
		boolean isMouse = cat instanceof mouse;
		System.out.println("Tom is mouse " +isMouse);
		boolean isAnimal = cat instanceof Animal;
		System.out.println("Tom is Animal " +isAnimal);
		
		
	}
}
