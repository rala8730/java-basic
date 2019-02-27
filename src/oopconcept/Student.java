package oopconcept;
import static java.lang.System.out;

public class Student extends Individual {
	int[] score;
	Student(String firstname, String lastname, int id, int[] score) {
		super(firstname, lastname, id);
		this.score=score;
		// TODO Auto-generated constructor stub
	}
	public void Grade() {
		int tscore=0;
		for(int i=0; i<score.length; i++) {
			tscore=+score[i];
		}
		int avg= tscore/3;
		

		
			if(avg>=90 && avg <=100) {
				out.println("score of: "+ firstname + " "+ lastname+ " with id: "+ id+ " is:" + "o");
			}
			else if(avg >80 && avg<=90) {
				out.println("score of: "+ firstname + " "+ lastname+ " with id: "+ id+ " is:" +"E");
			}
			else if(avg>70 && avg<=80) {
				out.println("score of: "+ firstname + " "+ lastname+ " with id: "+ id+ " is:" +"A");
			}
			else if(avg>60 && avg<=50) {
				out.println("score of: "+ firstname + " "+ lastname+ " with id: "+ id+ " is:" +"B");
			}
			else if(avg>50 && avg<=60) {
				out.println("score of: "+ firstname + " "+ lastname+ " with id: "+ id+ " is:" +"c");
			}
			else if(avg<60) {
				out.println("score of: "+ firstname + " "+ lastname+ " with id: "+ id+ " is:" +"D");
			}
			else {
				out.println("score of: "+ firstname + " "+ lastname+ " with id: "+ id+ " is:" +"greater than 100");
			}
			
			
		
	}
	

}
