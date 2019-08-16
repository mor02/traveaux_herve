
package experimentation;

/**
 *
 * @author Hervé AD
 */
public class Auteur {
    
    private final String nom;
    private final String prenom;

// Ceci est un constructeur cad le format imposé pour Auteur à l'initialisation. Le constructeur
    // sert à initialiser (et formater) les valeurs utilisées dans Main 
    public Auteur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
// Ce constructeur va permettre de gérer les sorties pour que les valeurs soient affichées
    // en clair. Sinon on afficherait les adresses (pointeurs) des valeurs 
    @Override
    public String toString() {
        return "Auteur{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    
}
