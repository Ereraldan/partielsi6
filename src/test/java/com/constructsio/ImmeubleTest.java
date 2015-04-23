package com.constructsio;

import junit.framework.Assert;

import org.junit.Test;

public class ImmeubleTest {
	
	//création d'un objet imb qui est un immeuble
	Immeuble imb = new Immeuble();
	
	//test pour la modification du nombre d'etage qui doit etre positif
	@Test
	public void setNbEtageBon(){
		imb.setNbEtage(5);
		int resultat = imb.nbEtage;
		Assert.assertEquals("Mauvais résultat", 5, resultat);
	}
	
	@Test(expected = RuntimeException.class)
	public void setNbEtageFaux(){
		imb.setNbEtage(0);
	}
	
	//test pour savoir si le prix de base de l'immeuble est bien de 1000000
	@Test
	public void verifPrixBase(){
		//imb.getPrix();
		int resultat = imb.prix;
		Assert.assertEquals("Mauvais résultat", 1000000, resultat);
	}

}
