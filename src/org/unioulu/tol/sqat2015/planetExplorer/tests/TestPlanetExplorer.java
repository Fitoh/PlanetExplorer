package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;
import org.unioulu.tol.sqat2015.planetExplorer.*;
import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void testCreatePlanetExplorer() {
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)");
	}
}
