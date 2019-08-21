package bibliotheque;

public class Empruntable extends Livre implements HasCout {

    private int cout;
    
    public Empruntable(int isbn, Auteur auteur, Genre genre, 
            String resume, int cout) {
        super(isbn, auteur, genre, resume);
        this.cout = cout;
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
