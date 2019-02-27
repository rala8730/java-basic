package oopconcept;
import static java.lang.System.out;
//import java.util.*;
import java.util.Set;
import java.util.HashSet;

public class HelloWorld {
	static public void numbers(int num) {
		out.println("even");
		for(int i=0; i<num; i++) {
			if(i%2==0){
				out.println("odd: "+i);
			}
		}
		
		out.println("--------");
		for(int i=0; i<num; i++) {
			if(i%2!=0){
				out.println("even: "+i);
			}
		}
	}
	static public void number2(int num) {
		//int[] arr=new int[50];
		
	}
	public static void operation(int a, int b) {
		int sum= a+b; 
		int sub= a-b;
		int div=a/b;
		int mul= a*b;
		out.println("sum: "+sum +" sub: "+sub+" div: "+ div+" mul: "+mul);
	}
	public static void div(int num) {
		if(num % 5 ==0 && num%3==0) {
				out.println("div by both");
		}
		else if(num%3 ==0) {
			out.println("div by 3");
		}
		else if(num%5==0) {
			out.println("div by 5");
		}
		else {
			out.println(" neither");
		}
		
	}
	public static void fizzbuzz(int num) {
		String c="";
		String d="";
		String ans="";
		if(num%3==0){
			c="fizz";
		}
		if(num%5==0) {
			d="buzz";
		}
		ans=c+d;
		out.println(ans);
			
	}
	
	public static void fizzbuzzopt(int num) {
		String c="";
		String d="";
		String ans="";
		StringBuffer sb = new StringBuffer();
		if(num%3==0){
			//c="fizz";
			sb.append("fizz");
		}
		if(num%5==0) {
			//d="BUZZ";
			sb.append("buzz");
		}
		//ans=c+d;
		//out.println(ans);
		out.println(sb);	
			
	}
		
	public void bin(int nums) {
		String bina="";
		//int i=0;
		while(nums>1) {
			int temp=nums%2;
			bina=bina+temp;
			//mylist.add(temp);
			nums=nums/2;
		}
		out.println("binary of "+nums+": "+bina);
		out.println("count : "+ bina.length());
	}
	public String[] dup(String [] s1, String [] s2) {
		Set<String>s=new HashSet<String>();
		for(String a: s1)
			s.add(a);
		for(String b: s2)
			s.add(b);
		String[] uniqueNames=new String[s.size()];
		int i=0;
		for(String names: s)
			uniqueNames[i++]=names;
			out.println(s);
		return uniqueNames;
		
	}
	public void dupli(String[] s1, String[] s2) {
		Set<String>s=new HashSet<String>();
		for(String a: s1) {
			s.add(a);
		}
		for(String b: s2) {
			s.add(b);
		}
		out.println(s);
	}
	public boolean ispalindrome(String str) {
		int l=str.length()-1;
		int i=0;
		while(i<l) {
			if(str.charAt(i)==str.charAt(l)) {
				i++;
				l--;
			}
			else {
				out.println(str+ " is not a palindrome");
				return false;
			}
		}
		out.println(str+" is a palindrome.");
		return true;
	}
	public void lastindex(String str, char c){
		int temp=-1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				temp=i;
			}
		}
		if(temp!=-1) {
			out.print("last index of "+ c+" at "+ str +" is " + temp);
		}
		else {
			out.print("no matching char found at "+ str);
		}
	}
	public void multable(int n){
		for(int i=0; i<=n; i++) {
			out.println(i+"*"+n+" = "+(i*n));
		}
	}
	public int fibonacci(int n){
		if(n==0) {
			return 0;
		}
		if(n==1 ||n==2) {
			return 1;
		}
		else return(fibonacci(n-1)+fibonacci(n-2));
	}
	public void oper(String s) {
		for(int i=0; i<s.length(); i++) {
			//del s and value
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//out.println("Hello World!");
		//out.println("Hello Rasmi");
		//div(7);
		//bin(5);
		//String[] s1={"hello","my","name","is"};
		//String[] s2={"hi","my","name","is"};
		HelloWorld obj=new HelloWorld();
		//obj.dup(s1,s2);
		obj.fizzbuzz(3);
		//obj.bin(9);
		//obj.ispalindrome("racecar");
		//obj.lastindex("helloworld", 'l');
		//obj.multable(10);
		//obj.fibonacci(0);
		//numbers(50);
		//operation(4,5);
		
		/*
		out.println("even");
		int num=50;
		for(int i=0; i<num; i++) {
			if(i%2==0){
				out.println(i);
			}
		}
		out.println("odd");
		for(int i=0; i<num; i++) {
			if(i%2!=0){
				out.println(i);
			}
		}
		*/
	}
	
	

}
