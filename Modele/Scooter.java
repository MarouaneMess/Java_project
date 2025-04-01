package Modele;

import java.time.LocalDate;

public class Scooter {
    private static int compteurId = 0;
    private int id_scooter;
    private Modele modele;
    private LocalDate annee_sortie;
    private boolean disponible;
    private double km;
    private double prix_Jour;

 
    public Scooter(int id, Modele modele, LocalDate annee_sortie, boolean disponible, double km, double prix_Jour) {
        if (annee_sortie.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("L'année de sortie ne peut pas être future.");
        }
        if (km < 0) {
            throw new IllegalArgumentException("Le nombre de kilomètres ne peut pas être négatif.");
        }
        if (prix_Jour < 0) {
            throw new IllegalArgumentException("Le prix du jour ne peut pas être négatif.");
        }

        this.id_scooter = ++compteurId;
        this.modele = modele;
        this.annee_sortie = annee_sortie;
        this.disponible = disponible;
        this.km = km;
        this.prix_Jour = prix_Jour;
    
    }
    public int getId() {
        return id_scooter;
    }

    public Modele getModele() {
        return modele;
    }

    public LocalDate getAnneeSortie() {
        return annee_sortie;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public void setKm(double km) {
        if (km < 0) {
            throw new IllegalArgumentException("Le nombre de kilomètres ne peut pas être négatif.");
        }
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setPrixJour(double p) {
        if (p < 0) {
            throw new IllegalArgumentException("Le prix du jour ne peut pas être négatif.");
        }
        this.prix_Jour = p;
    }
    public double getPrixJour() {
        return prix_Jour;
    }
    public String toString() {
        return 
                "SCOOTER N° " + getId() +"\n" +
        "      - MODELE        : "  + getModele() + "\n" + 
        "      - ANNEE_DE_SORTIE : "  + getAnneeSortie() +"\n" +
        "      - KILOMETRAGE : " + getKm() +" Km "+"\n" +
        "      - PRIX_JOUR : " + getPrixJour() +" Euros "+"\n"+
        "      - EN LOCATION : " + (isDisponible() ? "OUI" : "NON") + "\n" +
           "----------------------------------------------------------------";
    }
        // save 

    
}