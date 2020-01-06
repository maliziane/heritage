package fr.gtm.heritage;

import java.util.ArrayList;
import java.util.List;

public class MainHeritage {

	public static void main(String[] args) {
		Voiture v = new Voiture("foo");
		v.move();  //methode publique de la classe mère
		v.faireLePlein();   // existe que dans voiture

		
		/*marche aussi mais pas la methode faire le plein qui n'existe pas dans vehicule!! 
		 * aura que le code rouler mais version voiture
		 * Vehicule v = new Voiture("foo");
		*v.rouler();  //methode publique de la classe mère
		*v.faireLePlein();   // existe que dans voiture
		*/ 
		
		
		Vehicule c = new Velo("faa");
		c.move();  
		
		
		
		List<Vehicule> vehicules = new ArrayList<Vehicule>();
				vehicules.add(new Voiture("foo"));
				vehicules.add(new Velo ("faa"));
				for (Vehicule d: vehicules){
					d.move();
	}
		
	}}


