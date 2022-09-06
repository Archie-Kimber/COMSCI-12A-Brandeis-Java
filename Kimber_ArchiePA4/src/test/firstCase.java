package test;

import static org.junit.jupiter.api.Assertions.*;
import main.RaceCar;
import org.junit.jupiter.api.Test;
/**
 * 
 * @author archi
 *where I set up the variables 
 */
class firstCase {
	private static RaceCar genericRaceCar = new RaceCar();
	private static RaceCar aboveRaceCar = new RaceCar(70, 6);
	private static RaceCar belowRaceCar = new RaceCar(30, 1);
	private static RaceCar mixedRaceCar = new RaceCar(70,1);
	private static RaceCar normalRaceCar = new RaceCar(35, 3);
	@Test
	/**
	 * test the code and seeing if it works 
	 */
	void test() {
		assertEquals(55, aboveRaceCar.getSpeed());
		assertEquals(4, aboveRaceCar.strengthCar());
		assertEquals(40, genericRaceCar.getSpeed());
		assertEquals(3, genericRaceCar.strengthCar());
		assertEquals(30, belowRaceCar.getSpeed());
		assertEquals(2, belowRaceCar.strengthCar());
		assertEquals(55, mixedRaceCar.getSpeed());
		assertEquals(2, mixedRaceCar.strengthCar());
		assertEquals(35, normalRaceCar.getSpeed());
		assertEquals(3, normalRaceCar.strengthCar());
	}

}
