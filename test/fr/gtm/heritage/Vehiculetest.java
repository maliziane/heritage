package fr.gtm.heritage;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class Vehiculetest { // On peut pas tester une class abstraite!!!

	@Test
	public void constructeurTest() {
		Vehicule v = new Vehicule("foo");
		assertNotNull(v);
	}
	
	@Test
	public void getMarqueTest() {
		String m = "Bar";
		Vehicule v= new Vehicule (m);
		assertEquals(m,v.getMarque());
	}

}
