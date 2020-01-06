package fr.gtm.heritage;

public abstract class Vehicule {
	private String marque;
	
	
	public Vehicule (String marque) {
		this.marque=marque;
	}
	
	public String getMarque() {
		return this.marque;
	}
	
	public abstract void move(); // precise abstraite pour pas avoir à mettre de code
									// du coup obligé de passer aussi vehicule en type abstract
	
}
