package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;
import org.unioulu.tol.sqat2015.planetExplorer.*;
import org.junit.Test;

public class TestPlanetExplorer {

	
	@Test
	public void testCreatePlanetExplorer() {
		// arrange
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)");
		
		// assert should be 100
		assertEquals(101,explorer.gridHeight());
	}
	
	@Test
	public void testCommand() {
		// arrange
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)");
		
		//act
		String testLocation = explorer.executeCommand("ffrffrff");
		
		// assert should be "2,2,E"
		assertEquals("2,2,N",testLocation);
	}
	
}
