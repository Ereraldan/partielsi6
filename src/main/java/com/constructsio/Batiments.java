package com.constructsio;

public class Batiments {
	
	//atributs
		public int prix;
		public String nomOpt1;
		public int prixOpt1;
		public String nomOpt2;
		public int prixOpt2;
		public String enConstruct;
		public String payé;
		
	
	//getter setter
	public void setPrix ( int newPrix){     // écriture
	    if (newPrix > 0){ 
		prix = newPrix;
	    }
	    else {
	    	throw new RuntimeException("impossible le prix de base d'un batiment ne peut être négatif !");
	    	
	    }
	     
	}

	public int getPrix(){   // lecture
	     return prix;
	}
	
	public void setnomOpt1( String newOpt){     // écriture
	     nomOpt1 = newOpt;
	}

	public String getnomOpt1(){   // lecture
	     return nomOpt1;
	}
	
	public int getPrixOpt1() {
		return prixOpt1;
	}

	public void setPrixOpt1(int prixOpt1) {
		this.prixOpt1 = prixOpt1;
	}

	public String getNomOpt2() {
		return nomOpt2;
	}

	public void setNomOpt2(String nomOpt2) {
		this.nomOpt2 = nomOpt2;
	}

	public int getPrixOpt2() {
		return prixOpt2;
	}

	public void setPrixOpt2(int prixOpt2) {
		this.prixOpt2 = prixOpt2;
	}

	public String getEnConstruct() {
		return enConstruct;
	}

	public void setEnConstruct(String enConstruct) {
		this.enConstruct = enConstruct;
	}

	public String getPayé() {
		return payé;
	}

	public void setPayé(String payé) {
		this.payé = payé;
	}

	
	//constructeur
	public Batiments(){
		
		payé = "non";
		enConstruct = "non";
		nomOpt1 = "option non défini";
		prixOpt1 = 0;
		nomOpt2 = "option non défini";
		prixOpt2 = 0;
	}
	
	//Prix total du batiment avec prix de base et option comprise
	public int calculerPrix(){
		int total = 0;
		
		if (prix >= 0 ){
		total = prix + prixOpt1 + prixOpt2;
		}
		else{
			throw new RuntimeException("impossible le prix d'un batiment ne peut être négatif !");
		}
		return total;
		
	}
	
	//est ce que le batiment est en cour de construction ?
	public String enConstructionOuNon(){
		String rep = "";
		if (enConstruct == "oui"){
			rep = "le batiment est en construction";
		}
		else {
			rep = "le batiment n'est pas en construction";
		}
		return rep;
	}
	
	//est ce que le batiment a été payé ?
	public String payéOuNon(){
		String rep = "";
		
		if  (payé == "non"){
			rep = "le batiment n'a pas été payé";
		}
		else{
			rep = "le batiment a été payé";
		}
		
		return rep;
	}
	
	

}
