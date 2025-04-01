package Modele;

import java.time.LocalDate;

public class Permis {
    private String categorie;
    private LocalDate date_sortie;
    private LocalDate date_exp;

    // ajout ID pour le permis (a voir)

    public Permis(String categorie, LocalDate date_sortie, LocalDate date_exp) {
        if (categorie == null ) {
            throw new IllegalArgumentException("La catégorie de permis ne peut pas être vide.");
        }
        if (date_sortie == null || date_sortie.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La date de sortie ne peut pas être future.");
        }
        if (date_exp != null && date_exp.isBefore(date_sortie)) {
            throw new IllegalArgumentException("La date d'expiration ne peut pas être avant la date de sortie.");
        }
        this.categorie = categorie;
        this.date_sortie = date_sortie;
        this.date_exp = date_exp;
    }
    public void setCategorie(String categorie) {
        if (categorie == null ) {
            throw new IllegalArgumentException("La catégorie de permis ne peut pas être vide.");
        }
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }
    
    public void setDateSortie(LocalDate date_sortie) {
        if (date_sortie == null || date_sortie.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La date de sortie ne peut pas être future.");
        }
        this.date_sortie = date_sortie;
    }
    public LocalDate getDateSortie() {
        return date_sortie;
    }

    public void setDateExp(LocalDate date_exp) {
        if (date_exp != null && date_exp.isBefore(date_sortie)) {
            throw new IllegalArgumentException("La date d'expiration ne peut pas être avant la date de sortie.");
        }
        this.date_exp = date_exp;
    }

    public LocalDate getDateExp() {
        return date_exp;
    }

    public String toString() {
        return //"PERMIS N°" + id + "\n" +
        "      - CATEGORIE  : " + getCategorie() + "\n" +
        "      - DATE SORTIE : " + getDateSortie() + "\n" +
        "      - DATE EXPIRATION : " + (getDateExp() != null ? getDateExp() : "Non expiré") + "\n" +
        "------------------------------------------------------";
    }
}
