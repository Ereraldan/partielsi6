package com.constructsio;

import junit.framework.Assert;

import org.junit.Test;

public class BatimentsTest {
	
	//création de l'objet b qui est un batiment
	Batiments b = new Batiments();
	
	//test du calcul du prix total du batiment b
	@Test
	public void calculDuPrixTotalBatimentBon(){
		b.prix = 150000;
		b.prixOpt1 = 25000;
		int resultat = b.calculerPrix();
		Assert.assertEquals("Mauvais résultat total", 175000, resultat);
	}
	
	@Test(expected = RuntimeException.class)
	public void calculDuPrixTotalBatimentFaux(){
		b.prix = -20000;
		b.prixOpt2 = 0;
		b.calculerPrix();
	}
	
	//test de verification pour savoir si le batiment b est en construction
	@Test
	public void batimentEnConstruction(){
		b.enConstruct = "oui";
		String resultat = b.enConstructionOuNon();
		Assert.assertEquals("Mauvais résultat", "le batiment est en construction", resultat);
	}
	
	@Test
	public void batimentPasEnConstruction(){
		b.enConstruct = "non";
		String resultat = b.enConstructionOuNon();
		Assert.assertEquals("Mauvais résultat", "le batiment n'est pas en construction", resultat);
	}
	
	//test pour savoir si le batiment b a été payé
	@Test
	public void pasPayé(){
		b.payé = "non";
		String resultat = b.payéOuNon();
		Assert.assertEquals("Mauvais résultat", "le batiment n'a pas été payé", resultat);
	}
	
	@Test
	public void bienPayé(){
		b.payé = "oui";
		String resultat = b.payéOuNon();
		Assert.assertEquals("Mauvais résultat", "le batiment a été payé", resultat);
	}
	
	//test pour la modification du prix de base a savoir qu'il doit etre positif
	@Test
	public void setPrixPositif(){
		b.setPrix(1);
		int resultat = b.prix;
		Assert.assertEquals("Mauvais résultat", 1, resultat);
	}
	
	@Test(expected = RuntimeException.class)
	public void setPrixNega(){
		b.setPrix(-5);
				
	}

}
