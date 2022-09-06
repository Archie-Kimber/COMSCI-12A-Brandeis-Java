package main;

public class PitStop {
	//declaring variables
	public TrackLoggerC logger;
	int lengthStop;
	Car [] pitStop;
	/*public PitStop(Car[] cars)
	{
		lengthStop = cars.length;
	
	}*/
	//pitStop constructor
//	public PitStop()
//	{
//		
//	}
	public Car getPitstop(int i)
	{
		
		return pitStop[i];
	}
	//method that sets up array for cars in the pitStop
	public void setupPitStop(Car [] carsRace)
	{
		pitStop = new Car[carsRace.length];
	}
	//method where the cars in the pitstop will be fixed after waiting two ticks in the pitstop
	public Car[] pitStop(Car[] carsRace)
	{
		for(int j = 0; j<carsRace.length;j++)
		{		
			if(pitStop[j]!= null) {	
				if(pitStop[j].getPitTime()==2)
				{
					pitStop[j].setPitTime();
					pitStop[j].fixed();
					logger.logExitPit(pitStop[j]);
					carsRace[j] = pitStop[j];
					pitStop[j] = null;
					carsRace[j].setLocation(carsRace[j].getLocation() + carsRace[j].getCurrentSpeed());
				}
				else
				{
					pitStop[j].addPitTime();
				}
			}
			
		}
		return carsRace;
	}
	//method that enters the cars into the pitstop
	public void enterPitStop(Car[]carsRace, int i) { 
		pitStop[i] = carsRace[i];

	}
}
