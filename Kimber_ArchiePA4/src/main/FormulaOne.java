package main;

public class FormulaOne extends Car {
	//constructor 
	public FormulaOne(int speed, int strength) 
	{
		super(speed, strength);
		this.minSpeed = 30;
		this.maxSpeed = 70;
		this.minStrength = 3;
		this.maxStrength = 5;
		this.score = 100;
		this.timePit = 0;
		validateSpeedandStrength();
	}
	//generic car
	public FormulaOne() 
	{
		this(50, 4);
	}
	//returns type
	public String getType()
	{
		return "FormulaOne";
	}
}
