package domain;
import java.util.ArrayList;

public class Department {
	private String name; //Department name
	private ArrayList<Course> courses; //Array of courses that department offers
	
	public Department() {	//constructor
		this.name = null;
		this.courses = null;
	}
	public Department(String name, ArrayList<Course> courses) {	//constructor
		this.name = name;
		this.courses = courses;
	}
	public String getName() {	//return name
		return name;
	}
	public ArrayList<Course> getCourses() {		//return course array
		return courses;
	}
}
