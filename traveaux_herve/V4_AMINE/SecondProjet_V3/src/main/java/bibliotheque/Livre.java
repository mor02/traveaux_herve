package bibliotheque;

public abstract class Livre {

    public enum LivreEnum {
        POCHE,
        BD,
        NUMERIQUE,
        NORMAL
    }

    private final int isbn;
    private final Auteur auteur;
    private final Genre genre;
    private final String resume;
    protected LivreEnum livreEnum;
    private boolean isEmpruntable;

    
    public Livre(int isbn, Auteur auteur, Genre genre, String resume) {
        this.isbn = isbn;
        this.auteur = auteur;
        this.genre = genre;
        this.resume = resume;
    }
    
    /*public boolean isEmpruntable() {
        return false;        
    }
    */

    public LivreEnum getLivreEnum() {
        return livreEnum;
    }

    public void setLivreEnum(LivreEnum livreEnum) {
        this.livreEnum = livreEnum;
    }

    public boolean isIsEmpruntable() {
        return isEmpruntable;
    }

    public void setIsEmpruntable(boolean isEmpruntable) {
        this.isEmpruntable = isEmpruntable;
    }
    

    public int getIsbn() {
        return isbn;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getResume() {
        return resume;
    }
    
}
