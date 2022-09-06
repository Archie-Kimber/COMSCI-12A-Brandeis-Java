package main;

public class Car {
	//intialzing varibales 
	private int speedCar;
	private int newSpeed;
	private int strengthCar;
	private double location;
	private boolean isDamaged;
	protected int maxSpeed;
	protected int minSpeed;
	protected int maxStrength;
	protected int minStrength;
	protected int timePit;
	public int score; 
	//constructor
	public Car(int speed, int strength) {
		speedCar = speed;
		newSpeed = speed;
		strengthCar = strength;
		timePit = 0;
	isDamaged = false;
	}
	//checks if the cars attributes are correct
	public void validateSpeedandStrength()
	{
		if(this.speedCar>maxSpeed)
		{
			this.speedCar= maxSpeed;
		}
		if(this.speedCar<minSpeed)
		{
			this.speedCar = minSpeed;
		}
		if(this.strengthCar >maxStrength)
		{
			this.strengthCar= maxStrength;
		}
		if(this.strengthCar<minStrength)
		{
			this.strengthCar= minStrength;
		}
	
	}
	//generic car
	public Car() {
		this.speedCar = 1;
		this.newSpeed = this.speedCar;
		this.strengthCar = 2;
		this.timePit = 0;
	}
	//methods that are used for objects in the car class
	public void damaged()
	{
		isDamaged = true;
		newSpeed = speedCar - (strengthCar*5);
	}
	public int getCurrentSpeed()
	{
		return newSpeed;
	}
	
	public void fixed()
	{
		isDamaged = false;
		newSpeed = speedCar;
	}
	public int getSpeed()
	{
		return speedCar;
	}
	public int strengthCar()
	{
		return strengthCar;
	}
	public double getLocation() {
		return this.location;
	}
	public void setLocation(double location)
	{
		this.location = location;
	}
	public void setSpeed(int speed)
	{
		this.speedCar = speed;
	}
	public double getLapLocation(double lapLength)
	{
		return this.location%lapLength;
	}
	public boolean checkDamage()
	{
	return isDamaged;
	}
	public void setPitTime()
	{
		timePit=0;
	}
	public int getPitTime()
	{
		return timePit;
	}
	public void addPitTime()
	{
		timePit++;
	}
	public String getType()
	{
		return "car";
	}
	public String toString() {
		return getType()+getSpeed()+"/"+strengthCar();
	}
	
}
