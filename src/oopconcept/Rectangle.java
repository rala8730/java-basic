package oopconcept;

public class Rectangle extends Shape{
	int l;
	int b;
	Rectangle(int L, int B){
		l=L;
		b=B;
	}
	public double calculatearea() {
		return l*b;
	}
}
