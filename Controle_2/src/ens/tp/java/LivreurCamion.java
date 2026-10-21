package ens.tp.java;

public class LivreurCamion extends Livreur {
	private double tauxMajoration;


	public LivreurCamion(String identifiant, String nom, double tarifkm, double tauxMajoration) {
		super(identifiant, nom, tarifkm);
		this.tauxMajoration = tauxMajoration;
	}

	@Override
	public double calculerFrais(double distance){
		double MontantBase=tarifkm*distance;
		
		return MontantBase*(1+tauxMajoration);
	}

}
