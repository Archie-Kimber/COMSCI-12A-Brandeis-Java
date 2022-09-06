package main;

public class SportsCar extends Car{
	//constructor
	public SportsCar(int speed, int strength) 
	{
		super(speed, strength);
		this.minSpeed = 20;
		this.maxSpeed = 45;
		this.minStrength = 1;
		this.maxStrength = 3;
		this.score = 200;
		this.timePit = 0;
		validateSpeedandStrength();
	}
	//gerneric car
	public SportsCar() 
	{
		this(30,2);
	}
	//returns type
	public String getType()
	{
		return "SportsCar";
	}
}
