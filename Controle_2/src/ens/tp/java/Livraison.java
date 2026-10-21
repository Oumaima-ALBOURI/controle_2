package ens.tp.java;

public class Livraison {
	private Livreur livreur;
	private Commande commande;
	private double  distance;
	public Livraison(Livreur livreur, Commande commande, double distance) {
		super();
		this.livreur = livreur;
		this.commande = commande;
		this.distance = distance;
	}
	public double  calculerMontant() {
		return livreur.calculerFrais(distance);
		
	}
	public void afficherRecapitulatif() {
		 System.out.println("  Recapitulatif de location ");
	        System.out.println(" Commande: " + commande);
	        System.out.println(" Livreur :");
	        livreur.afficherDetails();;
	        System.out.println("Distance : " +distance+ " km");
	        System.out.println("Montant total : "
	                           + calculerMontant() + " DH");
	        System.out.println();
	}

}
