package fr.gtm.heritage;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoitureTest {

	@Test
	public void constructeurTest() {
		Voiture v = new Voiture ("bar");
		assertNotNull(v);
		assertEquals("bar",v.getMarque());  //methode getmarque heritée de vehicule donc pas testée
											//marque est private donc acces via getmarque
		
	}

}
