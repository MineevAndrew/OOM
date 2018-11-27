package Programm;


import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void test() {
			
			VenueCalcBL fc;
			//test 1
			fc = new VenueCalcBL(5,30,2);
			assertEquals(150, fc.TotalAreaOfStorage, 0);
			assertEquals(300, fc.TotalSum, 0);
			
			//test 2
			fc = new VenueCalcBL(4.3,23.5,6);
			assertEquals(101, fc.TotalAreaOfStorage, 0.05);
			assertEquals(606, fc.TotalSum, 0.3);
					
			//test 3
			fc = new VenueCalcBL(-5,35,-2);
			assertEquals(0, fc.TotalAreaOfStorage, 0);
			assertEquals(0, fc.TotalSum, 0);
			
		}

	}

