package bibliotheque;
// On ajoute une seconde interface : UtilisateurDefinition
public class Empruntable extends Livre implements HasCout, UtilisateurDefinition {

    private int cout;
    
    public Empruntable(int isbn, Auteur auteur, Genre genre, String resume, int cout) {
        super(isbn, auteur, genre, resume);
        this.cout = cout;
    }    
    // Implementation des méthodes de l'interface UtilisateurDefinition
    public void emprunter(Empruntable empruntable){ 
        System.out.println("TEST Est emprunté");
        // Trouver la valeur à changer (IsEmpruntable à false) ?
                }
    public void rendre(Empruntable empruntable){
                System.out.println("TEST Est rendu");
                // Trouver la valeur à changer (IsEmpruntable à true) ?
    }
    
    
    // Si passage par Empruntable => mise par défaut à vrai de IsEmpruntable 
    @Override
    public boolean isEmpruntable() {
        return true;
    }    

    @Override
    public int getCout() {
        return cout;
    }

    @Override
    public void setCout(int cout) {
        this.cout = cout;
    }
}
