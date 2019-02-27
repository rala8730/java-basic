package oopconcept;
/* declared: similarly as instance variables
 * declared: using static keyword within a class outside any method constructor or block
 * created:at the start of program execution:
 * destroyed: automatically  when execution ends
 * 
 * we can only have one copy of static variable per class
 * irrespective of how many objects we create.
 */
/** static variable salary**/
class Emp{
	public static double salary;
	public static String name="Harsh";
}

class Marks{
	/*declared in a class, 
	 *created: when an object  of the class is created
	 *destroyed: when object is destroyed
	 *
	 *we may use access specifier for instance variable
	 *if we do not specify  any access specifier then default specifier will be used
	 * specifier: private, default, protected, public
	 */
	/**instance variables engMarks, mathMarks, phyMarks**/
	int engMarks;
	int mathMarks;
	int phyMarks;
}
public class Variables {
	
	
	public void StudentAge() {
		/*local variable are 
		 * created: when the block entered or the function is called
		 * destroyed: after exiting from the block or when the call returns from the function
		 * scope: exists only within the block in which the variable is declared
		 *  i.e. we can access these variable only within that block
		 */ 
		 /**** local variable age****/
		
		int age=0;
		age=age+5;
		System.out.println("student age is: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/************Local Variables***************/
		//A variable defined within a block or method or constructor
		Variables obj= new Variables();
		obj.StudentAge();
		
		/************Instance Variables***************/
		// Instance variables are non- static variables and are declared
		//in a class outside any method, constructor or block. 
		
		//first object of Mark
		Marks obj1=new Marks();
		obj1.engMarks=50;
		obj1.mathMarks=80;
		obj1.phyMarks=90;
		
		//second obj of Mark
		Marks obj2=new Marks();
		obj2.engMarks=80;
		obj2.mathMarks=60;
		obj2.phyMarks=85;
		
		//displaying marks for first onj
		System.out.println("Marks for first object");
		System.out.println("eng: "+obj1.engMarks);
		System.out.println("math: "+obj1.mathMarks);
		System.out.println("phy: "+obj1.phyMarks);
		
		System.out.println("Marks for second object");
		System.out.println("eng: "+obj2.engMarks);
		System.out.println("math: "+obj2.mathMarks);
		System.out.println("phy: "+obj2.phyMarks);
		
		/************Static Variables/Class variable***************/
		Emp.salary=1000;
		System.out.println("Emp.name"+"'s average salary:"+ Emp.salary);
				
	/***instance variable Vs Static variable***/
		/*
		 * Each object will have it's own copy of instance variable whereas 
		 * we can only have one copy  of a static variable per class irrespective
		 * of how many objects we create.
		 * 
		 * Changes made in an instance variable using one object will not be reflected
		 * in other objects as each object has it's own copy of instance variable. in case
		 * of static, changes will be reflected in other objects as static variables are common
		 * to all object of a class.
		 * 
		 * We can access instance variables through object references and static variables can
		 * be accessed directly using class name.
		 * 
		 * Syntax for static and instance variable;
		 *
		 * class example{
		 * 	static int a; //static variable
		 * 	int b;       //instance variable
		 * 
		 * }
		 */
	}

}
