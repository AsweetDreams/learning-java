
public class PolymorphismDemo {
	  public static void main(String[] args) {
		  
	       cat cat1 = new cat("Tom", 3, 20);
	 
	       cat cat2 = new CatAsian("ATom", 2, 19);
	 
	       System.out.println("Animal Name of cat1: " + cat1.getstringName());
	 
	       System.out.println("Animal Name of cat2: " + cat2.getstringName());
	 
	   }
}
