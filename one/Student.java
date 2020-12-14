package one;

import java.text.Collator;


public class Student implements Comparable<Student> {
	
	private String id;
	private String name;
	
	public String getId() {				 //method 2
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String id,String name) {   //method 1
		this.name=name;
		this.id=id;
	}
	
	  										  
	
	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		Collator cr=Collator.getInstance(java.util.Locale.CHINA);
		return cr.compare(name, o.name);
		
	}
	
											  
	
}
