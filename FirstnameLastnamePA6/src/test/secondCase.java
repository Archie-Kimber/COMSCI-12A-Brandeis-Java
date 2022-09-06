package test;

import static org.junit.jupiter.api.Assertions.*;
//import classes
/**
 * 
 */
import org.junit.jupiter.api.Test;
import main.RaceCar;
import main.PitStop;
import main.Car;
/**
 * 
 * @author archi
 *secondCase class where I declare variables and objects
 */
class secondCase {
	private PitStop stoppedCar;
	
	public secondCase() {
		stoppedCar = new PitStop();
	}

	RaceCar car1 = new RaceCar();
	Car[] raceCar = {car1};

	int i = 0;
	
	@Test
	/**
	 * test method where I test the code 
	 */
	void test() {
		int i = 0;
		stoppedCar.setupPitStop(raceCar);
		stoppedCar.enterPitStop(raceCar, i);
		Car testCar = stoppedCar.getPitstop(i);
		assertEquals(car1, testCar);
	}

}
