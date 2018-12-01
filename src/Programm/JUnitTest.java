package Programm;


import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void test() {
			
			VenueCalcBL fc;
			//test 1
			fc = new VenueCalcBL(10,20,4);
			assertEquals(200, fc.TotalAreaOfStorage, 0);
			assertEquals(800, fc.TotalSum, 0);
			
			//test 2
			fc = new VenueCalcBL(2.3,13.5,8);
			assertEquals(31, fc.TotalAreaOfStorage, 0.05);
			assertEquals(248, fc.TotalSum, 0.4);
					
			//test 3
			fc = new VenueCalcBL(-5,15,-1);
			assertEquals(0, fc.TotalAreaOfStorage, 0);
			assertEquals(0, fc.TotalSum, 0);
			
		}

	}

