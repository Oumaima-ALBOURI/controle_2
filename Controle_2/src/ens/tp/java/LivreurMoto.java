package ens.tp.java;

public class LivreurMoto extends Livreur {
	private int anciennete;

	public LivreurMoto(String identifiant, String nom, double tarifkm , int anciennete) {
		super(identifiant, nom, tarifkm);
		this.anciennete= anciennete;
	}

	@Override
	public double calculerFrais(double distance) {
		if(anciennete < 3) {
			return tarifkm * distance ;
		}
		else return (tarifkm *( distance*2) );
		
	}

}
