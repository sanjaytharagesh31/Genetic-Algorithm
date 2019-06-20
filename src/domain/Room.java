package domain;

public class Room {
	private String number; //Room Number (Physical)
	private int seatingCapacity; //Number of students can be accommodated in the room
	
	public Room() {
		this.number = null;
		this.seatingCapacity = -1;
	}
	
	public Room(String number, int seatingCapacity)  { //Room constructor
		this.number = number;
		this.seatingCapacity = seatingCapacity;
	}
	public String getNumber() {		//utility function to return room number
		return number;
	}
	public int getSeatingCapacity() {    //utility function to return room capacity
		return seatingCapacity;
	}
}
