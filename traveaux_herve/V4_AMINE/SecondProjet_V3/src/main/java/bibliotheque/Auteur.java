package bibliotheque;

public class Auteur {
    
    private final String nom;
    private final String prenom;

    public Auteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Auteur{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
}
