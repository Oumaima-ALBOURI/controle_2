package ens.tp.java;

public class Main {
    public static void main(String[] args) {


        LivreurMoto m1 = new LivreurMoto("M1", "Ahmed", 10, 4);
        LivreurMoto m2 = new LivreurMoto("M2", "Youssef", 8, 2);

       
        LivreurCamion c1 = new LivreurCamion("C1", "Ali", 15, 0.20);
        LivreurCamion c2 = new LivreurCamion("C2", "Omar", 12, 0.10);

        
        Livreur[] livreurs = {m1, m2, c1, c2};

        
        Commande cmd1 = new Commande("CMD1", "Marrakech");
        Commande cmd2 = new Commande("CMD2", "Casablanca");
        
       
        System.out.println("    LISTE DES LIVREURS ");

        for (Livreur l : livreurs) {
            l.afficherDetails();

            if (l.getResponsable() != null) {
                System.out.println(
                    "Responsable : " + l.getResponsable().getNom()
                );
            } else {
                System.out.println("Responsable : Aucun");
            }

            
        }

        
        Livraison liv1 = new Livraison(m1, cmd1, 30);
        Livraison liv2 = new Livraison(m2, cmd2, 20);
        Livraison liv3 = new Livraison(c1, cmd1, 40);
        Livraison liv4 = new Livraison(c2, cmd2, 50);

        
        Livraison[] livraisons = {liv1, liv2, liv3, liv4};

        
        double total = 0;

        System.out.println("\n  RECAPITULATIF DES LIVRAISONS ");

        for (Livraison l : livraisons) {
            l.afficherRecapitulatif();
            total += l.calculerMontant();
        }

        System.out.println("Montant total : " + total + " DH");

       
       
    }
}