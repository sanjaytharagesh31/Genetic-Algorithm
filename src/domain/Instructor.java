package domain;

public class Instructor {
	private String id;	//Instructor id
	private String name;	//Instructor name
	
	public Instructor() {
		this.id = null;
		this.name = null;
	}
	
	public Instructor(String id, String name) {		//Instructor constructor
		this.id = id;
		this.name = name;
	}
	public String getId() {		//return id
		return id;
	}
	public String getName() {	//return name
		return name;
	}
	public String toString() {	//return name as string to print
		return name;
	}
}
