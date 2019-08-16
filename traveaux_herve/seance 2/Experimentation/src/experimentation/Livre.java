package experimentation;

/**
 *
 * @author Hervé AD
 */
public class Livre implements EtatEmprunt {

    public Auteur auteur;
    public String resume;
    public int etat;

    public Livre(Auteur auteur, String resume, int etat) {
        this.auteur = auteur;
        this.resume = resume;
        this.etat = etat;
        // "etat" indique si le livre est emprunté (0) ou empruntable (1)
    }

    @Override
    public void Emprunter() {
        // cad j'emprunte le livre
        System.out.println("Ce livre est désormais emprunté");
        // pour utilisation ultérieure
    }

    @Override
    public void Rendre() {
        // cad je rends le livre
        System.out.println("Ce livre est désormais disponible");
        // pour utilisation ultérieure
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getResume() {
        return resume;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int nouvelEtat) {
        etat = nouvelEtat;
    }

    public String toString() {
        return this.resume;
    }
}
