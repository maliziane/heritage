package fr.gtm.heritage;

public class Voiture extends Vehicule {

	public Voiture(String marque) {
		super(marque);
		
	}

	public void move() {
		System.out.println("La voiture roule");
	}

	public void faireLePlein() {
		System.out.println("Le plein est fait");
	}
}
