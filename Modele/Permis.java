package Modele;

import java.time.LocalDate;
import java.util.Vector;

public class Permis {
    private int numeroPermis;
    private String categorie;
    private LocalDate dateSortie;
    private LocalDate dateExp;
    private Vector<Modele> modeles;
    private Vector<Client> clients;

    public Permis(int numeroPermis, String categorie, LocalDate dateSortie, LocalDate dateExp) {
        if (numeroPermis <= 0) {
            throw new IllegalArgumentException("Le numéro de permis doit être positif.");
        }
        if (categorie == null || categorie.trim().isEmpty()) {
            throw new IllegalArgumentException("La catégorie de permis ne peut pas être vide.");
        }
        if (dateSortie == null || dateSortie.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La date de sortie ne peut pas être future.");
        }
        if (dateExp != null && dateExp.isBefore(dateSortie)) {
            throw new IllegalArgumentException("La date d'expiration ne peut pas être avant la date de sortie.");
        }

        this.numeroPermis = numeroPermis;
        this.categorie = categorie;
        this.dateSortie = dateSortie;
        this.dateExp = dateExp;
        this.modeles = new Vector<>();
        this.clients = new Vector<>();
    }

    public void setNumeroPermis(int numeroPermis) {
        if (numeroPermis <= 0) {
            throw new IllegalArgumentException("Le numéro de permis doit être positif.");
        }
        this.numeroPermis = numeroPermis;
    }

    public int getNumeroPermis() {
        return numeroPermis;
    }

    public void setCategorie(String categorie) {
        if (categorie == null || categorie.trim().isEmpty()) {
            throw new IllegalArgumentException("La catégorie de permis ne peut pas être vide.");
        }
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }
    
    public void setDateSortie(LocalDate dateSortie) {
        if (dateSortie == null || dateSortie.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La date de sortie ne peut pas être future.");
        }
        this.dateSortie = dateSortie;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateExp(LocalDate dateExp) {
        if (dateExp != null) {
            if (dateSortie == null) {
                throw new IllegalArgumentException("La date de sortie doit être définie avant d'ajouter une date d'expiration.");
            }
            if (dateExp.isBefore(dateSortie)) {
                throw new IllegalArgumentException("La date d'expiration ne peut pas être avant la date de sortie.");
            }
        }
        this.dateExp = dateExp;
    }

    public LocalDate getDateExp() {
        return dateExp;
    }


    public boolean estExpire() {
        return dateExp != null && dateExp.isBefore(LocalDate.now());
    }

    
    public void ajouterModele(Modele m) {
        if (m == null) {
            throw new IllegalArgumentException("Le modèle ne peut pas être null.");
        }
        if (!modeles.contains(m)) {
            modeles.add(m);
        }
    }

    public Vector<Modele> getModeles() {
        return new Vector<>(modeles);
    }

    public void ajouterClient(Client c) {
        if (c == null) {
            throw new IllegalArgumentException("Le client ne peut pas être null.");
        }
        if (!clients.contains(c)) {
            clients.add(c);
        }
    }

    public Vector<Client> getClients() {
        return new Vector<>(clients);
    }

    public String toString() {
        return "      - NUMERO PERMIS     : " + getNumeroPermis() + "\n" +    
               "      - CATEGORIE         : " + getCategorie() + "\n" +
               "      - DATE SORTIE       : " + getDateSortie() + "\n" +
               "      - DATE EXPIRATION   : " + (getDateExp() != null ? getDateExp() : "Non expiré") + "\n" +
               "      - EST EXPIRE ?      : " + (estExpire() ? "Oui" : "Non") + "\n" +
               "------------------------------------------------------";
    }
}
