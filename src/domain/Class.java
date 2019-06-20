package domain;

public class Class {	//class is a particular class where a faculty teaches a particular course at a particular meeting time
	private int id;	// class id	
	private Department dept;	//department
	private Course course;	//course
	private Instructor instructor;	//instructor
	private MeetingTime meetingTime;	//meeting time
	private Room room;	//room
	
	public Class() { //constructor
		this.id = -1;
		this.dept = null;
		this.course = null;
	}
	
	public Class(int id, Department dept, Course course) { //constructor
		this.id = id;
		this.dept = dept;
		this.course = course;
	}
	
	//utility functions to return and set values
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public void setMeetingTime(MeetingTime meetingTime) {
		this.meetingTime = meetingTime;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public int getId() {
		return id;
	}
	public Department getDept() {
		return dept;
	}
	public Course getCourse() {
		return course;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public MeetingTime getMeetingTime() {
		return meetingTime;
	}
	public Room getRoom() {
		return room;
	}
	public String toString() {
		return "["+dept.getName()+","+course.getNumber()+","+room.getNumber()+","+instructor.getId()+","+meetingTime.getId() +"]";
	}
}
