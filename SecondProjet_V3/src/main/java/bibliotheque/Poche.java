package bibliotheque;

public class Poche extends Empruntable {
    
    
    public Poche(int isbn, Auteur auteur, Genre genre, String resume, int cout) {
        super(isbn, auteur, genre, resume, cout);
        // On ajoute par polymorphisme le genoche définie dans la classe Livre
        this.livreEnum = LivreEnum.POCHE;
    }
    
}
