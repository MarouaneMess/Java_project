package Modele;

import java.time.LocalDate;
import java.util.Vector;

public class Client {
    private static int compteurId = 0; 
    private int id;
    private String nom;
    private String prenom;
    private LocalDate date_naissance;
    private String adresse;
    private Vector<Permis> permis;
    private Vector<Location> locations;

    public Client(String nom, String prenom, LocalDate date_naissance, String adresse) {
        if (nom == null ) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide.");
        }
        if (prenom == null ) {
            throw new IllegalArgumentException("Le prénom ne peut pas être vide.");
        }
        if (date_naissance == null || date_naissance.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La date de naissance ne peut pas être future.");
        }
        if (adresse == null || adresse.trim().isEmpty()) {
            throw new IllegalArgumentException("L'adresse ne peut pas être vide.");
        }

        this.id = ++compteurId;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.adresse = adresse;
        this.permis = new Vector<>();
        this.locations = new Vector<>();
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        if (nom == null ) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide.");
        }
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        if (prenom == null ) {
            throw new IllegalArgumentException("Le prénom ne peut pas être vide.");
        }
        this.prenom = prenom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setDateNaissance(LocalDate date_naissance) {
        if (date_naissance == null || date_naissance.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La date de naissance ne peut pas être future.");
        }
        this.date_naissance = date_naissance;
    }
    public LocalDate getDateNaissance() {
        return date_naissance;
    }
    public int getAge(){
        return LocalDate.now().getYear() - date_naissance.getYear();
    }

    public void setAdresse(String adresse) {
        if (adresse == null || adresse.trim().isEmpty()) {
            throw new IllegalArgumentException("L'adresse ne peut pas être vide.");
        }
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }
     public void setPermis(Vector<Permis> permis) {
        this.permis = permis;
    }

    public Vector<Permis> getPermis() {
        return new Vector<>(permis);
    }
    public void setLocaiton(Vector<Location> loc) {
        this.locations = loc;
    }

    public Vector<Location> getLocations() {
        return new Vector<>(locations);
    }

    public void ajouterPermis(Permis p) {
        if (p == null) {
            throw new IllegalArgumentException("Le permis ne peut pas être null.");
        }
        this.permis.add(p);
    }

    public void supprimerPermis(Permis p) {
        this.permis.remove(p);
    }

    public void ajouterLocation(Location loc) {
        if (loc == null) {
            throw new IllegalArgumentException("La location ne peut pas être null.");
        }
        this.locations.add(loc);
    }

    public void supprimerLocation(Location loc) {
        this.locations.remove(loc);
    }


    public String toString() {
        return "CLIENT N°" + id + "\n" +
               "      - NOM         : " + getNom() + "\n" +
               "      - PRÉNOM      : " + getPrenom()+ "\n" +
               "      - AGE         : " + getAge() + "\n" +
               "      - ADRESSE     : " + getAdresse() + "\n" +
               "      - PERMIS      : " + (permis.isEmpty() ? "Aucun" : permis) + "\n" +
               "      - LOCATIONS   : " + (locations.isEmpty() ? "Aucune" : locations) + "\n" +
               "------------------------------------------------------";
    }
}
