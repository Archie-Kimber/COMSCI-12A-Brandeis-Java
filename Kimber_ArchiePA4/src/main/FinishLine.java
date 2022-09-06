package main;

public class FinishLine {
	//declaring variables 
	Car [] finishedCars;
	public int counter = 0;
	//method that enters the car into the finishline
	public void enterFinishLine(Car car) { 
		finishedCars[counter] = car;
		counter++;
	}
	//keeps track where each car enters the finishline
	public int place()
	{
		int place = counter;
		return place;
	}
	//sets up the array for car
	public void initializeLine(int size)
	{
	finishedCars = new Car[size];
	
	}
	//determines if a car is finished 
	public boolean finished() {
		
		if(counter >= finishedCars.length)
		{
			return true;
		}
		return false;
	}
}

