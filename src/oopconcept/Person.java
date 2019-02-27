package oopconcept;
import static java.lang.System.out;

public class Person {
	String firstname;
	String lastname;
	String middlename;
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String newname) {
		this.firstname=newname;
		
	}
	
	public String getlastname() 
	{
		return lastname;
	}
	public void setlastname(String newname) {
		this.lastname=newname;
	}
	
	public String getmiddlename() {
		return middlename;
	}
	
	public void setmiddlename(String newname) {
		this.middlename=newname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person obj= new Person();
		obj.setfirstname("joel");
		obj.setlastname("doe");
		obj.setmiddlename("p");
		out.println(obj.getfirstname()+" "+obj.getmiddlename()+" "+obj.getlastname());

	}

}
