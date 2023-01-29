package sample;

public class Car {
	private String name;
	private String colour;
	
	
	
	public Car(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}
