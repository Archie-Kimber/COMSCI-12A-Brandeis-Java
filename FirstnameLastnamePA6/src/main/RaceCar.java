package main;

public class RaceCar extends Car {
	//race car constructor
	public RaceCar(int speed, int strength) 
	{
		super(speed, strength);
		this.minSpeed = 30;
		this.maxSpeed = 55;
		this.minStrength = 2;
		this.maxStrength = 4;
		this.score = 150;
		this.timePit = 0;
		validateSpeedandStrength();
	}
	//generic race car 
	public RaceCar() 
	{
		this(40,3);
	}
	public String getType()
	{
		return "RaceCar";
	}
}
