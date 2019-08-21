package bibliotheque;

public class Poche extends Empruntable {
    
    
    public Poche(int isbn, Auteur auteur, Genre genre, String resume, int cout) {
        super(isbn, auteur, genre, resume, cout);
        this.livreEnum = LivreEnum.POCHE;
    }
    
}
