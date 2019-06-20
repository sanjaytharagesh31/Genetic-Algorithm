package operation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import domain.*;
//data class to store all the available data
public class Data {
	private ArrayList<Room> rooms;	//list of rooms available
	private ArrayList<Instructor> instructors;	//list of instructors
	private ArrayList<Course> courses;	//list of courses
	private ArrayList<Department> depts;	//list of departments
	private ArrayList<MeetingTime> meetingTimes;	//list of meeting times
	private int numberOfClasses = 0;	//total number of classes from all departments for which the time should be scheduled
	
	public Data() {
		initialize();
	}
	
	private Data initialize() {
		Room room1 = new Room("R1", 25);
		Room room2 = new Room("R2", 45);
		Room room3 = new Room("R3", 35);
		rooms = new ArrayList<Room>(Arrays.asList(room1, room2, room3));
		MeetingTime meetingTime1 = new MeetingTime("MT1", "MWF 09:00 - 10:00");
		MeetingTime meetingTime2 = new MeetingTime("MT2", "TWF 10:00 - 11:00");
		MeetingTime meetingTime3 = new MeetingTime("MT3", "FRI 09:00 - 10:30");
		MeetingTime meetingTime4 = new MeetingTime("MT4", "MTW 10:30 - 12:00");
		meetingTimes = new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4));
		Instructor instructor1 = new Instructor("I1", "Steve Andreson ");
		Instructor instructor2 = new Instructor("I2", "Kevin Peter    ");
		Instructor instructor3 = new Instructor("I3", "Mike John      ");
		Instructor instructor4 = new Instructor("I4", "William        ");
		instructors = new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2, instructor3, instructor4));
		Course course1 = new Course("C1", "15MAT201", new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2)), 25);
		Course course2 = new Course("C2", "15EEE101", new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2, instructor3)), 35);
		Course course3 = new Course("C3", "15MAT303", new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2)), 25);
		Course course4 = new Course("C4", "15EEE233", new ArrayList<Instructor>(Arrays.asList(instructor3, instructor4)), 30);
		Course course5 = new Course("C5", "15EEE400", new ArrayList<Instructor>(Arrays.asList(instructor4)), 35);
		Course course6 = new Course("C6", "15PHY310", new ArrayList<Instructor>(Arrays.asList(instructor1, instructor3)), 45);
		Course course7 = new Course("C7", "15PHY222", new ArrayList<Instructor>(Arrays.asList(instructor2, instructor4)), 45);
		courses = new ArrayList<Course>(Arrays.asList(course1, course2, course3, course4, course5, course6, course7));
		Department dept1 = new Department("MATH", new ArrayList<Course>(Arrays.asList(course1, course3)));
		Department dept2 = new Department("EEE", new ArrayList<Course>(Arrays.asList(course2, course4, course5)));
		Department dept3 = new Department("PHY", new ArrayList<Course>(Arrays.asList(course6, course7)));
		depts = new ArrayList<Department>(Arrays.asList(dept1, dept2, dept3));
		depts.forEach(x -> numberOfClasses += x.getCourses().size());	//store number of total number of classes from all depts
		return this;
	}
	public ArrayList<Room> getRooms() {	//return room data
		return rooms;
	}
	public ArrayList<Instructor> getInstructors() {	//return faculty data
		return instructors;
	}
	public ArrayList<Course> getCourses() {	//return course data
		return courses;
	}
	public ArrayList<Department> getDepts() {	//return department data
		return depts;
	}
	public ArrayList<MeetingTime> getMeetingTimes() {	//return meeting times
		return meetingTimes;
	}
	public int getNumberOfClasses() {
		return numberOfClasses;     
	}

}
