package Modele;

import java.util.Vector;

public class Modele {
    private String nom;
    private Marque marque;
    private int puissance; // en chevaux
    private Vector<Permis> permis; // Liste des permis nécessaires
    private Vector<Scooter> scooters; // Liste des scooters associés

    public Modele(String nom, Marque marque, int puissance) {
        if (puissance <= 0) {
            throw new IllegalArgumentException("La puissance doit être positive.");
        }
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du modèle ne peut pas être vide.");
        }
        if (marque == null) {
            throw new IllegalArgumentException("La marque ne peut pas être null.");
        }

        this.nom = nom;
        this.marque = marque;
        this.puissance = puissance;
        this.permis = new Vector<>(); 
        this.scooters = new Vector<>();
    }

    //jsp si on aura besoin de setters pour nom car le nom ne change pas sauf si l'entreprise le fait 
    // public void setNom(String nom) {
    //     if (nom == null || nom.isEmpty()) {
    //         throw new IllegalArgumentException("Le nom du modèle ne peut pas être vide.");
    //     }
    //     this.nom = nom;
    // }

    public String getNom() {
        return nom;
    }

    public void setMarque(Marque marque) {
        if (marque == null) {
            throw new IllegalArgumentException("La marque ne peut pas être null.");
        }
        this.marque = marque;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setPuissance(int puissance) {
        if (puissance <= 0) {
            throw new IllegalArgumentException("La puissance doit être positive.");
        }
        this.puissance = puissance;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPermis(Vector<Permis> permis) {
        if (permis == null || permis.isEmpty()) {
            throw new IllegalArgumentException("Un modèle doit être associé à au moins un type de permis.");
        }
        this.permis = new Vector<>(permis);
    }

    public Vector<Permis> getPermis() {
        return new Vector<>(permis);
    }

    public void ajouterPermis(Permis p) {
        if (p == null) {
            throw new IllegalArgumentException("Le permis ne peut pas être null.");
        }
        this.permis.add(p);
    }

    public void setScooters(Vector<Scooter> scooters) {
        if (scooters == null) {
            throw new IllegalArgumentException("La liste des scooters ne peut pas être null.");
        }
        this.scooters = new Vector<>(scooters);
    }

    public Vector<Scooter> getScooters() {
        return new Vector<>(scooters);
    }

    public void ajouterScooter(Scooter s) {
        if (s == null) {
            throw new IllegalArgumentException("Le scooter ne peut pas être null.");
        }
        this.scooters.add(s);
    }

    public String toString() {
        return 
                nom + "\n" +
        "          - MARQUE      : " + marque.getNom() + "\n" +
        "          - PUISSANCE   : " + getPuissance() + " CV\n" +
        "          - PERMIS REQUIS : " + permis.toString() + "\n" +
        "------------------------------------------------------";
    }
}
