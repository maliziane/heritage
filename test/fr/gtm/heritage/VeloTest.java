package fr.gtm.heritage;

import static org.junit.Assert.*;

import org.junit.Test;

public class VeloTest {

	@Test
	public void constructeurTest() {
		Velo v = new Velo ("bar");
		assertNotNull(v);
		assertEquals("bar",v.getMarque()); 
	}

}
