package domain;

public class MeetingTime {
	private String id;	//Meeting time ID
	private String time;  //Meeting time eg: MON 09:00 - 10:00
	
	public MeetingTime() {	//constructor for MeetingTime
		this.id = null;
		this.time = null;
	}
	
	public MeetingTime(String id, String time) {	//constructor for MeetingTime
		this.id = id;
		this.time = time;
	}
	public String getId() {	//function to return id
		return id;
	}
	public String getTime() {	//function to return time
		return time;
	}
}
