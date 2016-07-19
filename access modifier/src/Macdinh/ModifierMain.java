package Macdinh;
import package1.*;
public class ModifierMain {
	public static void main(String[] args) {
		intoPackage one = new intoPackage(10);
		System.out.println(one.a); // mac dinh
		System.out.println(one.b); // protected
//		System.out.println(one.c); loi do la private
		System.out.println(one.d); // public 
		
		first two = new first(10);
//		System.out.println(two.a); // mac dinh chi trong package
		System.out.println(two.b); // protected
//		System.out.println(two.c); loi do la private
		System.out.println(two.d); // public 
	}
	
}
