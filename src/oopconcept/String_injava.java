package oopconcept;

public class String_injava {
	public void rev(String s) 
	{
		int len=s.length()-1;
		char[] o_str=s.toCharArray();
		int j=0;
		for(int i=len;i>-1;i--) {
			char temp=o_str[i];
			o_str[i]=o_str[j];
			o_str[j]=temp; 
			j++;
		}
		
		for(int i=0; i<=len; i++) {
			System.out.println(" string at: "+ i+" = "+o_str[i]);
		}
	}
	public void validate(String s) {
		if(s==null) {
			System.out.println(" String is: "+ s);
		}else if(s.length()<0) {
			System.out.println("Empty string");
		}
		else {
			System.out.println("String is: "+s.trim());
		}
	}
	public static boolean validatenum(String str) {
		//if 1 num
		//if 1 cap
		//if 1 low
		//if 1 special
		//len less than 8
		char[] s=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			char temp=s[i];
			s[i]=temp; 
		}
		char ch;
		boolean capital=false;
		boolean lower=false;
		boolean num=false;
		boolean spc=false;
		for(int i=0; i<s.length; i++) {
			ch=s[i];
			if(s.length>9) {
				if(Character.isDigit(ch)) {
					System.out.println("digit char: "+ch);
					num=true;
				}
				else if(Character.isUpperCase(ch)) {
					System.out.println("upper char: "+ch);
					capital=true;
				}
				else if(Character.isLowerCase(ch)) {
					System.out.println("lower char: "+ch);
					lower=true;
				}
				else if((int)ch==(int)'$'|| (int)ch==(int)'#') {
					System.out.println("special char: "+ch);
					spc=true;
				}
				else {
					System.out.println("Extra :"+ch);
				}
				
			}	
		}
		if(num && spc && lower && capital) {
			System.out.println("String is valid :" + "num: "+num+" spc: "+spc+" lower: "+lower+" capital: "+capital);
			return true;
		}
		//System.out.println("String is valid :" + "num: "+num+" spc: "+spc+" lower: "+lower+" capital: "+capital);
		return false;
	}
	public static void main(String[] args) {
		/**creation**/
		String mess= new String("Hello World!");
		String a="Hello";//create hello in a heap
		String b="Hello";//refer to older hello
		//string are immutable; cannot be changed
		
		/**append**/
		String msg="Hi there";
		msg=msg.concat("how are you");//creates different memory in heap and still refer it
		//msg refer to new and older string
		//System.out.println(msg);
		msg.length();
		msg.charAt(6);
		msg.contains("e");//return true
		msg.compareTo(b);//return 0
		msg.equals(a);//return true
		msg.replace("o", "O");
		msg.trim();//remove whitespace
		msg.toLowerCase();
		msg.toUpperCase();
		
		
		//msg.getChars(srcBegin, srcEnd, dst, dstBegin);
		//msg.startsWith(prefix);//test if string starts with the specified prefix
		//msg.endsWith(suffix);
		
		/**string buffer**///reading file
		//immutable// threadsafe
		
		//not thread safe//do not use in thread
		//betterthan string buffer
		StringBuilder sb=new StringBuilder();
		StringBuilder bn= new StringBuilder("hello");
		
		
		/**assingnment**/
		String_injava revobj= new String_injava();
		revobj.rev("hello");
		revobj.validate(null);
		boolean obbj=revobj.validatenum("Aa1$Bb2$cC3#@");
		
		System.out.println("obbj: "+obbj);
		
		
	}

}
