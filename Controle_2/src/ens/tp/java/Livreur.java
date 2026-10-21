package ens.tp.java;

public abstract class Livreur {
	protected String identifiant ;
	protected String nom;
	protected double tarifkm;
	protected Livreur responsable;
	public Livreur(String identifiant, String nom, double tarifkm) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifkm = tarifkm;
	}
	

	public String getIdentifiant() {
		return identifiant;
	}

	
	public String getNom() {
		return nom;
	}

	public abstract  double calculerFrais(double distance);
	public void afficherDetails() {
		System.out.println("\nIdentifiant :"+identifiant+"  \nNom :"+nom+"\nTarifkm :"+tarifkm);
	}

	
	public Livreur getResponsable() {
		return responsable;
	}

	
	
	public void setResponsable(Livreur responsable) {
		this.responsable = responsable;
	}
	
	

}
