package Modele;

public class Marque {
    private String nom;

    public Marque(String nom){
        if ( nom == null){
            throw new IllegalArgumentException("Nom de marque non valide");
        }
        this.nom = nom;
    }
    public void setNom(String nom){
        if (nom == null){
            throw new IllegalArgumentException("Nom de marque non valide");
        }
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }
    public String toString() {
        return "Marque : " + getNom();
    }

}
