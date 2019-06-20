package domain;
import java.util.ArrayList;

public class Course {
	private String number = null;	//course number
	private String name = null;		//course code
	private int maxNumbOfStudents;	//maximum number of students can be enrolled in this course
	private ArrayList<Instructor> instructors;	//array of instructors for a particular course
	
	public Course() {	//constructor
		this.number = null;	
		this.name = null;
		this.instructors = null;
		this.maxNumbOfStudents = -1;
	}
	
	public Course(String number, String name, ArrayList<Instructor> instructors, int maxNumbOfStudents) {	//constructor
		this.number = number;	
		this.name = name;
		this.instructors = instructors;
		this.maxNumbOfStudents = maxNumbOfStudents;
	}
	
	//utility functions to return the attributes of a course
	public String getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Instructor> getInstructors() {
		return instructors;
	}
	public int getMaxNumbOfStudents() {
		return maxNumbOfStudents;
	}
	public String toString() {
		return name;
	}
}
