package exc;

public class Data_type {
	Integer x;
	
	public static void main(String[] args) {
		
		
		/*******************Primitive Data Types*******************************/
		//1. integer  data type  32- bit 
		int x;  //declaring
		int y=123456789; //initializing/assigning the value of y to be 10 --> 10 does not equal to y but y=10
		
		Integer c=3;
		Integer a=new Integer(3);
		//2. double is numbers with decimal number
		double d= 2.1;
		 
		//3. boolean two type true or false
		boolean bool= true; //true=1
		boolean bool1=false;//false=0
		
		//4. byte 8-bit data type
		byte b=123; 
		//5. short 16-bit data type
		short srt=12345;
		//6.  long  64-bit  data type
		long lng= 4;
		//7. float data typr 32 bit
		float f=3;
		float f1='s';
		
		//8. Char variable type
		char ch= 'C';
		/**********complex objects or reference not *************/
		//1. Strings variable type
		//string pool
		String s="hu"; //declaring
		String r= new String("hello");
		r="hhh";
		s="hi";
		
				
		String str= " my name is rasmi"; //assigning the value of str to be h--> h  does not equal to str
		
		//
		int num='x';
		int sum=num+2;
		System.out.println("num:"+ num +" "+"sum:"+sum);
		/******* enums******/
		Color c1=Color.RED;
		System.out.println( "Enum Color: " +c1);
		
		int num1=0,num2=0;
		
		String chair,table="metal";
		//chair=chair+table; // chair not initialized
		//System.out.println("chair: "+chair);
	}
	/*********************object data types: programmer created data types***/
	//Enum/Enumerated data types
	//Enum declaration can be done outside a Class or inside a Class but not inside a Method.
	enum Color{
		RED,
		GREEN,
		BLUE;
	}
	
	enum TrafficSignal{
		
		RED("STOP"),GREEN("GO"),ORANGE("SLOW DOWN");

	//enums with customized value in java
		/*
		 *we have to create parameterized constructor for this enum class?why?
		 *because as we know that enum class's object can't be created explicitly
		 *so for initializing  we use parameterized constructor. And the constructor
		 *cannot be the public or protected it must have private or default modifiers.
		 *why? if we create public or protected, it will allow initializing more than
		 *one objects. This is totally against enum concept.
		 *
		 *we have to create one getter method to get the value of enums.
		 */
		
		private String action;
		
		public String getAction(){
			return this.action;
		}
		private TrafficSignal(String action) {
			this.action=action;
		}
		
	}//enum TrafficSignal ends here 


}

