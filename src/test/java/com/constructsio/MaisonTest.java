package com.constructsio;

import junit.framework.Assert;

import org.junit.Test;

public class MaisonTest {
	
	Maison M = new Maison();
	
	@Test
	public void verifPrixBaseBon(){
		int resultat = M.prix;
		Assert.assertEquals("Mauvais résultat", 150000, resultat);
	}

}
