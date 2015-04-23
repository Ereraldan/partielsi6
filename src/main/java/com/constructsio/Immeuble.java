package com.constructsio;

public class Immeuble extends Batiments{
	
	//atributs
	int nbEtage;
	
	//getter setter
	public int getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(int nbEtage) {
		if (nbEtage > 0){
		this.nbEtage = nbEtage;
		}
		else {
			throw new RuntimeException("impossible le nombre d'étage d'un immeuble ne peut être négatif !");
		}
	}
		
	//constructeur
	public Immeuble(){		
		prix = 1000000;
	}

}
