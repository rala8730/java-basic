package oopconcept;
//example of interface:
/*
 * Like a class, an interface can have methods and variables,but the methods
 * declared in interface are by default abstract(only method signature, no body).
 * 
 * Interface specify what a class must do and not how. It is the blueprint of the class.
 * 
 *An interface is about capabilities(power or ability to do something) like a 
 *player may be an interface and any class implementing player must be able to 
 *(or must implement) move(). So it specifies a set of methods that the class has
 *to implement. 
 *
 *if a class implements an interface and does not provide method bodies for all 
 *functions specified in the interface, then class must be declared abstract.
 *
 *
 *interface <interface_name> {
 * 	declare constant fields
 * 	declare methods that abstract 
 * 	by default.
 * }
 *
 * To declare an interface, use interface keyword. it is used to provide total abstraction.
 * that means all the methods in interface are declared with empty body and are public and all
 * fields are public. static and final by default. A class that implement interface must implement
 * all the methods declared in the interface. To implement interface use implements keyword.
 * 
 * 
 * */

public interface InterfaceVehicle {
	//encusplation
		default void newfeature(int a) {
			System.out.println("hello");
		}
		/***************starting here**********************/
		public void changegear(int newgear);
		public void speedup(int increment);
		public void applybrakes(int decrement);


}
