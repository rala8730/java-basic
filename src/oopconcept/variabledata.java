package oopconcept;
import static java.lang.System.out;
public class variabledata {
	
	public int x; //instance variable
	public static final String department="development"; //class or static variable //department is constant
														//constant means within the class, doesn't go beyond the class
	private int i;	//instance	variable											//final makes it constant
	public  static int i2; //class variable
	///widening primitive conversion
	/*
	 * 8, 16, 32, 64 bit int
	 *smaller primitive value is placed over larger container, extra space on the left of the value is filled with zeros
	 * 
	 * narrow  conversion
	 * fit a value that is larger than type used in variable declaration 
	 * */
	
	
	
	private String str;
	//ex
	variabledata(){
		x=5;
		str="h";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variabledata v= new variabledata();//v is reference variable v holds the pointers/objects
		out.println(v.str);//
		
		
		
		//widening primitive conversion
		int myint =127;
		long mylon= myint;
		out.println(mylon +" long");
		
		//
		double mydouble=3001.987;
		int myintt=(int)mydouble;
		byte mybyte=(byte) myintt;
		out.println(myintt+ " int");
		out.println(mybyte + " byte");
		
		
		out.println(i2 +" class v");//class variable
		
		
		//out.println(i); //instance variable

	}
	public void printValue() {
		int i=40;
		System.out.println(i);
	}
	

}
