package main;
/**
 * 
 * @author archi
 *declaring the objects and constructors in the raceTrack class 
 */
public class RaceTrack {
	protected double begLocation;
	protected double endLocation; 
	protected double distance; 
	public double lengthTrack;
	public double numLaps;
	public int ticks;

	/**
	 * DO NOT REMOVE THIS - you should be using this to log this track's events. For more see the assignment PDF / documentation for TrackLoggerB.java
	 */
	private TrackLoggerC logger;
	private Car[] carsRace;
	private FinishLine finishedCars;
	private Car[] pitStop;
	private PitStop stoppedCar;
	/**
	 * the raceTrack constructor 
	 */
	public RaceTrack() {
		lengthTrack = 100;
		numLaps =10;
		logger = new TrackLoggerC(); // DO NOT REMOVE THIS LINE
		finishedCars = new FinishLine();
		stoppedCar = new PitStop();
		stoppedCar.logger = logger;
	}
	/**
	 * method that sets up the race cars array 
	 * @param cars
	 */
	public void setCars(Car[] cars) 
	{
		this.carsRace = cars;
		this.pitStop = new Car[cars.length];
		finishedCars.initializeLine(cars.length);
		
	}
	/**
	 * these two methods return local location variables in the class 
	 * @return
	 */
	public double getEndLocation()
	{
		return this.endLocation;
	}
	public double getBeglocation()
	{
		return this.begLocation;
	}
	/**
	 * the tick method 
	 */
	public void tick() {
		double carStart;
		double carFinish;
		double distanceToPitStop;
			//ticks is used to keep track the amount of time the tick method is implemented 
			ticks++;
			logger.logNewTick();
			//for loop that goes through the carsRace loop and moves the car the correct amount of units
			for(int i = 0; i< carsRace.length; i++)
			{
				//skips the loop if the car at carsRace[i] is not in the array
				if(carsRace[i] == null)
				{
					continue;
				}

				//move the car 
				begLocation = carsRace[i].getLapLocation(this.lengthTrack);
				//if the beggining lap location is lesss than 75 if statement implements 
				if(begLocation<75)
				{
					distanceToPitStop = 75-begLocation;
				}
				else
				{
					distanceToPitStop = (100-begLocation)+75;
				}
				//determines if the car needs to go to the pitstop 
				if(carsRace[i].getCurrentSpeed()>=distanceToPitStop && carsRace[i].checkDamage())
				{
					//move to pitstop
					carsRace[i].setLocation(carsRace[i].getLocation() + distanceToPitStop);	
					logger.logEnterPit(carsRace[i]);
					stoppedCar.enterPitStop(carsRace, i);
					carsRace[i] = null;
				}
				else 
				{
				//move car normally 
				carsRace[i].setLocation(carsRace[i].getLocation() + carsRace[i].getCurrentSpeed());	
				}
				//if carsRace[i] is null it will skip the rest of the code
				if(carsRace[i] ==null)
				{
					continue;
				}
				//to check if the location is greater than the total length of the track to see if the track is finished
				if(carsRace[i].getLocation()>this.lengthTrack*this.numLaps)
				{
					finishedCars.enterFinishLine(carsRace[i]);
					logger.logFinish(carsRace[i], finishedCars.place());
					carsRace[i] = null;
				}
				
			}
			
			//end of moving cars 
			//checking if cars have collided 
				//call the method
				checkCollision();
			
				//pitstop
				stoppedCar.pitStop(carsRace);
			

	}
	//method devlaration that checks if have collieded 
	public void checkCollision() 
	{
		//fist loop goes through the whole array
		for(int j = 0; j<carsRace.length-2;j++)
		{
			if(carsRace[j] == null)
			{
				continue;
			}
			//second for loop goes through the same array but starts at one spot later 
			for(int k = j+1; k<=carsRace.length-1; k++)
			{
				if(carsRace[k]==null)
				{
					continue;
				}
				//compares the lap location of the cars
				if(carsRace[j].getLapLocation(this.lengthTrack) == carsRace[k].getLapLocation(this.lengthTrack))
				{
					//checks if the car is already damaged
					if(carsRace[j].checkDamage() == false) {
					logger.logDamaged(carsRace[j]);
					carsRace[j].damaged();
					}
					if(carsRace[k].checkDamage() == false) {
					logger.logDamaged(carsRace[k]);
					carsRace[k].damaged();
					}
				}
			}
		}
	}
	
	//run method that is used in the simulation
	public void run() 
	{
		//declaring variables
		ticks =0;
		int run =0;
		//setting up the the pitstop array
		stoppedCar.setupPitStop(carsRace);
		//while loop goes 
		while(finishedCars.finished() == false) 
		{
		tick();
		run++;
		}
		logger.logScore(calculatorScore(run));
	}
	//score calulator method 
	public int calculatorScore(int ticks) {
		int gameScore = 1000;
		gameScore= gameScore - 20*ticks;
		//for loop that goes through each car that has finished 
		for(int i =0; i<this.finishedCars.finishedCars.length; i++)
		{
			gameScore = gameScore+ this.finishedCars.finishedCars[i].score;
		}
		
		return gameScore;
	}

	/**
	 * This method returns the logger instance used by this RaceTrack. You <b>SHOULD NOT</b> be using this method. 
	 * @return logger with this track's events 
	 */
	public TrackLoggerC getLogger() {
		return logger;
	}

}
